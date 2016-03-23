
package com.dianping.merchant.service.repository.dao;

import com.dianping.avatar.dao.GenericDao;
import com.dianping.avatar.dao.annotation.DAOAction;
import com.dianping.avatar.dao.annotation.DAOActionType;
import com.dianping.avatar.dao.annotation.DAOParam;
import com.dianping.merchant.service.repository.entity.SpiServiceProvider;

import java.util.List;

public interface SpiServiceProviderDao extends GenericDao {

    /**
     * 根据服务编码获取服务渠道列表
     *
     * @param serviceCode
     * @param providerStatus
     * @return
     */
    @DAOAction(action = DAOActionType.QUERY)
    List<SpiServiceProvider> findProviderByServiceCode(@DAOParam("serviceCode") int serviceCode, @DAOParam("providerStatus") int providerStatus);


    /**
     * 服务渠道
     * @param providerEntity
     * @return
     */
    @DAOAction(action = DAOActionType.INSERT)
    int insert(@DAOParam("entity") SpiServiceProvider providerEntity);


}
