package com.cui.dao.impl;

import com.cui.dao.RecommendDataDao;
import com.cui.mapper.recommend.FundFlowMapper;
import com.cui.mapper.recommend.RecommendDataMapper;
import com.cui.po.data.recommend.FundUserRPO;
import com.cui.po.data.recommend.RecommendDataPO;
import com.cui.po.request.recommend.RecommendDataPORequest;
import com.cui.po.result.CommonResult;
import com.cui.po.result.recommend.RecommendDataPOResult;
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
public class RecommendDataDaoImpl implements RecommendDataDao {
    @Resource
    private RecommendDataMapper mapper;

    @Override
    public RecommendDataPOResult insert(RecommendDataPO recommendDataPO) {
        RecommendDataPOResult res = new RecommendDataPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("插入失败");
        try {
            int count = mapper.insert(recommendDataPO);
            if(count > 0){
                res.setStatus(CommonResult.CODE.SUCCESS);
                res.setMessage("插入成功");
                List<RecommendDataPO> list = new ArrayList<>();
                list.add(recommendDataPO);
                res.setRecommendDataPOList(list);
                res.setCount(count);
            }

        }catch (Exception e){
            res.setException(e);
        }
        return res;
    }

    @Override
    public RecommendDataPOResult update(RecommendDataPO recommendDataPO) {
        RecommendDataPOResult res = new RecommendDataPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("更新失败");
        try {
            int count = mapper.update(recommendDataPO);
            if(count > 0){
                res.setStatus(CommonResult.CODE.SUCCESS);
                res.setMessage("更新成功");
                List<RecommendDataPO> list = new ArrayList<>();
                list.add(recommendDataPO);
                res.setRecommendDataPOList(list);
                res.setCount(count);
            }

        }catch (Exception e){
            res.setException(e);
        }
        return res;
    }

    @Override
    public RecommendDataPOResult delete(RecommendDataPO recommendDataPO){
        RecommendDataPOResult res = new RecommendDataPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("删除失败");
        try {
            int count = mapper.delete(recommendDataPO.getId());
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
    public RecommendDataPOResult queryByRequest(RecommendDataPORequest request) {
        return null;
    }
}
