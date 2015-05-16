/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: BaseDateConverterController.java
 * Author:   peng.lan
 * Date:     2015年3月31日 上午10:47:25
 * Description:
 */
package com.laiju.app.web.base;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * <pre>
 * 〈日期转换〉
 *
 * @author peng.lan
 */
public abstract class BaseController {
	@InitBinder
	protected  void  dateBinder(WebDataBinder binder) {
		DateFormat dateFormat = new  SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true ));
	}
}
