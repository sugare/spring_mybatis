package com.song.dao;

import com.song.po.User;

/** 
* @author ���� E-mail: Sugare
* @version ����ʱ�䣺2017��12��3�� ����5:18:53 
* @description ˵����UserDao
*/
public interface UserDao {
	public User findUserById(Integer id) throws Exception;
}
