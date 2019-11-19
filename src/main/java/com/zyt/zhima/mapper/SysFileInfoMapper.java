package com.zyt.zhima.mapper;

import com.zyt.zhima.model.SysFileInfo;
import com.zyt.zhima.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysFileInfoMapper extends MyMapper<SysFileInfo> {

    List<String> carouselLocs(List<String> list);

}