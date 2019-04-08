/* FileName: LrContiVarCoef.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By 996 License 1.0
 */
package cn.eppdev.mlib.reg.logistic.core.coef;

/**
 * 连续型变量的权重
 * @author jinlong.hao
 */
public interface LrContiVarCoef{

    /**
     * 变量名称
     * @return 变量的名称
     */
    String getPropertyName();

    /**
     * 变量权重
     * @return 变量权重
     */
    Double getCoef();
}
