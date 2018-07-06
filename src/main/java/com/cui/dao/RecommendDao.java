package com.cui.dao;

import com.cui.po.data.recommend.RecommendPO;
import com.cui.po.request.recommend.RecommendPORequest;
import com.cui.po.result.recommend.RecommendPOResult;

/**
 * Created by Promisesaybye on 2018/7/6.
 */
public interface RecommendDao {

    public RecommendPOResult insert(RecommendPO recommendPO);

    public RecommendPOResult delete(RecommendPO recommendPO);

    public RecommendPOResult update(RecommendPO recommendPO);

    public RecommendPOResult queryByRequest(RecommendPORequest request);
}
