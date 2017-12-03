package spring_mybatis;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.song.dao.UserDao;
import com.song.po.User;

public class UserTest {
	
	private ApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() throws Exception {
		UserDao userDao = (UserDao) context.getBean("userDao");
		User user = userDao.findUserById(1);
		System.out.println(user.getUsername());
	}

}
