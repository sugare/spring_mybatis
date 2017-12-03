package com.song.mapper;

import com.song.po.User;

/** 
* @author 作者 E-mail: Sugare
* @version 创建时间：2017年12月3日 下午4:59:21 
* @description 说明：mybatis UserMapper 接口
*/
public interface UserMapper {
		
	public User findUserById(Integer id) throws Exception;

}
