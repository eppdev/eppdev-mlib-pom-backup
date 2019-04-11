/* FileName: EppdevMlibContiVarCoefService.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.coef.service.auto;

import cn.eppdev.mlib.reg.logistic.commons.service.BasicService;
import cn.eppdev.mlib.reg.logistic.coef.dao.EppdevMlibContiVarCoefDao;
import cn.eppdev.mlib.reg.logistic.coef.entity.EppdevMlibContiVarCoef;
import cn.eppdev.mlib.reg.logistic.coef.param.EppdevMlibContiVarCoefParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_mlib_conti_var_coef对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevMlibContiVarCoefService extends BasicService<EppdevMlibContiVarCoef, EppdevMlibContiVarCoefParam> {

    @Autowired
    EppdevMlibContiVarCoefDao dao;

    @Override
    public EppdevMlibContiVarCoefDao getDao() {
        return dao;
    }

    @Override
    public boolean exists(EppdevMlibContiVarCoef entity) {

        // 判断逻辑主键
        EppdevMlibContiVarCoefParam param = new EppdevMlibContiVarCoefParam();
        param.setModelId(entity.getModelId());
        param.setPropertyName(entity.getPropertyName());
        param.set_pageNum(1);
        param.set_pageSize(1);
        PageInfo<EppdevMlibContiVarCoef> pageInfo = list(param);
        if (pageInfo.getTotal() > 0) {
            if (pageInfo.getList().get(0).getId().equals(entity.getId())){
                return false;
            }
            return true;
        }

        return false;
    }

}
