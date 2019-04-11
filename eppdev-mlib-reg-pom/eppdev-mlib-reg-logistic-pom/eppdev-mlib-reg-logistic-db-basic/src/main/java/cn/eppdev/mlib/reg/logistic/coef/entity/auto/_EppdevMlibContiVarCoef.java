/* FileName: _EppdevMlibContiVarCoef.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.coef.entity.auto;

import cn.eppdev.mlib.reg.logistic.commons.entity.BasicEntity;

/**
 * _eppdev_mlib_conti_var_coef对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevMlibContiVarCoef extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for model_id
    public static final String COLUMN_MODEL_ID_ = "model_id";
    public static final String COLUMN_MODEL_ID_ASC_ = "model_id asc";
    public static final String COLUMN_MODEL_ID_DESC_ = "model_id desc";

    // static properties for property_name
    public static final String COLUMN_PROPERTY_NAME_ = "property_name";
    public static final String COLUMN_PROPERTY_NAME_ASC_ = "property_name asc";
    public static final String COLUMN_PROPERTY_NAME_DESC_ = "property_name desc";

    // static properties for coef
    public static final String COLUMN_COEF_ = "coef";
    public static final String COLUMN_COEF_ASC_ = "coef asc";
    public static final String COLUMN_COEF_DESC_ = "coef desc";



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for model_id
    private String modelId;

    // properties for property_name
    private String propertyName;

    // properties for coef
    private Double coef;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for model_id
    public String getModelId() {
        return modelId;
    }

    // getters for property_name
    public String getPropertyName() {
        return propertyName;
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

    // getters for property_name
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    // getters for coef
    public void setCoef(Double coef) {
        this.coef = coef;
    }

}
