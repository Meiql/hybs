package com.hybs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hybs")
public class IndexController {

	@RequestMapping("/{id}")
	public String index(@PathVariable String id) {
		return id;
		
	}
	@RequestMapping("/{id}/{id1}")
	public String indexs(@PathVariable String id,@PathVariable String id1) {
		return id1+".html";
		
	}
}
