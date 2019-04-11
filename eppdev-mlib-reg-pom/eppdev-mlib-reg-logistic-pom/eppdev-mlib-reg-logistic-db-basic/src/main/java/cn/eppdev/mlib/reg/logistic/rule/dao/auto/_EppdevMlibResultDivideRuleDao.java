/* FileName: _EppdevMlibResultDivideRuleDao.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.rule.dao.auto;

import cn.eppdev.mlib.reg.logistic.commons.dao.BasicDao;
import cn.eppdev.mlib.reg.logistic.rule.entity.EppdevMlibResultDivideRule;
import cn.eppdev.mlib.reg.logistic.rule.param.EppdevMlibResultDivideRuleParam;
import org.apache.ibatis.annotations.Param;

/**
 * _eppdev_mlib_result_divide_rule对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public interface _EppdevMlibResultDivideRuleDao extends BasicDao<EppdevMlibResultDivideRule, EppdevMlibResultDivideRuleParam> {
    public int realDelete(@Param("id") String id);

}
