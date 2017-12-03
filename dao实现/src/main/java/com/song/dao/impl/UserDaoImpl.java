package com.song.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.song.dao.UserDao;
import com.song.po.User;

/** 
* @author ���� E-mail: Sugare
* @version ����ʱ�䣺2017��12��3�� ����5:21:36 
* @description ˵����UserDaoImpl
*/
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	@Override
	public User findUserById(Integer id) throws Exception {
		SqlSession sqlSession = this.getSqlSession();
		
		/* 
		 * userDao.findUserById 
		 * userDaoΪ UserMapper.xml ��Ӧ�� namespace
		 * findUserById Ϊ��Ӧnamespace �µ� id
		 **/
		
		User user = sqlSession.selectOne("userDao.findUserById", 1);
		return user;
	}

}
