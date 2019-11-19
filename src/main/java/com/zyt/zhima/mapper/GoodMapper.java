package com.zyt.zhima.mapper;

import com.zyt.zhima.model.Good;
import com.zyt.zhima.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GoodMapper extends MyMapper<Good> {

    List<Map<String,Object>> goodHome();

}