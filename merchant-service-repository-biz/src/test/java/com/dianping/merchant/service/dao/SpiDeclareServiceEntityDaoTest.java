
package com.dianping.merchant.service.dao;

import com.dianping.merchant.service.AbstractTestBase;
import com.dianping.merchant.service.repository.dao.SpiServiceDao;
import com.dianping.merchant.service.repository.entity.SpiService;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Date;


public class SpiDeclareServiceEntityDaoTest extends AbstractTestBase {

    @Resource
    private SpiServiceDao spiServiceDao;

    @Test
    public void TestLoad() {
        SpiService spiService = spiServiceDao.findByCode(100, 1);
        Assert.notNull(spiServiceDao);
    }

    @Test
    @Rollback
    public void testInsert(){
        SpiService serviceEntity=new SpiService();
        serviceEntity.setServiceCode(9999);
        serviceEntity.setServiceName("test");
        serviceEntity.setServiceType("pigeon");
        serviceEntity.setAddTime(new Date());

        Integer result=spiServiceDao.insert(serviceEntity);
        Assert.notNull(result);
    }

}
