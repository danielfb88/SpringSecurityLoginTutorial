package com.dboffice.auth.service;

import com.dboffice.auth.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
