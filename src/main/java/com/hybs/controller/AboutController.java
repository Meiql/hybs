package com.hybs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class AboutController {
	@RequestMapping("/{id}")
	public String index(@PathVariable String id) {
		System.out.println(id);
		return id+".html";
		
	}
}
