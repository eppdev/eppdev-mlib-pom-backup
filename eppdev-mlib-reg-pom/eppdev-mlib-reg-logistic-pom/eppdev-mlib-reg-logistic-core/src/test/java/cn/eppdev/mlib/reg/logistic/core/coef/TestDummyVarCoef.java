/* FileName: TestDummyVarCoef.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Apache License 2.0
 */

package cn.eppdev.mlib.reg.logistic.core.coef;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinlong.hao
 */
public class TestDummyVarCoef implements LrDummyVarCoef {
    static Logger logger = LoggerFactory.getLogger(TestDummyVarCoef.class);

    String dummyVarName;

    Double coef;

    public TestDummyVarCoef(String dummyVarName, Double coef) {
        this.dummyVarName = dummyVarName;
        this.coef = coef;
    }

    @Override
    public String getDummyVarName() {
        return dummyVarName;
    }

    @Override
    public Double getCoef() {
        return coef;
    }
}
