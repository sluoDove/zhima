package com.zyt.zhima.service;

import com.zyt.zhima.mapper.SysFileInfoMapper;
import com.zyt.zhima.model.SysFileInfo;
import com.zyt.zhima.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author ls
 * @date 2019/11/18
 * @desc
 */
@Slf4j
@Service
public class FileInfoService {

    @Autowired
    private SysFileInfoMapper fileInfoMapper;

    @Value("${zhima.image_server}")
    private String imageServer;


    /**
     * 根据文件id获取服务器文件路径
     * @param fileId
     * @return
     */
    public String filePath(String fileId){

        SysFileInfo fileInfo = fileInfoMapper.selectByPrimaryKey(fileId);
        if (fileInfo != null) {
            String filePath = fileInfo.getFilePath();
            if (StringUtils.isNotBlank(filePath) && filePath.indexOf("/") != -1){
                String s1 = filePath.substring(filePath.lastIndexOf("/") + 1, filePath.length());
                return imageServer + s1;
            }
        }

        return null;
    }

}
