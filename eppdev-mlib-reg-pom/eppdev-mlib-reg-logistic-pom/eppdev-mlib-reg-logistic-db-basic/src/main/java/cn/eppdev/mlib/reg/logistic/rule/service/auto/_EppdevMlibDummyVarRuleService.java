/* FileName: EppdevMlibDummyVarRuleService.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.rule.service.auto;

import cn.eppdev.mlib.reg.logistic.commons.service.BasicService;
import cn.eppdev.mlib.reg.logistic.rule.dao.EppdevMlibDummyVarRuleDao;
import cn.eppdev.mlib.reg.logistic.rule.entity.EppdevMlibDummyVarRule;
import cn.eppdev.mlib.reg.logistic.rule.param.EppdevMlibDummyVarRuleParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_mlib_dummy_var_rule对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevMlibDummyVarRuleService extends BasicService<EppdevMlibDummyVarRule, EppdevMlibDummyVarRuleParam> {

    @Autowired
    EppdevMlibDummyVarRuleDao dao;

    @Override
    public EppdevMlibDummyVarRuleDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevMlibDummyVarRule entity) {

        // 判断逻辑主键
        EppdevMlibDummyVarRuleParam param = new EppdevMlibDummyVarRuleParam();
        param.setDummyVarName(entity.getDummyVarName());
        param.setModelId(entity.getModelId());
        param.set_pageNum(1);
        param.set_pageSize(1);
        PageInfo<EppdevMlibDummyVarRule> pageInfo = list(param);
        if (pageInfo.getTotal() > 0) {
            if (pageInfo.getList().get(0).getId().equals(entity.getId())){
                return false;
            }
            return true;
        }

        return false;
    }

}
