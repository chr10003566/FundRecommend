package com.cui.mapper.recommend;

import com.cui.po.data.recommend.SimilarityPO;

public interface SimilarityMapper {
    int delete(Integer id);

    int insert(SimilarityPO record);

    int update(SimilarityPO record);
}