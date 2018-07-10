package com.cui.controller;


import com.cui.manager.ConvertManager;
import com.cui.po.data.UserPO;
import com.cui.Response.ResponseObj;
import com.cui.service.UserService;
import com.cui.utils.GsonUtils;
import com.cui.utils.StringUtils;
import com.cui.vo.data.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户请求相关控制器
 * <br/>Created by acheng on 2016/9/26.
 */
@Controller
@RequestMapping("/userAction")
public class UserController {

    @Resource
    private ConvertManager convertManager;

    @Autowired
    private UserService userService;    //自动载入Service对象
    private ResponseObj responseObj;


    /**
     * 为什么返回值是一个ModelAndView，ModelAndView代表一个web页面<br/>
     * setViewName是设置一个jsp页面的名称
     *
     * @param req  http请求
     * @param userVO 发起请求后，spring接收到请求，然后封装的bean数据
     * @return 返回一个web页面
     * @throws Exception
     */
    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public ModelAndView reg(HttpServletRequest req, UserVO userVO) throws Exception {
        ModelAndView mav = new ModelAndView();  //创建一个jsp页面对象
        mav.setViewName("home");    //设置JSP文件名

        UserPO userPO = convertManager.transForNormal(userVO, UserPO.class);

        if (null == userPO) {
            mav.addObject("message", "用户信息不能为空！");  //加入提示信息
            return mav; //返回页面
        }
        if (StringUtils.isEmpty(userPO.getLoginId()) || StringUtils.isEmpty(userPO.getPwd())) {
            mav.addObject("message", "用户名或密码不能为空！");
            return mav;
        }
        if (null != userService.findUser(userPO)) {
            mav.addObject("message", "用户已经存在！");
            return mav;
        }
        try {
            userService.add(userPO);
        } catch (Exception e) {
            e.printStackTrace();
            mav.addObject("message", "错误：用户其他信息错误");
            return mav;
        }
        mav.addObject("code", 110);
        mav.addObject("message", "恭喜。注册成功");
        req.getSession().setAttribute("userPO", userPO);
        return mav;
    }

    /**
     * 登录接口
     *
     * @param req
     * @param userVO
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = {
            "application/json; charset=utf-8"})
    @ResponseBody
    public ModelAndView login(HttpServletRequest req, UserVO userVO) {
        ModelAndView mav = new ModelAndView("home");
        String result;
        UserPO userPO = convertManager.transForNormal(userVO, UserPO.class);
        if (null == userPO) {
            responseObj = new ResponseObj<UserPO>();
            responseObj.setCode(ResponseObj.EMPUTY);
            responseObj.setMsg("登录信息不能为空");
            result = GsonUtils.gson.toJson(responseObj);
            mav.addObject("result", result);
            return mav; //返回页面
        }
        if (StringUtils.isEmpty(userPO.getLoginId()) || StringUtils.isEmpty(userPO.getPwd())) {
            responseObj = new ResponseObj<UserPO>();
            responseObj.setCode(ResponseObj.FAILED);
            responseObj.setMsg("用户名或密码不能为空");
            result = GsonUtils.gson.toJson(responseObj);
            mav.addObject("result", result);
            return mav;
        }
        //查找用户
        UserPO userPO1 = null;
        try {
            userPO1 = userService.findUser(userPO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (null == userPO1) {
            responseObj = new ResponseObj<UserPO>();
            responseObj.setCode(ResponseObj.EMPUTY);
            responseObj.setMsg("未找到该用户");
            result = GsonUtils.gson.toJson(responseObj);
        } else {
            if (userPO.getPwd().equals(userPO1.getPwd())) {
                responseObj = new ResponseObj<UserPO>();
                responseObj.setCode(ResponseObj.OK);
                responseObj.setMsg(ResponseObj.OK_STR);
                result = GsonUtils.gson.toJson(responseObj);
            } else {
                responseObj = new ResponseObj<UserPO>();
                responseObj.setCode(ResponseObj.FAILED);
                responseObj.setMsg("用户密码错误");
                result = GsonUtils.gson.toJson(responseObj);
            }
        }
        mav.addObject("result", result);
        return mav;
    }


}
