package pri.zit.spring_mybatis.zhou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pri.zit.spring_mybatis.zhou.dao.UserMapper;
import pri.zit.spring_mybatis.zhou.domain.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userDao;
	
	
	@Override
	public User getUserById(Integer id) {
		
		return userDao.selectByPrimaryKey(id);
	}

	@Override
	public List<User> getAll() {
		
		return userDao.selectAll();
	}

	@Override
	public int addUser(User user) {
		return userDao.insert(user);
	}

	@Override
	public int updateUser(User user) {
		return userDao.updateByPrimaryKey(user);
		
	}

	@Override
	public int deleteUser(Integer id) {
		return userDao.deleteByPrimaryKey(id);
	}

}
