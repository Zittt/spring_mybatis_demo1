package pri.zit.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import pri.zit.spring_mybatis.zhou.domain.User;
import pri.zit.spring_mybatis.zhou.service.UserService;

public class Test1 {
	
	ApplicationContext context = null;
	UserService userService = null;
	
	@Before
	public void get1() {
		this.context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		this.userService = (UserService) context.getBean("userService");
	}
	
	@After
	public void close1() {
	}
	
	
	
	@Test
	public void test2() {
		User user = userService.getUserById(1);
		System.out.println(user);
	}
	
	@Test
	public void testInsert() {
		User user = new User();
		user.setUid(37);
		user.setAge(23);
		user.setAddress("上海");
		user.setUsername("小红");
		System.out.println(userService.addUser(user));
	}
}
