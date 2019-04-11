/* FileName: _EppdevMlibResultDivideRule.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.rule.entity.auto;

import cn.eppdev.mlib.reg.logistic.commons.entity.BasicEntity;

/**
 * _eppdev_mlib_result_divide_rule对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevMlibResultDivideRule extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for model_id
    public static final String COLUMN_MODEL_ID_ = "model_id";
    public static final String COLUMN_MODEL_ID_ASC_ = "model_id asc";
    public static final String COLUMN_MODEL_ID_DESC_ = "model_id desc";

    // static properties for result_range
    public static final String COLUMN_RESULT_RANGE_ = "result_range";
    public static final String COLUMN_RESULT_RANGE_ASC_ = "result_range asc";
    public static final String COLUMN_RESULT_RANGE_DESC_ = "result_range desc";

    // static properties for score
    public static final String COLUMN_SCORE_ = "score";
    public static final String COLUMN_SCORE_ASC_ = "score asc";
    public static final String COLUMN_SCORE_DESC_ = "score desc";



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for model_id
    private String modelId;

    // properties for result_range
    private String resultRange;

    // properties for score
    private Integer score;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for model_id
    public String getModelId() {
        return modelId;
    }

    // getters for result_range
    public String getResultRange() {
        return resultRange;
    }

    // getters for score
    public Integer getScore() {
        return score;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for model_id
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    // getters for result_range
    public void setResultRange(String resultRange) {
        this.resultRange = resultRange;
    }

    // getters for score
    public void setScore(Integer score) {
        this.score = score;
    }

}
