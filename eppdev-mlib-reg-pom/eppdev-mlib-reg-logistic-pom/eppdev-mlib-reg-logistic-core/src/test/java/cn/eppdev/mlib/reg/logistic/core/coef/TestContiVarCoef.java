/* FileName: TestContiVarCoef.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Apache License 2.0
 */

package cn.eppdev.mlib.reg.logistic.core.coef;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinlong.hao
 */
public class TestContiVarCoef implements LrContiVarCoef {
    static Logger logger = LoggerFactory.getLogger(TestContiVarCoef.class);

    String propertyName;

    Double coef;

    public TestContiVarCoef(String propertyName, Double coef) {
        this.propertyName = propertyName;
        this.coef = coef;
    }

    @Override
    public String getPropertyName() {
        return propertyName;
    }

    @Override
    public Double getCoef() {
        return coef;
    }
}
