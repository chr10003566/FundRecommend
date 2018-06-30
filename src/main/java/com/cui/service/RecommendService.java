package com.cui.service;

import com.cui.vo.result.RecommendVOResult;

/**
 * Created by Promisesaybye on 2018/6/30.
 */
public interface RecommendService {

    public void calSimilarity();

    public RecommendVOResult cal();
}
