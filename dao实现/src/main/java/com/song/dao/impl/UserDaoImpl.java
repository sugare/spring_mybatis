package com.song.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.song.dao.UserDao;
import com.song.po.User;

/** 
* @author 作者 E-mail: Sugare
* @version 创建时间：2017年12月3日 下午5:21:36 
* @description 说明：UserDaoImpl
*/
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	@Override
	public User findUserById(Integer id) throws Exception {
		SqlSession sqlSession = this.getSqlSession();
		
		/* 
		 * userDao.findUserById 
		 * userDao为 UserMapper.xml 对应的 namespace
		 * findUserById 为对应namespace 下的 id
		 **/
		
		User user = sqlSession.selectOne("userDao.findUserById", 1);
		return user;
	}

}
