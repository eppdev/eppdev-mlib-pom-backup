/* FileName: TestDummyVarRule.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Apache License 2.0
 */

package cn.eppdev.mlib.reg.logistic.core.rule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author jinlong.hao
 */
public class TestDummyVarRule implements LrDummyVarRule {
    static Logger logger = LoggerFactory.getLogger(TestDummyVarRule.class);

    private String varName;
    private List<LrPropertyRule> propertyRuleList;

    public TestDummyVarRule(String varName, List<LrPropertyRule> propertyRuleList) {
        this.varName = varName;
        this.propertyRuleList = propertyRuleList;
    }

    @Override
    public List<LrPropertyRule> getPropertyRuleList() {
        return propertyRuleList;
    }

    @Override
    public String getDummyVarName() {
        return varName;
    }
}
