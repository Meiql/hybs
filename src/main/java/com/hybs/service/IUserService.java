package com.hybs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hybs.pojo.User;


@Service
public interface IUserService {
	public Integer login(User user);
	public List<User> userList();
}
