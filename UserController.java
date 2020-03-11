package com.sanmao.controller;

import java.util.List;

import com.sanmao.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanmao.Users;
import com.sanmao.service.UserService;

/**
 * 操作UserController
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	/*
	 * 添加用户
	 */
	@RequestMapping("/addUser")
	public String addUser(Users user){
		this.userService.addUser(user);
		return "ok";
	}
	
	/*
	 * 查询所有用户
	 */
	@RequestMapping("/findUser")
	public String findUser(Model model){
		List<Users> list = this.userService.findUser();
		model.addAttribute("list", list);
		return "showUser";
	}
}
