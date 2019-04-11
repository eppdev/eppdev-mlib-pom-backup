/* FileName: _EppdevMlibPropertyRule.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.rule.entity.auto;

import cn.eppdev.mlib.reg.logistic.commons.entity.BasicEntity;

/**
 * _eppdev_mlib_property_rule对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevMlibPropertyRule extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for var_rule_id
    public static final String COLUMN_VAR_RULE_ID_ = "var_rule_id";
    public static final String COLUMN_VAR_RULE_ID_ASC_ = "var_rule_id asc";
    public static final String COLUMN_VAR_RULE_ID_DESC_ = "var_rule_id desc";

    // static properties for property_name
    public static final String COLUMN_PROPERTY_NAME_ = "property_name";
    public static final String COLUMN_PROPERTY_NAME_ASC_ = "property_name asc";
    public static final String COLUMN_PROPERTY_NAME_DESC_ = "property_name desc";

    // static properties for property_value
    public static final String COLUMN_PROPERTY_VALUE_ = "property_value";
    public static final String COLUMN_PROPERTY_VALUE_ASC_ = "property_value asc";
    public static final String COLUMN_PROPERTY_VALUE_DESC_ = "property_value desc";

    // static properties for property_range
    public static final String COLUMN_PROPERTY_RANGE_ = "property_range";
    public static final String COLUMN_PROPERTY_RANGE_ASC_ = "property_range asc";
    public static final String COLUMN_PROPERTY_RANGE_DESC_ = "property_range desc";



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for var_rule_id
    private String varRuleId;

    // properties for property_name
    private String propertyName;

    // properties for property_value
    private String propertyValue;

    // properties for property_range
    private String propertyRange;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for var_rule_id
    public String getVarRuleId() {
        return varRuleId;
    }

    // getters for property_name
    public String getPropertyName() {
        return propertyName;
    }

    // getters for property_value
    public String getPropertyValue() {
        return propertyValue;
    }

    // getters for property_range
    public String getPropertyRange() {
        return propertyRange;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for var_rule_id
    public void setVarRuleId(String varRuleId) {
        this.varRuleId = varRuleId;
    }

    // getters for property_name
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    // getters for property_value
    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    // getters for property_range
    public void setPropertyRange(String propertyRange) {
        this.propertyRange = propertyRange;
    }

}
