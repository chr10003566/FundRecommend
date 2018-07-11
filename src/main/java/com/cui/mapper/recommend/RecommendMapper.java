package com.cui.mapper.recommend;

import com.cui.po.data.recommend.RecommendPO;

/**
 * Created by Promisesaybye on 2018/7/6.
 */
public interface RecommendMapper {
    public int insert(RecommendPO recommendPO);

    public int delete(Long id);

//    public int update(RecommendPO recommendPO);
}
