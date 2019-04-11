/* FileName: _EppdevMlibDummyVarCoefDao.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.coef.dao.auto;

import cn.eppdev.mlib.reg.logistic.commons.dao.BasicDao;
import cn.eppdev.mlib.reg.logistic.coef.entity.EppdevMlibDummyVarCoef;
import cn.eppdev.mlib.reg.logistic.coef.param.EppdevMlibDummyVarCoefParam;
import org.apache.ibatis.annotations.Param;

/**
 * _eppdev_mlib_dummy_var_coef对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public interface _EppdevMlibDummyVarCoefDao extends BasicDao<EppdevMlibDummyVarCoef, EppdevMlibDummyVarCoefParam> {
    public int realDelete(@Param("id") String id);

}
