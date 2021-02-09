package com.redis.service;

import java.util.List;

import com.redis.model.User;

public interface UserService {

	public boolean saveUser(User user);

	public List<User> getUsers();

	public User getUserById(Long id);

	public boolean deleteUserById(Long id);

	public boolean saveUser(Long id, User user);

}
