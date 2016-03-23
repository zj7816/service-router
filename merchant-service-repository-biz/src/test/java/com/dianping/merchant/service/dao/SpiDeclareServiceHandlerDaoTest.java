
package com.dianping.merchant.service.dao;

import com.dianping.merchant.service.AbstractTestBase;
import com.dianping.merchant.service.repository.dao.SpiServiceProviderDao;
import com.dianping.merchant.service.repository.entity.SpiServiceProvider;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;
import java.util.List;


public class SpiDeclareServiceHandlerDaoTest extends AbstractTestBase {

    @Resource
    private SpiServiceProviderDao spiServiceProviderDao;

    @Test
    public void TestLoad() {
        List<SpiServiceProvider> providerEntityList= spiServiceProviderDao.findProviderByServiceCode(100, 1);
        System.out.println("no");
    }

    @Test
    @Rollback
    public void testInsert(){
        SpiServiceProvider providerEntity=new SpiServiceProvider();
        providerEntity.setProviderCode(900);
        providerEntity.setServiceCode(100);
        providerEntity.setProviderName("gaodeweather");
        providerEntity.setProviderParams("key:asd");
        providerEntity.setProviderType("pigeon");
        providerEntity.setProviderStatus(1);

        Integer result= spiServiceProviderDao.insert(providerEntity);
        System.out.println(result);
    }

}
