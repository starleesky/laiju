package com.laiju.common.spring;

import java.util.Map;

public class ExtMappingJacksonJsonView extends
        org.springframework.web.servlet.view.json.MappingJackson2JsonView {

	@Override
	protected Object filterModel(Map<String, Object> model) {
		Map<?, ?> result = (Map<?, ?>) super.filterModel(model);
		if (result.size() == 1) {
			return result.values().iterator().next();
		} else {
			return result;
		}
	}
}
