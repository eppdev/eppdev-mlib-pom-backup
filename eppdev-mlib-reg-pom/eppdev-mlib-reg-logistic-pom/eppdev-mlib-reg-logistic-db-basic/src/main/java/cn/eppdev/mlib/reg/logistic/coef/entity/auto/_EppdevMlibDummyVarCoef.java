/* FileName: _EppdevMlibDummyVarCoef.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.coef.entity.auto;

import cn.eppdev.mlib.reg.logistic.commons.entity.BasicEntity;

/**
 * _eppdev_mlib_dummy_var_coef对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevMlibDummyVarCoef extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for model_id
    public static final String COLUMN_MODEL_ID_ = "model_id";
    public static final String COLUMN_MODEL_ID_ASC_ = "model_id asc";
    public static final String COLUMN_MODEL_ID_DESC_ = "model_id desc";

    // static properties for dummy_var_name
    public static final String COLUMN_DUMMY_VAR_NAME_ = "dummy_var_name";
    public static final String COLUMN_DUMMY_VAR_NAME_ASC_ = "dummy_var_name asc";
    public static final String COLUMN_DUMMY_VAR_NAME_DESC_ = "dummy_var_name desc";

    // static properties for coef
    public static final String COLUMN_COEF_ = "coef";
    public static final String COLUMN_COEF_ASC_ = "coef asc";
    public static final String COLUMN_COEF_DESC_ = "coef desc";



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for model_id
    private String modelId;

    // properties for dummy_var_name
    private String dummyVarName;

    // properties for coef
    private Double coef;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for model_id
    public String getModelId() {
        return modelId;
    }

    // getters for dummy_var_name
    public String getDummyVarName() {
        return dummyVarName;
    }

    // getters for coef
    public Double getCoef() {
        return coef;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for model_id
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    // getters for dummy_var_name
    public void setDummyVarName(String dummyVarName) {
        this.dummyVarName = dummyVarName;
    }

    // getters for coef
    public void setCoef(Double coef) {
        this.coef = coef;
    }

}
