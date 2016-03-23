
package com.dianping.merchant.service.service;

import com.dianping.merchant.service.AbstractTestBase;
import com.dianping.merchant.service.repository.entity.SpiService;
import com.dianping.merchant.service.repository.entity.SpiServiceProvider;
import com.dianping.merchant.service.repository.router.RouterContext;
import com.dianping.merchant.service.repository.router.SpiRouterService;
import org.junit.Test;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class SpiRouterServiceTest extends AbstractTestBase {

    @Resource
    private SpiRouterService spiRouterService;

    private static final int serviceCode=100;

    @Test
    public void testRouter() {
        SpiServiceProvider provider=spiRouterService.select(serviceCode, new RouterContext());
        System.out.println(provider.toString());
    }


    private List<SpiServiceProvider> genProviderList() {
        Date now=new Date();
        SpiServiceProvider s1 = new SpiServiceProvider();
        s1.setAddTime(new Date());
        s1.setProviderCode(100);
        s1.setProviderName("s1 provider");


        SpiServiceProvider s2 = new SpiServiceProvider();
        s2.setAddTime(new Date(now.getTime()-3600*1000));
        s2.setProviderCode(200);
        s2.setProviderName("s2 provider");

        return Arrays.asList(s1,s2);
    }
}
