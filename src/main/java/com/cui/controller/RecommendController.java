package com.cui.controller;

import com.cui.service.RecommendService;
import com.cui.utils.StringUtils;
import com.cui.vo.param.RecommendParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Promisesaybye on 2018/6/30.
 */

@Controller
@RequestMapping("/cui")
public class RecommendController {

    @Resource
    private RecommendService service;

    @RequestMapping(value = "recommend", method = RequestMethod.POST)
    public ModelAndView recommend(HttpServletRequest req, RecommendParam param) throws Exception{
        ModelAndView mav = new ModelAndView();  //创建一个jsp页面对象
        mav.setViewName("home");

        if (null == param){
            mav.addObject("message", "推荐信息不能为空！");  //加入提示信息
            return mav; //返回页面
        }

        return mav;
    }
}
