package com.bingyi.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bingyi.mapper.userMapper;
import com.bingyi.pojo.User;
import com.bingyi.service.userService;

@Service
public class userServiceImp implements userService{
	@Resource
	private userMapper userMapper;
	@Override
	public int selUser(User user) {
		return userMapper.selectUser(user);
	}
	@Override
	public List<User> selAll() {
		return userMapper.selectAll();
	}
	@Override
	public int delUser(int id) {
		return userMapper.deleteUser(id);
	}
	@Override
	public int insUser(User user) {
		return userMapper.insertUser(user);
	}
	@Override
	public int updUser(User user) {
		return userMapper.updateUser(user);
	}
	
}
