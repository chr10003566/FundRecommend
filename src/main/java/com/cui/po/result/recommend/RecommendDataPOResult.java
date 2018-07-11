package com.cui.po.result.recommend;



import com.cui.po.data.recommend.RecommendDataPO;
import com.cui.po.result.CommonResult;

import java.util.List;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 14:07
 */
public class RecommendDataPOResult extends CommonResult {
    private List<RecommendDataPO> recommendDataPOList;

    public List<RecommendDataPO> getRecommendPOList() {
        return recommendDataPOList;
    }

    public void setRecommendDataPOList(List<RecommendDataPO> recommendDataPOList) {
        this.recommendDataPOList = recommendDataPOList;
    }
}
