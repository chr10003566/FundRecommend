package com.cui.dao;


import com.cui.po.data.recommend.RecommendDataPO;
import com.cui.po.request.recommend.RecommendDataPORequest;
import com.cui.po.result.recommend.RecommendDataPOResult;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 13:56
 */
public interface RecommendDataDao {
    public RecommendDataPOResult insert(RecommendDataPO recommendPO);

    public RecommendDataPOResult delete(RecommendDataPO recommendPO);

    public RecommendDataPOResult update(RecommendDataPO recommendPO);

    public RecommendDataPOResult queryByRequest(RecommendDataPORequest request);
}
