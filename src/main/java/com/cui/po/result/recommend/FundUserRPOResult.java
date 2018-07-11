package com.cui.po.result.recommend;



import com.cui.po.data.recommend.FundUserRPO;
import com.cui.po.result.CommonResult;

import java.util.List;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 14:07
 */
public class FundUserRPOResult extends CommonResult {
    private List<FundUserRPO> fundUserRPOList;

    public List<FundUserRPO> getFundUserRPOList() {
        return fundUserRPOList;
    }

    public void setFundUserRPOList(List<FundUserRPO> fundUserRPOList) {
        this.fundUserRPOList = fundUserRPOList;
    }
}
