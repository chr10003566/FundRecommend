package com.cui.dao.impl;

import com.cui.dao.RecommendDao;
import com.cui.mapper.recommend.RecommendMapper;
import com.cui.po.data.recommend.RecommendPO;
import com.cui.po.request.recommend.RecommendPORequest;
import com.cui.po.result.CommonResult;
import com.cui.po.result.recommend.RecommendPOResult;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Promisesaybye on 2018/7/6.
 */
@Repository
public class RecommendDaoImpl implements RecommendDao {

    @Resource
    private RecommendMapper mapper;

    @Override
    public RecommendPOResult insert(RecommendPO recommendPO) {
        RecommendPOResult res = new RecommendPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("插入失败");
        try {
            int count = mapper.insert(recommendPO);
            if (count > 0){
                res.setStatus(CommonResult.CODE.SUCCESS);
                res.setMessage("添加成功");
                List<RecommendPO> list = new ArrayList<RecommendPO>();
                list.add(recommendPO);
                res.setRecommendPOList(list);
                res.setCount(list.size());
            }
        } catch (Exception e) {
            res.setException(e);
        }
        return res;

    }

    @Override
    public RecommendPOResult delete(RecommendPO recommendPO) {
        return null;
    }

    @Override
    public RecommendPOResult update(RecommendPO recommendPO) {
        return null;
    }

    @Override
    public RecommendPOResult queryByRequest(RecommendPORequest request) {
        return null;
    }
}
