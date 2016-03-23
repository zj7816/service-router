
package com.dianping.merchant.service.repository.dao;

import com.dianping.avatar.dao.GenericDao;
import com.dianping.avatar.dao.annotation.DAOAction;
import com.dianping.avatar.dao.annotation.DAOActionType;
import com.dianping.merchant.service.repository.entity.SpiRouter;

import java.util.List;

public interface SpiRouterDao extends GenericDao {


    /** 找出所有路由器
     * @return
     */
    @DAOAction(action = DAOActionType.QUERY)
    List<SpiRouter> findAllRouters();


}
