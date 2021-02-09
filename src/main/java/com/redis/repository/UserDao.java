package com.redis.repository;

import java.util.List;

import com.redis.model.User;

public interface UserDao {

	boolean saveUser(User user);

	public List<User> getUsers();

	User getUserById(Long id);

	boolean deleteUserById(Long id);

	boolean saveUser(Long id, User savedUser);

}
