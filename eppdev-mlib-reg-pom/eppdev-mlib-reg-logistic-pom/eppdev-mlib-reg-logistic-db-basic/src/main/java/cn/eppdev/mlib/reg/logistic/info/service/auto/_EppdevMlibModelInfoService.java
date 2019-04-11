/* FileName: EppdevMlibModelInfoService.java
 * Copyright EPPDEV, All Rights Preserved!
 * License: 996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.mlib.reg.logistic.info.service.auto;

import cn.eppdev.mlib.reg.logistic.commons.service.BasicService;
import cn.eppdev.mlib.reg.logistic.info.dao.EppdevMlibModelInfoDao;
import cn.eppdev.mlib.reg.logistic.info.entity.EppdevMlibModelInfo;
import cn.eppdev.mlib.reg.logistic.info.param.EppdevMlibModelInfoParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_mlib_model_info对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevMlibModelInfoService extends BasicService<EppdevMlibModelInfo, EppdevMlibModelInfoParam> {

    @Autowired
    EppdevMlibModelInfoDao dao;

    @Override
    public EppdevMlibModelInfoDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevMlibModelInfo entity) {

        // 判断逻辑主键
        EppdevMlibModelInfoParam param = new EppdevMlibModelInfoParam();
        param.setName(entity.getName());
        param.set_pageNum(1);
        param.set_pageSize(1);
        PageInfo<EppdevMlibModelInfo> pageInfo = list(param);
        if (pageInfo.getTotal() > 0) {
            if (pageInfo.getList().get(0).getId().equals(entity.getId())){
                return false;
            }
            return true;
        }

        return false;
    }

}
