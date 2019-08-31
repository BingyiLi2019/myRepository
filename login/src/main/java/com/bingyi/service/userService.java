package com.bingyi.service;

import java.util.List;

import com.bingyi.pojo.User;
import com.bingyi.util.Page;

public interface userService{
	public int selUser(User user);
	
	public List<User> selAll();
	
	public int delUser(int id);
	
	public int insUser(User user);
	
	public int updUser(User user);
	
	public List<User> selByName(String name);

	public Page selectPage(int pageNum, int pageSize);

	public int delBatchUser(int[] ids);
}
