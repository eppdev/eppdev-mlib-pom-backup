/* FileName: LrDummyVarUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By 996 License 1.0
 */

package cn.eppdev.mlib.reg.logistic.core.util;

import cn.eppdev.mlib.entity.PropertyData;
import cn.eppdev.mlib.reg.logistic.core.rule.LrDummyVarRule;
import cn.eppdev.mlib.reg.logistic.core.rule.LrPropertyRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 哑变量生成工具类
 * @author jinlong.hao
 */
public class LrDummyVarUtils {
    static Logger logger = LoggerFactory.getLogger(LrDummyVarUtils.class);

    static  final String INTERCEPTOR = "INTERCEPTOR";

    public static Set<String> getDummyVar(Map<String, PropertyData> propertyDataMap,
                                   List<LrDummyVarRule> varRuleList) {
        Set<String> resultSet = new HashSet<>();
        for (LrDummyVarRule dummyVarRule : varRuleList) {
            if (checkRules(propertyDataMap, dummyVarRule.getPropertyRuleList())) {
                resultSet.add(dummyVarRule.getDummyVarName());
            }
        }
        resultSet.add(INTERCEPTOR);
        return resultSet;
    }

    /**
     * 判断是否符合此判断规则，任意一条规则不符合，则返回不符合
     * @param propertyDataMap 要判断的对象结果
     * @param propertyRuleList 规则列表
     * @return 是否符合此规则列表
     */
    private static boolean checkRules(Map<String, PropertyData> propertyDataMap,
                               List<LrPropertyRule> propertyRuleList) {
        for (LrPropertyRule propertyRule: propertyRuleList) {
            String propertyName = propertyRule.getPropertyName();
            if (propertyDataMap.containsKey(propertyName)){
                if (!propertyRule.checkValue(propertyDataMap.get(propertyName))){
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

//
//
//    /**
//     * 单条规则的判断，主要分两部分：<br />
//     * <ul>
//     *     <li>1. 针对相等，startWith, endWith, contains等规则，只要符合任何一条即返回true</li>
//     *     <li>2. 对于判断区间分段，只要有任意一条没有满足的数据，则返回false</li>
//     * </ul>
//     * @param propertyData 要判断的数据对象
//     * @param propertyRule 判断规则
//     * @return 数据是否符合规则
//     */
//    private static boolean checkPropertyRule(PropertyData propertyData,
//                                      LrPropertyRule propertyRule){
//
//        /**
//         * 一、判断相等，startWith，endWith，contains等等，只要有一条满足即返回
//         */
//        // 1. 判断相等，有一个相等即可
//        if (propertyRule.getEqualValue() != null && propertyRule.getEqualValue().trim().length() > 0) {
//            for (String str: propertyData.getStringValueSet()) {
//                if (propertyRule.getEqualValue().equals(str)){
//                    return true;
//                }
//            }
//            for (Number number: propertyData.getNumberValueSet()){
//                if (propertyRule.getEqualValue().equals(number.toString())){
//                    return true;
//                }
//            }
//        }
//
//        // 判断startWith
//        if (propertyRule.getStartWithValue() != null && propertyRule.getStartWithValue().trim().length() > 0) {
//            for (String str: propertyData.getStringValueSet()) {
//                if (str != null && str.startsWith(propertyRule.getStartWithValue())){
//                    return true;
//                }
//            }
//        }
//
//        // 判断endWith
//        if (propertyRule.getEndWithValue() != null && propertyRule.getEndWithValue().trim().length() > 0) {
//            for (String str: propertyData.getStringValueSet()) {
//                if (str != null && str.endsWith(propertyRule.getEndWithValue())){
//                    return true;
//                }
//            }
//        }
//
//        // 判断contains
//        if (propertyRule.getContainsValue() != null && propertyRule.getContainsValue().trim().length() > 0 ) {
//            for (String str: propertyData.getStringValueSet()) {
//                if (str != null && str.contains(propertyRule.getContainsValue())){
//                    return true;
//                }
//            }
//        }
//
//
//        /**
//         * 二、判断区间，只要规则存在，必须全部满足方可返回
//         * 2.1 判断 <=
//         * 2.2 判断 <
//         * 2.3 判断 >=
//         * 2.4 判断 >
//         */
//        // 2.1 <=
//        boolean rangeMaxWithEqual = false;
//        if (propertyRule.getRangeMaxWithEqual() != null) {
//            if (propertyData.getNumberValueSet().size() > 0){
//                for (Number number: propertyData.getNumberValueSet()){
//                    if (number.doubleValue() <= propertyRule.getRangeMaxWithEqual()){
//                        rangeMaxWithEqual = true;
//                    }
//                }
//
//            } else if (propertyData.getStringValueSet().size() > 0){
//                for (String str : propertyData.getStringValueSet()) {
//                    try {
//                        Double d = Double.parseDouble(str);
//                        if (d <= propertyRule.getRangeMaxWithEqual()) {
//                            rangeMaxWithEqual = true;
//                        }
//                    } catch (NumberFormatException e){
//                        logger.info("Cannot parse {} to double", str);
//
//                    }
//                }
//            } else {
//                return false;
//            }
//            if (rangeMaxWithEqual == false){
//                return false;
//            }
//        }
//
//
//        // 2.2 <
//        boolean rangeMaxWithoutEqual = false;
//        if (propertyRule.getRangeMaxWithoutEqual() != null) {
//            if (propertyData.getNumberValueSet().size() > 0){
//                for (Number number: propertyData.getNumberValueSet()){
//                    if (number.doubleValue() < propertyRule.getRangeMaxWithoutEqual()){
//                        rangeMaxWithoutEqual = true;
//                    }
//                }
//
//            } else if (propertyData.getStringValueSet().size() > 0){
//                for (String str : propertyData.getStringValueSet()) {
//                    try {
//                        Double d = Double.parseDouble(str);
//                        if (d < propertyRule.getRangeMaxWithoutEqual()) {
//                            rangeMaxWithoutEqual = true;
//                        }
//                    } catch (NumberFormatException e){
//                        logger.info("Cannot parse {} to double", str);
//
//                    }
//                }
//            } else {
//                return false;
//            }
//            if (rangeMaxWithoutEqual == false){
//                return false;
//            }
//        }
//
//
//        // 2.3 >=
//        boolean rangeMinWithEqual = false;
//        if (propertyRule.getRangeMinWithEqual() != null) {
//            if (propertyData.getNumberValueSet().size() > 0){
//                for (Number number: propertyData.getNumberValueSet()){
//                    if (number.doubleValue() >= propertyRule.getRangeMinWithEqual()){
//                        rangeMinWithEqual = true;
//                    }
//                }
//
//            } else if (propertyData.getStringValueSet().size() > 0){
//                for (String str : propertyData.getStringValueSet()) {
//                    try {
//                        Double d = Double.parseDouble(str);
//                        if (d >= propertyRule.getRangeMinWithEqual()) {
//                            rangeMinWithEqual = true;
//                        }
//                    } catch (NumberFormatException e){
//                        logger.info("Cannot parse {} to double", str);
//
//                    }
//                }
//            } else {
//                return false;
//            }
//            if (rangeMinWithEqual == false){
//                return false;
//            }
//        }
//
//        // 2.4 >
//        boolean rangeMinWithoutEqual = false;
//        if (propertyRule.getRangeMinWithEqual() != null) {
//            if (propertyData.getNumberValueSet().size() > 0){
//                for (Number number: propertyData.getNumberValueSet()){
//                    if (number.doubleValue() > propertyRule.getRangeMinWithEqual()){
//                        rangeMinWithoutEqual = true;
//                    }
//                }
//
//            } else if (propertyData.getStringValueSet().size() > 0){
//                for (String str : propertyData.getStringValueSet()) {
//                    try {
//                        Double d = Double.parseDouble(str);
//                        if (d > propertyRule.getRangeMinWithEqual()) {
//                            rangeMinWithoutEqual = true;
//                        }
//                    } catch (NumberFormatException e){
//                        logger.info("Cannot parse {} to double", str);
//
//                    }
//                }
//            } else {
//                return false;
//            }
//            if (rangeMinWithoutEqual == false){
//                return false;
//            }
//        }
//        return true;
//    }
}
