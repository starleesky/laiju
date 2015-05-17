package com.laiju.app.api.mapper;

import com.laiju.app.api.entity.DemoUser;

public interface DemoUserMapper {
	int deleteByPrimaryKey(Long id);

	int insert(DemoUser record);

	DemoUser selectByPrimaryKey(Long id);

	int insertTest(DemoUser record);

}