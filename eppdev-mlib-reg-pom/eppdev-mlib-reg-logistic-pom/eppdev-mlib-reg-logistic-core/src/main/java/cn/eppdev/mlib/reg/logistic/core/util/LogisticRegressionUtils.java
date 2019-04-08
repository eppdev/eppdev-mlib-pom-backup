/* FileName: LogisticRegressionUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By 996 License 1.0
 */

package cn.eppdev.mlib.reg.logistic.core.util;

import cn.eppdev.mlib.commons.EppdevMlibException;
import cn.eppdev.mlib.reg.logistic.core.coef.LrContiVarCoef;
import cn.eppdev.mlib.reg.logistic.core.coef.LrDummyVarCoef;
import cn.eppdev.mlib.entity.PropertyData;
import cn.eppdev.mlib.reg.logistic.core.rule.LrDummyVarRule;
import cn.eppdev.mlib.util.PropertyParserUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 逻辑回归运算的基础类，用于进行逻辑回归运算
 * @author jinlong.hao
 */
public class LogisticRegressionUtils {
    static Logger logger = LoggerFactory.getLogger(LogisticRegressionUtils.class);

    public static double calc(List<LrDummyVarRule> dummyVarRuleList,
                              List<LrDummyVarCoef> dummyVarCoefList,
                              List<LrContiVarCoef> contiVarCoefList,
                              Object... javaBean) throws EppdevMlibException {
        try {
            return calc(dummyVarRuleList,
                    dummyVarCoefList,
                    contiVarCoefList,
                    PropertyParserUtils.parse(javaBean));
        } catch (IOException e) {
            logger.error("Error: {}", e.getMessage());
            throw new EppdevMlibException(e.getMessage());
        }
    }

    public static double calc(List<LrDummyVarRule> dummyVarRuleList,
                              List<LrDummyVarCoef> dummyVarCoefList,
                              List<LrContiVarCoef> contiVarCoefList,
                              String jsonString) throws EppdevMlibException {
        try{
            return calc(dummyVarRuleList,
                    dummyVarCoefList,
                    contiVarCoefList,
                    PropertyParserUtils.parse(jsonString));
        } catch (IOException e){
            logger.error("Error: {}", e.getMessage());
            throw new EppdevMlibException(e.getMessage());
        }
    }

    public static double calc(List<LrDummyVarRule> dummyVarRules,
                              List<LrDummyVarCoef> dummyVarCoefList,
                              List<LrContiVarCoef> contiVarCoefList,
                              Map<String, PropertyData> propertyDataMap) throws EppdevMlibException {
        Set<String> dummyVarList = LrDummyVarUtils.getDummyVar(propertyDataMap, dummyVarRules);
        double totalCoef = LrDummyVarCoefUtils.calc(dummyVarList, dummyVarCoefList)
                + LrContiVarCoefUtils.calc(propertyDataMap, contiVarCoefList);
        return 1/(1+Math.exp(-totalCoef));
    }

}
