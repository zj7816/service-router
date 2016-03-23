
package com.dianping.merchant.service.service;

import com.dianping.merchant.service.AbstractTestBase;
import com.dianping.merchant.service.repository.entity.SpiServiceProvider;
import com.dianping.merchant.service.repository.manage.SpiServiceManager;
import com.dianping.merchant.service.repository.model.SpiServiceRequest;
import com.dianping.merchant.service.repository.model.SpiServiceResult;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;


public class SpiManageServiceTest extends AbstractTestBase {

    @Resource
    private SpiServiceManager spiServiceManager;

    @Test
    public void testRouter() {
        SpiServiceResult result = spiServiceManager.handle(genProvider(), new SpiServiceRequest());
        System.out.println(result.toString());
    }


    private SpiServiceProvider genProvider() {
        Date now = new Date();
        SpiServiceProvider s1 = new SpiServiceProvider();
        s1.setAddTime(new Date());
        s1.setProviderCode(1001);
        s1.setProviderName("gaodeweather");
        return s1;

    }
}
