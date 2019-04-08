/* FileName: PropertyData.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By 996 License 1.0
 */

package cn.eppdev.mlib.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 数据解析的结果值，包括字符串数组、数字数组两类
 * @author jinlong.hao
 */
public class PropertyData {

    /**
     * 字符串数组
     */
    Set<String> stringValueSet = new HashSet<>();

    /**
     * 数字数组对象
     */
    Set<Number> numberValueSet = new HashSet<>();

    public Set<String> getStringValueSet() {
        return stringValueSet;
    }


    public Set<Number> getNumberValueSet() {
        return numberValueSet;
    }

}
