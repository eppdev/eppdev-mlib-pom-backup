/* FileName: LrResultDivideRule.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By 996 License 1.0
 */

package cn.eppdev.mlib.reg.logistic.core.rule;

/**
 * 打分结果分段规则接口类
 * @author jinlong.hao
 */
public interface LrResultDivideRule {
//
//    /**
//     * 逻辑回归运算结果分段的上限值（包含等于），此属性不能与maxWithEqual同时存在
//     * @return 结果分段的上限值（包含等于）
//     */
//    Double getMaxWithoutEqual();
//
//    /**
//     * 逻辑回归运算结果分段的上限值（不含等于），此属性不能与maxWithoutEqual同时存在
//     * @return 运算结果分段的上限值（不含等于）
//     */
//    Double getMaxWithEqual();
//
//    /**
//     * 逻辑回归运算结果分段的下限值（包含等于），此属性不能与minWithEqual同时存在
//     * @return 运算结果分段的下限值（包含等于）
//     */
//    Double getMinWithoutEqual();
//
//    /**
//     * 逻辑回归运算结果分段的下限值（不含等于），此属性不能与minWithoutEqual同时存在
//     * @return 运算结果分段的下限值（不含等于）
//     */
//    Double getMinWithEqual();

    /**
     * 判断数值是否符合本条规则
     * @param value 要判断的计算结果值
     * @return 是否符合规则
     */
    boolean checkValue(double value);


    /**
     * 分段结果值
     * @return 分段结果值
     */
    Integer getScore();
}
