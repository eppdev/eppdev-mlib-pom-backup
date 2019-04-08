/* FileName: PropertyParserUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By 996 License 1.0
 */

package cn.eppdev.mlib.util;

import cn.eppdev.mlib.entity.PropertyData;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * JavaBean/Json属性的解析类，用于将数据解析成便于生成哑变量的格式
 * @author jinlong.hao
 */
public class PropertyParserUtils {
    static Logger logger = LoggerFactory.getLogger(PropertyParserUtils.class);

    static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * JavaBean的解析类，通过对JavaBean进行解析处理，生成Map对象，
     * key为层层的property，如"a.b.c"，value是可以有的结果列表<br />
     * Sample Data： <br />
     * <pre>
     *     {
     *         "name": "张三",
     *         "age": 24,
     *         "score": [
     *              {
     *                  "english": 24
     *              },
     *              {
     *                  "chinese": 15
     *              }
     *         ],
     *         "interests": [
     *              "上网",
     *              "旅游"
     *         ],
     *         "classes": [
     *              {
     *                  "name": "语文",
     *                  "teacher": "李四"
     *              }
     *              {
     *                  "name": "数学"
     *                  "teacher": "王五"
     *              }
     *         ]
     *     }
     * </pre>
     *
     * 处理结果: <br />
     * <pre>
     *     {
     *         "name": {
     *             "stringValueSet": ["张三"]
     *         },
     *         "age": {
     *             "numberValueSet": [24]
     *         },
     *         "score.english": {
     *             "numberValueSet": [24]
     *         },
     *         "score.chinese": {
     *             "numberValueSet": ["15"]
     *         },
     *         "interests": {
     *             "stringValueSet": ["上网","旅游"]
     *         },
     *         "classes.name": {
     *             "stringValueSet": ["语文","数学"]
     *         },
     *         "classes.teacher": {
     *             "stringValueSet": ["李四", "王五"]
     *         }
     *     }
     * </pre>
     * @param bean
     * @return
     */
    public static Map<String, PropertyData> parse(Object bean) throws IOException {
        return parse(objectMapper.writeValueAsString(bean));
    }


    /**
     * Json的解析类，通过对Json进行解析处理，生成Map对象，
     * key为层层的property，如"a.b.c"，value是可以有的结果列表<br />
     * Sample Data： <br />
     * <pre>
     *     {
     *         "name": "张三",
     *         "age": 24,
     *         "score": [
     *              {
     *                  "english": 24
     *              },
     *              {
     *                  "chinese": 15
     *              }
     *         ],
     *         "interests": [
     *              "上网",
     *              "旅游"
     *         ],
     *         "classes": [
     *              {
     *                  "name": "语文",
     *                  "teacher": "李四"
     *              }
     *              {
     *                  "name": "数学"
     *                  "teacher": "王五"
     *              }
     *         ]
     *     }
     * </pre>
     *
     * 处理结果: <br />
     * <pre>
     *     {
     *         "name": {
     *             "stringValueSet": ["张三"]
     *         },
     *         "age": {
     *             "numberValueSet": [24]
     *         },
     *         "score.english": {
     *             "numberValueSet": [24]
     *         },
     *         "score.chinese": {
     *             "numberValueSet": ["15"]
     *         },
     *         "interests": {
     *             "stringValueSet": ["上网","旅游"]
     *         },
     *         "classes.name": {
     *             "stringValueSet": ["语文","数学"]
     *         },
     *         "classes.teacher": {
     *             "stringValueSet": ["李四", "王五"]
     *         }
     *     }
     * </pre>
     * @param jsonString 要解析的json字符串
     * @return
     */
    public static Map<String, PropertyData> parse(String jsonString) throws IOException {
        JsonNode jsonNode = objectMapper.readTree(jsonString);
        return parse(jsonNode);
    }


    /**
     * 通过递归，将JsonNode对象解析为Map&lt;String, PropertyData&gt; ，主要逻辑为：<br />
     * <ul>
     *     <li>1. 若jsonNode一个array，则将各自解析的结果进行合并</li>
     *     <li>2. 若jsonNode是一个正常的json，则将其分别处理，如果是最后一层则直接put到resultMap中</li>
     * </ul>
     * @param jsonNode
     * @return
     */
    public static Map<String, PropertyData> parse(JsonNode jsonNode) {
        Map<String, PropertyData> resultMap = new HashMap<>();
        /**
         * 一、判断是否是array对象
         * 1.1 获取各自的处理结果
         * 1.2 合并处理结果
         */
        if (jsonNode.isArray()){
            Iterator<JsonNode> iterator = jsonNode.iterator();
            while (iterator.hasNext()) {
                // 1.1 获取各自的处理结果
                Map<String, PropertyData> map = parse(iterator.next());
                // 1.2 对结果进行合并
                Set<Map.Entry<String, PropertyData>> entrySet = map.entrySet();
                for (Map.Entry<String, PropertyData> entry: entrySet) {
                    String key = entry.getKey();
                    // 1.2.1 非重复的结果，直接put到结果中
                    if (!resultMap.containsKey(key)){
                        resultMap.put(key, entry.getValue());
                    }
                    // 1.2.2 重复结果，需要进行合并
                    else {
                        resultMap.get(key).getNumberValueSet().addAll(entry.getValue().getNumberValueSet());
                        resultMap.get(key).getStringValueSet().addAll(entry.getValue().getStringValueSet());
                    }
                }
            }
        }
        /**
         * 二、对于非array对象，依次进行处理：<br />
         * 2.1 若各个属性值为nodeValue，则直接put到resultMap中
         * 2.2 若属性值为array，并且array中的节点为nodeValue，则同样put到resultMap中
         * 2.3 若各个属性值非最后一层，则进行递归调用，将key添加的原来的key前面，put到resultMap中
         */
        else {
            Iterator<Map.Entry<String, JsonNode>> iterator = jsonNode.fields();
            while (iterator.hasNext()){
                Map.Entry<String, JsonNode> entry = iterator.next();
                // 2.1 若是nodeValue，直接put到resultMap中
                if (entry.getValue().isValueNode()){
                    PropertyData propertyData = new PropertyData();
                    if (entry.getValue().isNumber()){
                        propertyData.getNumberValueSet().add(entry.getValue().numberValue());
                    } else {
                        propertyData.getStringValueSet().add(entry.getValue().textValue());
                    }
                    resultMap.put(entry.getKey(), propertyData);
                }
                // 2.2 若是nodeValue的array，如果是nodeValue的Array，则进行处理
                else if (entry.getValue().isArray()){
                    Iterator<JsonNode> arrayIterator = entry.getValue().iterator();
                    PropertyData propertyData = new PropertyData();
                    while (arrayIterator.hasNext()){
                        JsonNode node2 = arrayIterator.next();
                        if (node2.isValueNode()){ // 是valueNode
                            if (node2.isNumber()){
                                propertyData.getNumberValueSet().add(node2.numberValue());
                            } else {
                                propertyData.getStringValueSet().add(node2.textValue());
                            }
                        } else { // valueNode
                            Map<String, PropertyData> map = parse(node2);
                            for (Map.Entry<String, PropertyData> entry2: map.entrySet()) {
                                String key = entry.getKey() + "." + entry2.getKey();
                                if (resultMap.containsKey(key)){
                                    resultMap.get(key).getStringValueSet().addAll(entry2.getValue().getStringValueSet());
                                    resultMap.get(key).getNumberValueSet().addAll(entry2.getValue().getNumberValueSet());
                                } else {
                                    resultMap.put(key, entry2.getValue());
                                }
                            }
                        }

                    }
                    if (propertyData.getStringValueSet().size() > 0
                            || propertyData.getNumberValueSet().size() > 0){
                        resultMap.put(entry.getKey(), propertyData);
                    }

                }
                // 2.3 对于一般子节点，将key添加到原来的key中，依次push到resultMap中
                else {
                    Map<String, PropertyData> map = parse(entry.getValue());
                    for (Map.Entry<String, PropertyData> entry2: map.entrySet()){
                        resultMap.put(entry.getKey() + "." + entry2.getKey(), entry2.getValue());
                    }
                }
            }
        }
        return resultMap;
    }

    /*
    public static void main(String[] args) throws IOException {
        long dateBegin = System.currentTimeMillis();
        for (int i=0; i<1000; i++) {
            String jsonStr = "{\"user1\": [{\"age\": 8}, {\"age\": 18}, {\"age\": 28}], \"interests\":[1, \"2\", 3]}";
            JsonNode jsonNode = objectMapper.readTree(jsonStr);
            System.out.println(objectMapper.writeValueAsString(parse(jsonNode)));
        }
        long dateEnd = System.currentTimeMillis();
        System.out.println(dateEnd - dateBegin);
    }
    */

}
