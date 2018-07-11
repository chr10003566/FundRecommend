package com.cui.mapper.recommend;

import com.cui.po.data.recommend.FundFlowPO;

public interface FundFlowMapper {
    int delete(Integer id);

    int insert(FundFlowPO record);
    
    int update(FundFlowPO record);
}