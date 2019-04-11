/* FileName: EppdevMlibDummyVarCoefService.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.coef.service.auto;

import cn.eppdev.mlib.reg.logistic.commons.service.BasicService;
import cn.eppdev.mlib.reg.logistic.coef.dao.EppdevMlibDummyVarCoefDao;
import cn.eppdev.mlib.reg.logistic.coef.entity.EppdevMlibDummyVarCoef;
import cn.eppdev.mlib.reg.logistic.coef.param.EppdevMlibDummyVarCoefParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_mlib_dummy_var_coef对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevMlibDummyVarCoefService extends BasicService<EppdevMlibDummyVarCoef, EppdevMlibDummyVarCoefParam> {

    @Autowired
    EppdevMlibDummyVarCoefDao dao;

    @Override
    public EppdevMlibDummyVarCoefDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevMlibDummyVarCoef entity) {

        // 判断逻辑主键
        EppdevMlibDummyVarCoefParam param = new EppdevMlibDummyVarCoefParam();
        param.setModelId(entity.getModelId());
        param.setDummyVarName(entity.getDummyVarName());
        param.set_pageNum(1);
        param.set_pageSize(1);
        PageInfo<EppdevMlibDummyVarCoef> pageInfo = list(param);
        if (pageInfo.getTotal() > 0) {
            if (pageInfo.getList().get(0).getId().equals(entity.getId())){
                return false;
            }
            return true;
        }

        return false;
    }

}
