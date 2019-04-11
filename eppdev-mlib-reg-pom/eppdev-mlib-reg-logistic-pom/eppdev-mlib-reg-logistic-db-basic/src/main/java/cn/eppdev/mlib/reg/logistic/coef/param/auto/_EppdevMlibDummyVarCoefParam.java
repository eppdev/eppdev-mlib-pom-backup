/* FileName: EppdevMlibDummyVarCoefParam.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.coef.param.auto;

import cn.eppdev.mlib.reg.logistic.commons.param.BasicParam;

/**
 * _eppdev_mlib_dummy_var_coef对应的基础参数类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevMlibDummyVarCoefParam extends BasicParam {

    /* ***********************************************
     * properties
     * **********************************************/
    // properties for id
    private String id;
    private java.util.List<String> _inIdList;

    // properties for model_id
    private String modelId;

    // properties for dummy_var_name
    private String dummyVarName;

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

    // getters for model_id
    public String getModelId() {
        return modelId;
    }

    // getters for dummy_var_name
    public String getDummyVarName() {
        return dummyVarName;
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

    // getters for model_id
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    // getters for dummy_var_name
    public void setDummyVarName(String dummyVarName) {
        this.dummyVarName = dummyVarName;
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
