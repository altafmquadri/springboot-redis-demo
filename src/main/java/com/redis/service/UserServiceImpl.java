package com.redis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redis.model.User;
import com.redis.repository.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean saveUser(User user) {
		return userDao.saveUser(user);
	}

	@Override
	public List<User> getUsers() {
		return userDao.getUsers();
	}

	@Override
	public User getUserById(Long id) {
		return userDao.getUserById(id);
	}

	@Override
	public boolean deleteUserById(Long id) {
		return userDao.deleteUserById(id);
	}

	@Override
	public boolean saveUser(Long id, User user) {
		return userDao.saveUser(id, user);
	}

	

}
