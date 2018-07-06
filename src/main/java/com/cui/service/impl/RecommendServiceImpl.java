package com.cui.service.impl;

import com.cui.dao.RecommendDao;
import com.cui.po.data.recommend.RecommendPO;
import com.cui.po.result.recommend.RecommendPOResult;
import com.cui.service.RecommendService;
import com.cui.vo.result.recommend.RecommendVOResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Promisesaybye on 2018/6/30.
 */
@Service("recommendService")
public class RecommendServiceImpl implements RecommendService {


    @Resource
    private RecommendDao recommendDao;


    @Override
    public RecommendPOResult test(RecommendPO recommendPO) {
        RecommendPOResult res = new RecommendPOResult();
        try {
            res =recommendDao.insert(recommendPO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public void calSimilarity() {

    }

    @Override
    public RecommendVOResult cal() {
        return null;
    }
}
