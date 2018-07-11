package com.cui.dao;

import com.cui.po.data.recommend.FundUserRPO;
import com.cui.po.request.recommend.FundUserRPORequest;
import com.cui.po.result.recommend.FundUserRPOResult;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 13:56
 */
public interface FundUserRDao {
    public FundUserRPOResult insert(FundUserRPO recommendPO);

    public FundUserRPOResult delete(FundUserRPO recommendPO);

    public FundUserRPOResult update(FundUserRPO recommendPO);

    public FundUserRPOResult queryByRequest(FundUserRPORequest request);
}
