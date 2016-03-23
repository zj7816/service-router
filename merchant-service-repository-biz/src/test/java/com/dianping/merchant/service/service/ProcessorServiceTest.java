
package com.dianping.merchant.service.service;

import com.dianping.merchant.service.AbstractTestBase;
import com.dianping.merchant.service.repository.processor.BusinessProcessor;
import com.dianping.merchant.service.repository.processor.BusinessProcessorHandler;
import org.junit.Test;

import javax.annotation.Resource;


public class ProcessorServiceTest extends AbstractTestBase {


    @Resource
    private BusinessProcessorHandler handler;

    @Test
    public void testProceesor() {
        BusinessProcessor processor = handler.getProcessor("zj");
        processor.execute(null);
    }


}
