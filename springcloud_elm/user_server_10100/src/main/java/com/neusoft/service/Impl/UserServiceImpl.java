package com.neusoft.service.Impl;

import com.neusoft.mapper.UserMapper;
import com.neusoft.po.User;
import com.neusoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public User getUserByIdByPass(User user) {
		return userMapper.getUserByIdByPass(user);
	}

	@Override
	public int getUserById(String userId) {
		return userMapper.getUserById(userId);
	}

	@Override
	public int saveUser(User user) {
		System.out.println(user.getUserId());
		//创建用户
		return userMapper.saveUser(user);
	}
}