package com.zyt.zhima.controller;

import com.zyt.zhima.dto.GoodDto;
import com.zyt.zhima.dto.OrderDto;
import com.zyt.zhima.entity.AjaxResponse;
import com.zyt.zhima.entity.BaseController;
import com.zyt.zhima.model.Good;
import com.zyt.zhima.service.CarouselService;
import com.zyt.zhima.service.GoodService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author ls
 * @date 2019/11/18
 * @desc 首页
 */
@Controller
@RequestMapping("/index")
public class IndexController extends BaseController{

    @Autowired
    private GoodService goodService;

    @Autowired
    private CarouselService carouselService;


    /**
     * 首页
     * @param model
     * @return
     */
    @RequestMapping("/")
    public String indexPage(Model model){

        List<Map<String,Object>> goods = goodService.goods();
        List<String> carousels = carouselService.carousels();

        model.addAttribute("goods",goods);
        model.addAttribute("carousels",carousels);

        return "index";
    }


    /**
     * 商品详情
     * @return
     */
    @RequestMapping("/good_detail")
    public String detail(@RequestBody GoodDto goodDto) {

        goodDto = goodService.goodDetail(goodDto);
        return "good_detail";
    }


    /**
     * 点击领取
     * @return
     */
    @RequestMapping("/order")
    public AjaxResponse order(@RequestBody OrderDto orderDto){



        return responseSuccess(null);
    }



}
