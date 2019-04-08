/* FileName: LrDummyVarCoefUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By 996 License 1.0
 */

package cn.eppdev.mlib.reg.logistic.core.util;

import cn.eppdev.mlib.reg.logistic.core.coef.LrDummyVarCoef;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Set;

/**
 * 用来计算哑变量模型权重的计算结果
 * @author jinlong.hao
 */
public class LrDummyVarCoefUtils {
    static Logger logger = LoggerFactory.getLogger(LrDummyVarCoefUtils.class);

    public static double calc(Set<String> dummyVarList, List<LrDummyVarCoef> coefList) {
        double result = 0;
        for (LrDummyVarCoef coef: coefList) {
            if (dummyVarList.contains(coef.getDummyVarName())){
                result += coef.getCoef();
            }
        }
        return result;
    }
}
