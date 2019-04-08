/* FileName: LogisticRegressionUtilsTest.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Apache License 2.0
 */

package cn.eppdev.mlib.reg.logistic.core;

import cn.eppdev.mlib.entity.PropertyData;
import cn.eppdev.mlib.reg.logistic.core.coef.LrDummyVarCoef;
import cn.eppdev.mlib.reg.logistic.core.coef.TestDummyVarCoef;
import cn.eppdev.mlib.reg.logistic.core.rule.LrDummyVarRule;
import cn.eppdev.mlib.reg.logistic.core.rule.LrPropertyRule;
import cn.eppdev.mlib.reg.logistic.core.rule.TestDummyVarRule;
import cn.eppdev.mlib.reg.logistic.core.rule.TestPropertyRule;
import cn.eppdev.mlib.reg.logistic.core.util.LrDummyVarCoefUtils;
import cn.eppdev.mlib.reg.logistic.core.util.LrDummyVarUtils;
import cn.eppdev.mlib.util.PropertyParserUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author jinlong.hao
 */
public class LogisticRegressionUtilsTest {
    static Logger logger = LoggerFactory.getLogger(LogisticRegressionUtilsTest.class);

    static String jsonStr = "{\n" +
            "\t\"age\": 24,\n" +
            "\t\"interestModel\": [\n" +
            "\t\t\"CS55\", \"哈弗H6\"\n" +
            "\t],\n" +
            "\t\"avgSpeed\": 13,\n" +
            "\t\"favors\": [\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"旅游\",\n" +
            "\t\t\t\"value\": 0.53\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"name\": \"自驾\",\n" +
            "\t\t\t\"value\": 0.32\n" +
            "\t\t}\n" +
            "\t],\n" +
            "\t\"school\": {\n" +
            "\t\t\"name\": \"重庆大学\",\n" +
            "\t\t\"city\": \"重庆市\"\n" +
            "\t}\n" +
            "}";

    private List<LrDummyVarRule> generateDummyVarRuleList() {
        // varName1: school_1
        LrPropertyRule propertyRule1 = new TestPropertyRule("school.name", 3);
        List<LrPropertyRule> propertyRuleList1 = new ArrayList<>();
        propertyRuleList1.add(propertyRule1);
        LrDummyVarRule dummyVarRule1 = new TestDummyVarRule("school_1", propertyRuleList1);

        // varName2: age_1
        LrPropertyRule propertyRule2 = new TestPropertyRule("age", 2);
        List<LrPropertyRule> propertyRuleList2 = new ArrayList<>();
        propertyRuleList2.add(propertyRule2);
        LrDummyVarRule dummyVarRule2 = new TestDummyVarRule("age_1", propertyRuleList2);

        // varName3: speed_1
        LrPropertyRule propertyRule3 = new TestPropertyRule("avgSpeed", 1);
        List<LrPropertyRule> propertyRuleList3 = new ArrayList<>();
        propertyRuleList3.add(propertyRule3);
        LrDummyVarRule dummyVarRule3 = new TestDummyVarRule("speed_1", propertyRuleList3);

        List<LrDummyVarRule> list = new ArrayList<>();
        list.add(dummyVarRule1);
        list.add(dummyVarRule2);
        list.add(dummyVarRule3);
        return list;
    }

    @Test
    public void testPropertyParser() throws IOException {
        Map<String, PropertyData> map = PropertyParserUtils.parse(jsonStr);
        Assert.assertEquals(7, map.size());
        Assert.assertEquals(2, map.get("favors.name").getStringValueSet().size());
    }


    @Test
    public void testDummyVar() throws IOException {
        List<LrDummyVarRule> list = generateDummyVarRuleList();
        Map<String, PropertyData> propertyDataMap = PropertyParserUtils.parse(jsonStr);
        Set<String> varSet = LrDummyVarUtils.getDummyVar(propertyDataMap, list);
        Assert.assertTrue(varSet.contains("school_1"));
        Assert.assertTrue(varSet.contains("age_1"));
        Assert.assertFalse(varSet.contains("speed_1"));
        System.out.println(varSet.toString());
    }


    @Test
    public void testCalcCoef() throws IOException {
        Map<String, PropertyData> propertyDataMap = PropertyParserUtils.parse(jsonStr);
        List<LrDummyVarCoef> dummyVarCoefList = new ArrayList<>();
        dummyVarCoefList.add(new TestDummyVarCoef("school_1", 2.0));
        dummyVarCoefList.add(new TestDummyVarCoef("age_1", 1.5));
        dummyVarCoefList.add(new TestDummyVarCoef("INTERCEPTOR", 3.0));
        dummyVarCoefList.add(new TestDummyVarCoef("speed_1", 3.0));
        double dummyVarCoefSum = LrDummyVarCoefUtils.calc(LrDummyVarUtils.getDummyVar(propertyDataMap, generateDummyVarRuleList()),
                dummyVarCoefList);
        Assert.assertEquals(6.5,
                dummyVarCoefSum,
                0);


    }


}
