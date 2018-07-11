package com.cui.dao;


import com.cui.po.data.recommend.SimilarityPO;
import com.cui.po.request.recommend.SimilarityPORequest;
import com.cui.po.result.recommend.SimilarityPOResult;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 13:56
 */
public interface SimilarityDao {
    public SimilarityPOResult insert(SimilarityPO recommendPO);

    public SimilarityPOResult delete(SimilarityPO recommendPO);

    public SimilarityPOResult update(SimilarityPO recommendPO);

    public SimilarityPOResult queryByRequest(SimilarityPORequest request);
}
