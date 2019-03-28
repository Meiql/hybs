package com.hybs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hybs.pojo.User;
@Mapper
public interface UserDao {
 Integer login(User user);
 List<User> userList();
 String count();
}
