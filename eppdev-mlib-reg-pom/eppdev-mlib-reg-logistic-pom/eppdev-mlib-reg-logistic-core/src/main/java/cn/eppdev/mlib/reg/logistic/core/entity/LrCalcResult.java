/* FileName: LrCalcResult.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By 996 License 1.0
 */

package cn.eppdev.mlib.reg.logistic.core.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 逻辑回归的计算结果
 * @author jinlong.hao
 */
public class LrCalcResult {

    /**
     * 逻辑回归的计算结果（概率值）
     */
    private Double lrResult;

    /**
     * 逻辑回归计算结果分段的结果
     */
    private Integer score;



    public Double getLrResult() {
        return lrResult;
    }

    public void setLrResult(Double lrResult) {
        this.lrResult = lrResult;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
