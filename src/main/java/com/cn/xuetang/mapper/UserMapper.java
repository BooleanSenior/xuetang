package com.cn.xuetang.mapper;


import com.cn.xuetang.po.User;
import com.cn.xuetang.po.UserCustom;
import com.cn.xuetang.po.UserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface UserMapper {
	int deleteByPrimaryKey(Long id);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
//---------------------------------------------
	int insertUser(UserCustom userCustom);

	UserCustom loginUser(@Param("u_yhm")String u_yhm,@Param("u_paw")String u_paw);

	UserCustom selectOneUser(@Param("u_id")String u_id);

	int updateUser(UserCustom userCustom);
}