/**
 * Project: smssender-web
 * 
 * File Created at 2012-5-29
 * $Id$
 * 
 * Copyright 2010 dianping.com.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Dianping Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with dianping.com.
 */
package com.dianping.merchant.forum.mq.test.base;

import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * 测试基类
 * 
 * @author liang.liu
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 

		"classpath*:/config/spring/local/appcontext-*.xml" })
@Ignore
public abstract class AbstractTest {

	public void notNull(Object obj) {
		assertNotNull(obj);
	}

	public void isNull(Object obj) {
		assertNull(obj);
	}

	public void equal(Object expected, Object actual) {
		Assert.assertEquals(expected, actual);
	}

}
