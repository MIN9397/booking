package com.dev.springBoot.mapper;

import org.apache.ibatis.annotations.Select;

public interface HelloMapper {

	@Select("SELECT username FROM MEMBER where user_id=#{user-id}")
	String getMember(String user_id);
}
