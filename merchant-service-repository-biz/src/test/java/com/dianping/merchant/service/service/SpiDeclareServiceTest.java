
package com.dianping.merchant.service.service;

import com.dianping.merchant.service.AbstractTestBase;
import com.dianping.merchant.service.repository.model.SpiServiceRequest;
import com.dianping.merchant.service.repository.model.SpiServiceResult;
import com.dianping.merchant.service.repository.service.SpiDeclareService;
import org.junit.Test;

import javax.annotation.Resource;


public class SpiDeclareServiceTest extends AbstractTestBase {

    @Resource
    private SpiDeclareService spiDeclareService;



    @Test
    public void testExecute() {
        SpiServiceRequest request = new SpiServiceRequest();
        request.setServiceCode(100);

        SpiServiceResult result = spiDeclareService.execute(request);
        System.out.println(result.toString());
    }

}
