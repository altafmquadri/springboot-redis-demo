package com.redis.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.redis.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@SuppressWarnings("rawtypes")
	@Autowired
	private RedisTemplate redisTemplate;
	
	private static final String KEY = "USER";

	@SuppressWarnings("unchecked")
	@Override
	public boolean saveUser(User user) {
		try {
			redisTemplate.opsForHash().put(KEY, user.getId().toString(), user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers() {
		List<User> users;
		users = redisTemplate.opsForHash().values(KEY);
		return users;
	}

	@SuppressWarnings("unchecked")
	@Override
	public User getUserById(Long id) {
		User user = (User) redisTemplate.opsForHash().get(KEY, id.toString());
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean deleteUserById(Long id) {
		try {
			redisTemplate.opsForHash().delete(KEY, id.toString());
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean saveUser(Long id, User user) {
		try {
			redisTemplate.opsForHash().put(KEY, id.toString(), user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
