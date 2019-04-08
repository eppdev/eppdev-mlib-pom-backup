/* FileName: LrDummyVarCoef.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By 996 License 1.0
 */
package cn.eppdev.mlib.reg.logistic.core.coef;

/**
 * 哑变量的模型权重
 * @author jinlong.hao
 */
public interface LrDummyVarCoef {

    /**
     * 哑变量名称
     * @return 哑变量名称
     */
    String getDummyVarName();

    /**
     * 哑变量的权重
     * @return 哑变量的权重
     */
    Double getCoef();

}
