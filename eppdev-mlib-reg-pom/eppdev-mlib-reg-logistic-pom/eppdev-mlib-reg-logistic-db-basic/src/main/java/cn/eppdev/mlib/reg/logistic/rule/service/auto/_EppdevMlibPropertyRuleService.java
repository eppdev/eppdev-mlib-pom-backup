/* FileName: EppdevMlibPropertyRuleService.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.rule.service.auto;

import cn.eppdev.mlib.reg.logistic.commons.service.BasicService;
import cn.eppdev.mlib.reg.logistic.rule.dao.EppdevMlibPropertyRuleDao;
import cn.eppdev.mlib.reg.logistic.rule.entity.EppdevMlibPropertyRule;
import cn.eppdev.mlib.reg.logistic.rule.param.EppdevMlibPropertyRuleParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_mlib_property_rule对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevMlibPropertyRuleService extends BasicService<EppdevMlibPropertyRule, EppdevMlibPropertyRuleParam> {

    @Autowired
    EppdevMlibPropertyRuleDao dao;

    @Override
    public EppdevMlibPropertyRuleDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevMlibPropertyRule entity) {

        // 判断逻辑主键
        EppdevMlibPropertyRuleParam param = new EppdevMlibPropertyRuleParam();
        param.setVarRuleId(entity.getVarRuleId());
        param.setPropertyName(entity.getPropertyName());
        param.set_pageNum(1);
        param.set_pageSize(1);
        PageInfo<EppdevMlibPropertyRule> pageInfo = list(param);
        if (pageInfo.getTotal() > 0) {
            if (pageInfo.getList().get(0).getId().equals(entity.getId())){
                return false;
            }
            return true;
        }

        return false;
    }

}
