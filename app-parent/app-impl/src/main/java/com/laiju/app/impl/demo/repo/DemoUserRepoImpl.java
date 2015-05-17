/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: DemoUserRepoImpl.java
 * Author:   Administrator
 * Date:     2015年5月16日 下午4:53:18
 * Description: 
 */
package com.laiju.app.impl.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.laiju.app.api.demo.repo.DemoUserRepo;
import com.laiju.app.api.entity.DemoUser;
import com.laiju.app.api.mapper.DemoUserMapper;

/**
 * <pre>
 * 〈一句话是什么〉
 * 〈详细描述做什么〉
 * 
 * @author xin.li
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Repository
public class DemoUserRepoImpl implements DemoUserRepo {

	@Autowired
	DemoUserMapper demoUserMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.laiju.app.api.demo.repo.DemoUserRepo#saveDemoUser(com.laiju.app.api
	 * .entity.DemoUser)
	 */
	@Override
	public DemoUser saveDemoUser(DemoUser demoUser) {
		demoUserMapper.insert(demoUser);
		return demoUser;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.laiju.app.api.demo.repo.DemoUserRepo#getDemoUser()
	 */
	@Override
	public DemoUser getDemoUser(Long id) {
		DemoUser demoUser = demoUserMapper.selectByPrimaryKey(id);
		return demoUser;
	}

}
