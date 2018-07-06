package com.cui.po.result.recommend;

import com.cui.po.data.recommend.RecommendPO;
import com.cui.po.result.CommonResult;

import java.util.List;

/**
 * Created by Promisesaybye on 2018/7/5.
 */
public class RecommendPOResult extends CommonResult {

    private List<RecommendPO> recommendPOList;

    public List<RecommendPO> getRecommendPOList() {
        return recommendPOList;
    }

    public void setRecommendPOList(List<RecommendPO> recommendPOList) {
        this.recommendPOList = recommendPOList;
    }
}
