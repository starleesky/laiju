/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: DemoUserRepo.java
 * Author:   Administrator
 * Date:     2015年5月16日 下午4:51:04
 * Description: 
 */
package com.laiju.app.api.demo.repo;

import com.laiju.app.api.entity.DemoUser;

/**
 * <pre>
 * 〈一句话是什么〉
 * 〈详细描述做什么〉
 * 
 * @author xin.li
 */
public interface DemoUserRepo {

	public DemoUser saveDemoUser(DemoUser demoUser);

	public DemoUser getDemoUser(Long id);
}
