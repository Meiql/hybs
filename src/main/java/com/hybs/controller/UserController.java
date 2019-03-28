package com.hybs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hybs.pojo.User;
import com.hybs.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping("/login")
	//@ResponseBody
	public String login() {
		
		User user = new User() ;
		
		user.setName("000");
		user.setPassword("000");
		
		Integer size = userService.login(user);
		return "index";
/*		if(size == 1 ) {
			return  "成功";
		}else {
			return "失败";
		}
			*/	
	}
	@RequestMapping("/{id}")

	public String userList(@PathVariable String id) {	
		System.out.println(id);
		return id;
				//userService.userList().toString();
		
	}
	

}
