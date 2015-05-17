/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: DemoUserServiceImpl.java
 * Author:   Administrator
 * Date:     2015年5月17日 上午8:49:28
 * Description: 
 */
package com.laiju.app.impl.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
@Service
public class DemoUserServiceImpl implements DemoUserService {

	@Resource
	DemoUserRepo demoUserRepo;

	@Override
	@Transactional
	public DemoUser saveDemoUser(DemoUser demoUser) {
		// TODO Auto-generated method stub
		demoUserRepo.saveDemoUser(demoUser);
		return demoUser;
	}

}
