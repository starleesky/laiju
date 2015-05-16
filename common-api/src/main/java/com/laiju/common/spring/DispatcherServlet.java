/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: DispatcherServlet.java
 * Author:   Administrator
 * Date:     2015年5月15日 下午5:52:45
 * Description: 
 */
package com.laiju.common.spring;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.apache.commons.lang3.StringUtils;

/**
 * <pre>
 * 〈一句话是什么〉
 * 〈详细描述做什么〉
 * 
 * @author xin.li
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class DispatcherServlet extends org.springframework.web.servlet.DispatcherServlet {
	private static final long serialVersionUID = 8022893821282529225L;
	private static final String CONTEXT_XML_FILES = "classpath:spring-mvc/*.xml";

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	@Override
	public String getContextConfigLocation() {
		String configLocation = super.getContextConfigLocation();
		if (StringUtils.isBlank(configLocation)) {
			configLocation = CONTEXT_XML_FILES;
		}
		return configLocation;
	}
}
