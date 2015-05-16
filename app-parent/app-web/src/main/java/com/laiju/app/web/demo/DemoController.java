/**
 * This file is part of 139erp product.
 * Copyright: Hangzhou Shenzhu Co. Ltd., All rights reserved
 */
package com.laiju.app.web.demo;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

	// @Autowired
	// CoinKernelService coinKernelService;

	@RequestMapping(value = "/get/{id}")
	@ResponseBody
	public Map<String, String> demo1(@PathVariable("id") String id) {

		log.info("测试句酷{}", id);
		ModelAndView model = new ModelAndView();
		// CoinRecord coinRecord = new CoinRecord();
		// coinRecord.setAccountId("test");
		// coinRecord.setCompanyCode(id);
		// coinKernelService.addSendCoin(coinRecord);
		Map<String, String> map = new HashMap<String, String>();
		map.put("companyCode", id);
		map.put("companyCode", "中文");
		model.addObject("companyCode", map);
//		model.setViewName("/index");
		return map;
	}

	@RequestMapping(value = "/go/{id}")
	public String demo2(@PathVariable("id") String id) {

		log.info("测试句酷{}", id);
		ModelAndView model = new ModelAndView();
		// CoinRecord coinRecord = new CoinRecord();
		// coinRecord.setAccountId("test");
		// coinRecord.setCompanyCode(id);
		// coinKernelService.addSendCoin(coinRecord);
		model.addObject("companyCode", id);
//		 model.setViewName("/index");
		return "index";
	}
}
