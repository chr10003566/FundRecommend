package com.cui.service;

import com.cui.po.data.recommend.RecommendPO;
import com.cui.po.result.recommend.RecommendPOResult;
import com.cui.vo.result.recommend.RecommendVOResult;

/**
 * Created by Promisesaybye on 2018/6/30.
 */
public interface RecommendService {

    public RecommendPOResult test(RecommendPO recommendPO);

    public void calSimilarity();

    public RecommendVOResult cal();
}
