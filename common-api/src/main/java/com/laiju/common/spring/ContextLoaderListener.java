/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: ContextLoaderListener.java
 * Author:   Administrator
 * Date:     2015年5月15日 下午5:52:02
 * Description: 
 */
package com.laiju.common.spring;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.WebApplicationContext;

/**
 * <pre>
 * 〈一句话是什么〉
 * 〈详细描述做什么〉
 * 
 * @author xin.li
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ContextLoaderListener extends org.springframework.web.context.ContextLoaderListener {
	// classpath：只会到你的class路径中查找找文件;
	// classpath*：不仅包含class路径，还包括jar文件中(class路径)进行查找.
	// contextConfigLocation 参数为空，环境默认加载的文件列表
	private static final String CONTEXT_XML_FILES = "classpath*:spring/*.xml";
	private static final String CONTAINER_XML_FILES = "classpath*:spring/container/*.container.xml";

	/**
	 * 初始化系统运行环境的根路径
	 */
	@Override
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
	}

	@Override
	protected WebApplicationContext createWebApplicationContext(ServletContext sc) {
		WebApplicationContext context = super.createWebApplicationContext(sc);
		return context;
	}

	/**
	 * <context-param> <param-name>contextConfigLocation</param-name>
	 * <param-value>classpath*:spring/*.xml</param-value> </context-param> 如果
	 * web.xml 有没有配置 contextConfigLocation 环境加载文件，系统默认 classpath*:spring/*.xml
	 */
	@Override
	protected void customizeContext(ServletContext servletContext, ConfigurableWebApplicationContext applicationContext) {
		String initParameter = servletContext.getInitParameter(CONFIG_LOCATION_PARAM);
		if (StringUtils.isBlank(initParameter)) {
			applicationContext.setConfigLocation(CONTEXT_XML_FILES + "," + CONTAINER_XML_FILES);
		} else {
			String configs = StringUtils.join(applicationContext.getConfigLocations(), ",");
			if (!StringUtils.contains(configs, CONTAINER_XML_FILES)) {
				applicationContext.setConfigLocation(StringUtils.join(new String[] { configs, CONTAINER_XML_FILES },
				        ","));
			}
		}
		super.customizeContext(servletContext, applicationContext);
	}

}