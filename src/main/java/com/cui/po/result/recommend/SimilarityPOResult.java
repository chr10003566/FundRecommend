package com.cui.po.result.recommend;



import com.cui.po.data.recommend.SimilarityPO;
import com.cui.po.result.CommonResult;

import java.util.List;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 14:07
 */
public class SimilarityPOResult extends CommonResult {
    private List<SimilarityPO> similarityPOList;

    public List<SimilarityPO> getRecommendPOList() {
        return similarityPOList;
    }

    public void setSimilarityPOList(List<SimilarityPO> similarityPOList) {
        this.similarityPOList = similarityPOList;
    }
}
