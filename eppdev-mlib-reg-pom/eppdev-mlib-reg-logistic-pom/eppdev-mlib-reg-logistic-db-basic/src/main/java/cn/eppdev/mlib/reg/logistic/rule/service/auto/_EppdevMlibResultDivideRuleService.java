/* FileName: EppdevMlibResultDivideRuleService.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.rule.service.auto;

import cn.eppdev.mlib.reg.logistic.commons.service.BasicService;
import cn.eppdev.mlib.reg.logistic.rule.dao.EppdevMlibResultDivideRuleDao;
import cn.eppdev.mlib.reg.logistic.rule.entity.EppdevMlibResultDivideRule;
import cn.eppdev.mlib.reg.logistic.rule.param.EppdevMlibResultDivideRuleParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_mlib_result_divide_rule对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevMlibResultDivideRuleService extends BasicService<EppdevMlibResultDivideRule, EppdevMlibResultDivideRuleParam> {

    @Autowired
    EppdevMlibResultDivideRuleDao dao;

    @Override
    public EppdevMlibResultDivideRuleDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevMlibResultDivideRule entity) {

        // 判断逻辑主键
        EppdevMlibResultDivideRuleParam param = new EppdevMlibResultDivideRuleParam();
        param.setModelId(entity.getModelId());
        param.setResultRange(entity.getResultRange());
        param.set_pageNum(1);
        param.set_pageSize(1);
        PageInfo<EppdevMlibResultDivideRule> pageInfo = list(param);
        if (pageInfo.getTotal() > 0) {
            if (pageInfo.getList().get(0).getId().equals(entity.getId())){
                return false;
            }
            return true;
        }

        return false;
    }

}
