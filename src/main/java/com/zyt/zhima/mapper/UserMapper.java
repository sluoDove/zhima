package com.zyt.zhima.mapper;

import com.zyt.zhima.model.User;
import com.zyt.zhima.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends MyMapper<User> {
}