/* FileName: LrContiVarCoefUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By 996 License 1.0
 */

package cn.eppdev.mlib.reg.logistic.core.util;

import cn.eppdev.mlib.commons.EppdevMlibException;
import cn.eppdev.mlib.entity.PropertyData;
import cn.eppdev.mlib.reg.logistic.core.coef.LrContiVarCoef;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * @author jinlong.hao
 */
public class LrContiVarCoefUtils {
    static Logger logger = LoggerFactory.getLogger(LrContiVarCoefUtils.class);

    public static double calc(Map<String, PropertyData> propertyDataMap, List<LrContiVarCoef> coefList) throws EppdevMlibException {
        double result = 0.0;
        for (LrContiVarCoef coef: coefList) {
            PropertyData propertyData = propertyDataMap.get(coef.getPropertyName());
            if (propertyData.getNumberValueSet().size() > 1){
                throw new EppdevMlibException(coef.getPropertyName() + "属性对应多个值，不能作为连续型变量进行计算!");
            } else if (propertyData.getNumberValueSet().size() == 1) {
                result += coef.getCoef() * propertyData.getNumberValueSet().iterator().next().doubleValue();
            } else if (propertyData.getStringValueSet().size() > 1) {
                throw new EppdevMlibException(coef.getPropertyName() + "属性对应多个值，不能作为连续型变量进行计算!");
            } else if (propertyData.getStringValueSet().size() == 1) {
                result += 0;
            } else {
                try{
                   result += coef.getCoef() * Double.parseDouble(propertyData.getStringValueSet().iterator().next());
                } catch (NumberFormatException e){
                    throw new EppdevMlibException(coef.getPropertyName() + "("
                            + propertyData.getStringValueSet().iterator().next() + ")不能转换为数字：" + e.getMessage());
                }
            }
        }
        return result;
    }
}
