package com.zyt.zhima.service;

import com.zyt.zhima.mapper.CarouselMapper;
import com.zyt.zhima.mapper.SysFileInfoMapper;
import com.zyt.zhima.model.Carousel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ls
 * @date 2019/11/18
 * @desc
 */
@Service
public class CarouselService {

    @Value("${zhima.image_server}")
    private String imageServer;

    @Autowired
    private CarouselMapper carouselMapper;

    @Autowired
    private SysFileInfoMapper fileInfoMapper;

    /**
     * 首页轮播图
     * @return
     */
    public List<String> carousels(){
        List<Carousel> carousels = carouselMapper.selectAll();
        if (!CollectionUtils.isEmpty(carousels)){
            List<String> pics = carousels.stream().map(carousel -> carousel.getPic()).collect(Collectors.toList());

            //获取图片路径
            List<String> list = fileInfoMapper.carouselLocs(pics);
            return list.stream().filter(s -> !StringUtils.isEmpty(s)).map(s -> {
                String s1 = s.substring(s.lastIndexOf("/") + 1,s.length());
                return imageServer + s1;
            }).collect(Collectors.toList());
        }

        return null;
    }

}
