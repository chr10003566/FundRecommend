package com.cui.po.result.recommend;



import com.cui.po.data.recommend.FundFlowPO;
import com.cui.po.result.CommonResult;

import java.util.List;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 14:06
 */
public class FundFlowPOResult extends CommonResult {
    private List<FundFlowPO> fundFlowPOList;

    public List<FundFlowPO> getFundFlowPOList() {
        return fundFlowPOList;
    }

    public void setFundFlowPOList(List<FundFlowPO> fundFlowPOList) {
        this.fundFlowPOList = fundFlowPOList;
    }
}
