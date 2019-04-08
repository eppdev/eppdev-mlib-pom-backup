/* FileName: LrResultDivideUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By 996 License 1.0
 */

package cn.eppdev.mlib.reg.logistic.core.util;

import cn.eppdev.mlib.commons.EppdevMlibException;
import cn.eppdev.mlib.reg.logistic.core.rule.LrResultDivideRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author jinlong.hao
 */
public class LrResultDivideUtils {
    static Logger logger = LoggerFactory.getLogger(LrResultDivideUtils.class);


    /**
     * 进行分段，将分段结果
     * @param ruleList
     * @param lrResult
     * @return 分段结果
     */
    public static Integer divide(List<LrResultDivideRule> ruleList,
                                 double lrResult) throws EppdevMlibException {
        for (LrResultDivideRule rule: ruleList) {
            if (rule.checkValue(lrResult)){
                return rule.getScore();
            }
        }
        throw  new EppdevMlibException(lrResult + ": 分段规则错误，无有效分段");
    }
}
