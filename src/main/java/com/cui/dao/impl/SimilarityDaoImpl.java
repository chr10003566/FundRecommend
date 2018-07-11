package com.cui.dao.impl;

import com.cui.dao.SimilarityDao;
import com.cui.mapper.recommend.FundFlowMapper;
import com.cui.mapper.recommend.SimilarityMapper;
import com.cui.po.data.recommend.RecommendDataPO;
import com.cui.po.data.recommend.SimilarityPO;
import com.cui.po.request.recommend.SimilarityPORequest;
import com.cui.po.result.CommonResult;
import com.cui.po.result.recommend.SimilarityPOResult;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 13:58
 */
@Repository
public class SimilarityDaoImpl implements SimilarityDao {
    @Resource
    private SimilarityMapper mapper;


    @Override
    public SimilarityPOResult insert(SimilarityPO similarityPO) {
        SimilarityPOResult res = new SimilarityPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("插入失败");
        try {
            int count = mapper.insert(similarityPO);
            if(count > 0){
                res.setStatus(CommonResult.CODE.SUCCESS);
                res.setMessage("插入成功");
                List<SimilarityPO> list = new ArrayList<>();
                list.add(similarityPO);
                res.setSimilarityPOList(list);
                res.setCount(count);
            }

        }catch (Exception e){
            res.setException(e);
        }
        return res;
    }

    @Override
    public SimilarityPOResult update(SimilarityPO similarityPO) {
        SimilarityPOResult res = new SimilarityPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("更新失败");
        try {
            int count = mapper.update(similarityPO);
            if(count > 0){
                res.setStatus(CommonResult.CODE.SUCCESS);
                res.setMessage("更新成功");
                List<SimilarityPO> list = new ArrayList<>();
                list.add(similarityPO);
                res.setSimilarityPOList(list);
                res.setCount(count);
            }

        }catch (Exception e){
            res.setException(e);
        }
        return res;
    }

    @Override
    public SimilarityPOResult delete(SimilarityPO similarityPO) {
        SimilarityPOResult res = new SimilarityPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("删除失败");
        try {
            int count = mapper.delete(similarityPO.getId());
            if(count > 0){
                res.setStatus(CommonResult.CODE.SUCCESS);
                res.setMessage("删除成功");
                res.setCount(count);
            }

        }catch (Exception e){
            res.setException(e);
        }
        return res;
    }

    @Override
    public SimilarityPOResult queryByRequest(SimilarityPORequest request) {
        return null;
    }
}
