/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: CustomJacksonObjectMapper.java
 * Author:   Administrator
 * Date:     2015年5月16日 下午3:54:19
 * Description: 
 */
package com.laiju.common.json.jackson;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * <pre>
 * 〈一句话是什么〉
 * 〈详细描述做什么〉
 * 
 * @author xin.li
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class CustomJacksonObjectMapper extends ObjectMapper {

	/**
	 */
	private static final long serialVersionUID = 1L;

	public CustomJacksonObjectMapper() {
		super();
		this.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		this.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
		this.setSerializationInclusion(Include.NON_NULL);
	}
}
