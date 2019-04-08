/* FileName: LrDummyVarRule.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By 996 License 1.0
 */

package cn.eppdev.mlib.reg.logistic.core.rule;

import java.util.List;

/**
 * 哑变量生成规则
 * @author jinlong.hao
 */
public interface LrDummyVarRule {

    /**
     * 生成此哑变量的规则列表，只有此规则列表全部满足时，方可表示此哑变量存在
     * @return 哑变量规则列表
     */
    List<LrPropertyRule> getPropertyRuleList();

    /**
     * 哑变量名称
     * @return 哑变量名称
     */
    String getVarName();
}
