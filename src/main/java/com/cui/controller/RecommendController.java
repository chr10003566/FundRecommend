package com.cui.controller;

import com.cui.po.data.recommend.RecommendPO;
import com.cui.po.result.recommend.RecommendPOResult;
import com.cui.service.RecommendService;
import com.cui.utils.GsonUtils;
import com.cui.vo.result.CommonResult;
import com.cui.vo.result.recommend.RecommendVOResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by Promisesaybye on 2018/6/30.
 */

@Controller
@RequestMapping("/cui")
public class RecommendController {

    @Resource
    private RecommendService service;

    @RequestMapping(value = "/recommend",method = RequestMethod.GET)
    public String recommend(){
        String res;
        RecommendVOResult result = new RecommendVOResult();

        RecommendPOResult poResult = new RecommendPOResult();
        RecommendPO recommendPO = new RecommendPO();
        recommendPO.setId(1);
        recommendPO.setProbability("adasd");
        recommendPO.setTaskBatch("dasd");
        recommendPO.setUserId("dasd");

        //测试接口
        poResult = service.test(recommendPO);
        if (poResult.isSuccess()){
            result.setStatus(CommonResult.CODE.SUCCESS);
            result.setMessage("数据插入数据库成功");
        }
        res = GsonUtils.gson.toJson(result);
        return res;
    }
}
