package spring_mybatis;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.song.mapper.UserMapper;
import com.song.po.User;

public class UserTest {
	
	private ApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() throws Exception {
		UserMapper userMapper = (UserMapper) context.getBean("userMapper");
		User user = userMapper.findUserById(1);
		System.out.println(user.getUsername());
	}

}
