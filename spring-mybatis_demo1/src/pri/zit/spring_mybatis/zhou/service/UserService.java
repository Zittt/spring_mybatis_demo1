package pri.zit.spring_mybatis.zhou.service;

import java.util.List;

import pri.zit.spring_mybatis.zhou.domain.User;

public interface UserService {
	
	public User getUserById(Integer id);
	
	public List<User> getAll();
	
	public int addUser(User user);
	
	public int updateUser(User user);
	
	public int deleteUser(Integer id);
}
