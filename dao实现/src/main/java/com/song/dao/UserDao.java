package com.song.dao;

import com.song.po.User;

/** 
* @author 作者 E-mail: Sugare
* @version 创建时间：2017年12月3日 下午5:18:53 
* @description 说明：UserDao
*/
public interface UserDao {
	public User findUserById(Integer id) throws Exception;
}
