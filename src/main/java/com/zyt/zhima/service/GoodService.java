package com.zyt.zhima.service;

import com.zyt.zhima.dto.GoodDto;
import com.zyt.zhima.mapper.GoodMapper;
import com.zyt.zhima.model.Good;
import com.zyt.zhima.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Map;

/**
 * @author ls
 * @date 2019/11/18
 * @desc
 */
@Service
@Slf4j
public class GoodService {

    @Autowired
    private GoodMapper goodMapper;

    @Autowired
    private FileInfoService fileInfoService;

    /**
     * 首页商品
     * @return
     */
    public List<Map<String,Object>> goods(){

        log.info("首页商品列表");

        List<Map<String,Object>> list = goodMapper.goodHome();
        if (!CollectionUtils.isEmpty(list)){
            list.stream().forEach(stringObjectMap -> {
                Object filePath = stringObjectMap.get("filePath");
                if (!ObjectUtils.isEmpty(filePath)){
                    String path = String.valueOf(filePath);
                    String s = path.substring(path.lastIndexOf("/") + 1,path.length());
                    stringObjectMap.put("filePath",s);
                }
            });
        }

        return list;
    }


    /**
     * 商品详情
     * @param goodDto
     * @return
     */
    public GoodDto goodDetail(GoodDto goodDto){

        Long id = goodDto.getGoodId();
        Good good = goodMapper.selectByPrimaryKey(id);
        GoodDto dto = new GoodDto();
        BeanUtils.copyProperties(good,dto);
        //图片
        String img = good.getImg();
        if (StringUtils.isNotBlank(img)){
            String filePath = fileInfoService.filePath(img);
            dto.setImg(filePath);
        }

        return dto;
    }

}
