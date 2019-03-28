package com.hybs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hybs.dao.UserDao;
import com.hybs.pojo.User;
import com.hybs.service.IUserService;
@Service
public class UserService implements IUserService {
	@Autowired
	private UserDao userDao;

	@Override
	public Integer login(User user) {
		// TODO Auto-generated method stub
		System.out.println(user);
		Integer size = userDao.login(user);

		return size;
	}
	@Override
	public List<User> userList() {
		// TODO Auto-generated method stub
		
		return userDao.userList();
	}

}
