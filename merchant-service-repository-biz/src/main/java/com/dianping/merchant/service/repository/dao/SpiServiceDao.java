
package com.dianping.merchant.service.repository.dao;

import com.dianping.avatar.dao.GenericDao;
import com.dianping.avatar.dao.annotation.DAOAction;
import com.dianping.avatar.dao.annotation.DAOActionType;
import com.dianping.avatar.dao.annotation.DAOParam;
import com.dianping.merchant.service.repository.entity.SpiService;

public interface SpiServiceDao extends GenericDao {

    /**
     * 根据服务编码获取服务
     *
     * @param serviceCode
     * @param status
     */
    @DAOAction(action = DAOActionType.LOAD)
    SpiService findByCode(@DAOParam("serviceCode") int serviceCode, @DAOParam("status") int status);


    /**
     * 插入一项服务
     *
     * @param serviceEntity
     */
    @DAOAction(action = DAOActionType.INSERT)
    int insert(@DAOParam("entity") SpiService serviceEntity);


}
