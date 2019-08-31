package com.bingyi.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSException;

import com.bingyi.mapper.userMapper;
import com.bingyi.pojo.User;
import com.bingyi.service.userService;
import com.bingyi.util.Page;

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
	@Override
	public List<User> selByName(String name) {
		// TODO Auto-generated method stub
		return userMapper.selectByName(name);
	}
	@Override
	public Page selectPage(int pageNum, int pageSize) {
		Page page=new Page(pageNum, pageSize);
		int startIndex = page.getStartIndex();
		
		List<User> dataList=userMapper.selectList(startIndex,pageSize);
		page.setDataList(dataList);
		int totalSize =userMapper.selectCount();
		page.setTotalSize(totalSize);
		return page;
		
	}
	@Override
	public int delBatchUser(int[] ids) {
		int flag=0;
		for (int id : ids) {
			flag += userMapper.deleteUser(id);
		}
		if (flag!=ids.length) {
			throw new RuntimeException("ÅúÉ¾³ýÒì³£");
		}
		return flag;
	}
	
}
