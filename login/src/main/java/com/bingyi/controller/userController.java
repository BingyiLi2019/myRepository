package com.bingyi.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bingyi.pojo.User;
import com.bingyi.service.userService;
import com.bingyi.util.MD5;

@Controller
public class userController {
	@Resource
	private userService userServiceImp;
	@RequestMapping("login")
	public String login(User user) {
		String pwd = user.getPwd();
		String md5Pwd = MD5.MD5(pwd);
		user.setPwd(md5Pwd);
		int flag = userServiceImp.selUser(user);
		if(flag>0) {			
			return "redirect:/show";
		}
		return "login";
	}
	
	@RequestMapping("show")
	public String show(Model model) {
		List<User> list = userServiceImp.selAll();
		model.addAttribute("list",list);
		return "main";
	}
	
	@RequestMapping("delete")
	public String delete(int id) {
		int flag = userServiceImp.delUser(id);
		if(flag>0) {
			return "redirect:/show";
		}
		return "error";
	}
	
	@RequestMapping("add")
	public String add(User user) {
		String pwd = user.getPwd();
		String md5Pwd = MD5.MD5(pwd);
		user.setPwd(md5Pwd);
		int flag = userServiceImp.insUser(user);
		if(flag>0) {
			return "redirect:/show";
		}
		return "error";
	}
	
	@RequestMapping("update")
	public String update(User user) {
		String pwd = user.getPwd();
		String md5Pwd = MD5.MD5(pwd);
		user.setPwd(md5Pwd);
		int flag = userServiceImp.updUser(user);
		if(flag>0) {
			return "redirect:/show";
		}
		return "error";
	}
	
	@RequestMapping("select")
	public String select(String name,Model model) {
		System.out.println(name);
		List<User> list = userServiceImp.selByName(name);
		model.addAttribute("list",list);
		return "main";
	}
}
