package com.bingyi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bingyi.pojo.User;

public interface userMapper {
	@Select("select * from user where name=#{name} and pwd=#{pwd}")
	public int selectUser(User user);
	
	@Select("select * from user")
	public List<User> selectAll();
	
	@Delete("delete from user where id=#{0}")
	public int deleteUser(int id);
	
	@Insert("insert into user values (default,#{name},#{pwd})")
	public int insertUser(User user);
	
	@Update("update user set name=#{name},pwd=#{pwd} where id=#{id} ")
	public int updateUser(User user);
}
