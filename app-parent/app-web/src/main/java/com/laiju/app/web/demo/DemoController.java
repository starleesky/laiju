/**
 * This file is part of 139erp product.
 * Copyright: Hangzhou Shenzhu Co. Ltd., All rights reserved
 */
package com.laiju.app.web.demo;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.laiju.app.api.demo.repo.DemoUserRepo;
import com.laiju.app.api.demo.service.DemoUserService;
import com.laiju.app.api.entity.DemoUser;
import com.laiju.app.web.base.BaseController;

/**
 * <p>
 * 应用下载
 * </p>
 * 
 * Created: 2014年4月8日 上午10:48:46
 * 
 * @author lixin(lixin@139erp.com)
 */
@Controller
@RequestMapping("/test")
public class DemoController extends BaseController {

	private final static Logger log = LoggerFactory.getLogger(DemoController.class);

	@Resource
	DemoUserService demoUserService;

	@Resource
	DemoUserRepo demoUserRepo;

	@RequestMapping(value = "/get/{id}")
	@ResponseBody
	public DemoUser demo1(@PathVariable("id") Long id) {

		log.info("测试句酷{}", id);
		DemoUser demoUser = demoUserRepo.getDemoUser(id);
		return demoUser;
	}

	@RequestMapping(value = "/go/{id}")
	public String demo2(@PathVariable("id") String id) {

		log.info("测试句酷{}", id);
		ModelAndView model = new ModelAndView();
		model.addObject("companyCode", id);
		DemoUser demoUser = new DemoUser();
		demoUser.setUsername("xin.li");
		demoUser.setPassword("123456");
		demoUserService.saveDemoUser(demoUser);
		// model.setViewName("/index");
		return "index";
	}
}
