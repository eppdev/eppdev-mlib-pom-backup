/* FileName: EppdevMlibPropertyRuleParam.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.rule.param.auto;

import cn.eppdev.mlib.reg.logistic.commons.param.BasicParam;

/**
 * _eppdev_mlib_property_rule对应的基础参数类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevMlibPropertyRuleParam extends BasicParam {

    /* ***********************************************
     * properties
     * **********************************************/
    // properties for id
    private String id;
    private java.util.List<String> _inIdList;

    // properties for var_rule_id
    private String varRuleId;

    // properties for property_name
    private String propertyName;

    // properties for create_by
    private String createBy;

    // properties for update_by
    private String updateBy;

    // properties for del_flag
    private Integer delFlag;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for id
    public String getId() {
        return id;
    }
    public java.util.List<String> get_inIdList() {
        return _inIdList;
    }

    // getters for var_rule_id
    public String getVarRuleId() {
        return varRuleId;
    }

    // getters for property_name
    public String getPropertyName() {
        return propertyName;
    }

    // getters for create_by
    public String getCreateBy() {
        return createBy;
    }

    // getters for update_by
    public String getUpdateBy() {
        return updateBy;
    }

    // getters for del_flag
    public Integer getDelFlag() {
        return delFlag;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for id
    public void setId(String id) {
        this.id = id;
    }
    public void set_inId(java.util.List<String> _inIdList) {
        this._inIdList = _inIdList;
    }

    // getters for var_rule_id
    public void setVarRuleId(String varRuleId) {
        this.varRuleId = varRuleId;
    }

    // getters for property_name
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    // getters for create_by
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    // getters for update_by
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    // getters for del_flag
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}
