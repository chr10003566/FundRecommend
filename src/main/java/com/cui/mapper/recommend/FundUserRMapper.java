package com.cui.mapper.recommend;

import com.cui.po.data.recommend.FundUserRPO;

public interface FundUserRMapper {
    int delete(Integer id);

    int insert(FundUserRPO record);

    int update(FundUserRPO record);
}