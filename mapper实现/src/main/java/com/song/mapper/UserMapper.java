package com.song.mapper;

import com.song.po.User;

/** 
* @author ���� E-mail: Sugare
* @version ����ʱ�䣺2017��12��3�� ����4:59:21 
* @description ˵����mybatis UserMapper �ӿ�
*/
public interface UserMapper {
		
	public User findUserById(Integer id) throws Exception;

}
