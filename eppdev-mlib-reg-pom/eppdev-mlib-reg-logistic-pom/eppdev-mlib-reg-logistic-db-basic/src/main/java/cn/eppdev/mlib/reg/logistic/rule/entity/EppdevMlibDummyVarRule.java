/* FileName: EppdevMlibDummyVarRule.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.rule.entity;

import cn.eppdev.mlib.reg.logistic.core.rule.LrDummyVarRule;
import cn.eppdev.mlib.reg.logistic.core.rule.LrPropertyRule;
import cn.eppdev.mlib.reg.logistic.rule.entity.auto._EppdevMlibDummyVarRule;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinlong.hao
 */
public class EppdevMlibDummyVarRule extends _EppdevMlibDummyVarRule implements LrDummyVarRule {

    List<EppdevMlibPropertyRule> propertyRuleList;

    public void setPropertyRuleList(List<EppdevMlibPropertyRule> propertyRuleList) {
        this.propertyRuleList = propertyRuleList;
    }

    @Override
    public List<LrPropertyRule> getPropertyRuleList() {
        List<LrPropertyRule> list = new ArrayList<>();
        list.addAll(propertyRuleList);
        return list;
    }
}