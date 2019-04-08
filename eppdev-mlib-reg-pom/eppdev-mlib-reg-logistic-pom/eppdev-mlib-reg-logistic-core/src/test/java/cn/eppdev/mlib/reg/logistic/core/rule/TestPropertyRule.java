/* FileName: TestPropertyRuleAge.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Apache License 2.0
 */

package cn.eppdev.mlib.reg.logistic.core.rule;

import cn.eppdev.mlib.entity.PropertyData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinlong.hao
 */
public class TestPropertyRule implements LrPropertyRule {
    static Logger logger = LoggerFactory.getLogger(TestPropertyRule.class);

    private String propertyName;
    private int status;

    public TestPropertyRule(String propertyName, int status) {
        this.propertyName = propertyName;
        this.status = status;
    }

    @Override
    public String getPropertyName() {
        return propertyName;
    }

    @Override
    public boolean checkValue(PropertyData propertyData) {
        if (status == 1) {
            if (propertyData.getNumberValueSet().iterator().next().doubleValue() >= 30) {
                return true;
            }
        } else if (status == 2) {
            if (propertyData.getNumberValueSet().iterator().next().doubleValue() <= 30) {
                return true;
            }
        } else if (status == 3) {
            if (propertyData.getStringValueSet().contains("重庆大学")){
                return true;
            }
        }
        return false;
    }
}
