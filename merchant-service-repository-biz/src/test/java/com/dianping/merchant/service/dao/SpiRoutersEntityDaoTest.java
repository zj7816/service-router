
package com.dianping.merchant.service.dao;

import com.dianping.merchant.service.AbstractTestBase;
import com.dianping.merchant.service.repository.dao.SpiRouterDao;
import com.dianping.merchant.service.repository.entity.SpiRouter;
import org.junit.Test;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;


public class SpiRoutersEntityDaoTest extends AbstractTestBase {

    @Resource
    private SpiRouterDao spiRouterDao;

    @Test
    public void TestLoad() {
        List<SpiRouter> routerEntityList = spiRouterDao.findAllRouters();
        Assert.notNull(spiRouterDao);
    }
}
