package com.cui.dao;

import com.cui.po.data.recommend.FundFlowPO;
import com.cui.po.request.recommend.FundFlowPORequest;
import com.cui.po.result.recommend.FundFlowPOResult;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 13:55
 */
public interface FundFlowDao {
    public FundFlowPOResult insert(FundFlowPO recommendPO);

    public FundFlowPOResult delete(FundFlowPO recommendPO);

    public FundFlowPOResult update(FundFlowPO recommendPO);

    public FundFlowPOResult queryByRequest(FundFlowPORequest request);
}
