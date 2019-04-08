/* FileName: LrPropertyRule.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By 996 License 1.0
 */
package cn.eppdev.mlib.reg.logistic.core.rule;

import cn.eppdev.mlib.entity.PropertyData;

/**
 * 基础属性的判断规则
 * @author jinlong.hao
 */
public interface LrPropertyRule {

    /**
     * 要满足条件的属性名称，如"abc.def"
     * @return 要满足条件的属性名称
     */
    String getPropertyName();

//
//    /**
//     * 对数值进行分段的上限（不含等于）
//     * @return 数值分段的上限（不含等于）
//     */
//    Double getRangeMaxWithoutEqual();
//
//    /**
//     * 对数值分段的上限（含等于）
//     * @return 数值分段的上限（含等于）
//     */
//    Double getRangeMaxWithEqual();
//
//    /**
//     * 对数值进行分段的下限（不含等于）
//     * @return 数值分段的下限（不含等于）
//     */
//    Double getRangeMinWithoutEqual();
//
//    /**
//     * 对数值进行分段的下发（含等于）
//     * @return 数值分段的下限（不含等于）
//     */
//    Double getRangeMinWithEqual();
//
//    /**
//     * 根据数值是否相等进行判断的条件
//     * @return 数值是否相等
//     */
//    String getEqualValue();
//
//    /**
//     * 根据startWith进行判断的条件
//     * @return startWith判断条件
//     */
//    String getStartWithValue();
//
//    /**
//     * 根据endWith进行判断的条件
//     * @return endWith判断条件
//     */
//    String getEndWithValue();
//
//    /**
//     * 格局contain条件进行判断的判断条件
//     * @return contains判断条件
//     */
//    String getContainsValue();

    /**
     * 判断结果值是否符合此规则
     * @param propertyData 要检查的数据
     * @return 是否符合规则
     */
    boolean checkValue(PropertyData propertyData);

}
