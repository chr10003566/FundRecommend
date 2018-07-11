package com.cui.mapper.recommend;

import com.cui.po.data.recommend.RecommendDataPO;

public interface RecommendDataMapper {
    int delete(Integer id);

    int insert(RecommendDataPO record);

    int update(RecommendDataPO record);
}