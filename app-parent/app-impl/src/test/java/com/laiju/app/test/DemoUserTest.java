/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: DemoUserTest.java
 * Author:   Administrator
 * Date:     2015年5月16日 下午11:09:49
 * Description: 
 */
package com.laiju.app.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.laiju.app.api.demo.repo.DemoUserRepo;
import com.laiju.app.api.demo.service.DemoUserService;
import com.laiju.app.api.entity.DemoUser;

/**
 * <pre>
 * 〈一句话是什么〉
 * 〈详细描述做什么〉
 * 
 * @author xin.li
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:spring/base-service.xml",
        "classpath:spring/laiju-datasource.xml",
        "classpath:spring/laiju-service.xml" })
public class DemoUserTest extends AbstractJUnit4SpringContextTests {

	Logger log = LoggerFactory.getLogger(DemoUserTest.class);

	@Resource
	DemoUserRepo demoUserRepo;

	@Resource
	DemoUserService demoUserService;

	@Test
	public void saveTest() {
		DemoUser demoUser = new DemoUser();
		demoUser.setId(6l);
		demoUser.setUsername("xin.li");
		demoUser.setPassword("123456");
		demoUserService.saveDemoUser(demoUser);
	}

}
