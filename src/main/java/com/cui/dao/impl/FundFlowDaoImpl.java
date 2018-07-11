package com.cui.dao.impl;

import com.cui.dao.FundFlowDao;
import com.cui.mapper.recommend.FundFlowMapper;
import com.cui.po.data.recommend.FundFlowPO;
import com.cui.po.data.recommend.RecommendPO;
import com.cui.po.request.recommend.FundFlowPORequest;
import com.cui.po.result.CommonResult;
import com.cui.po.result.recommend.FundFlowPOResult;
import com.cui.po.result.recommend.RecommendPOResult;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 13:57
 */
@Repository
public class FundFlowDaoImpl implements FundFlowDao {

    @Resource
    private FundFlowMapper mapper;

    @Override
    public FundFlowPOResult insert(FundFlowPO fundFlowPO){
        FundFlowPOResult res = new FundFlowPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("插入失败");
        try {
            int count = mapper.insert(fundFlowPO);
            if (count > 0){
                res.setStatus(CommonResult.CODE.SUCCESS);
                res.setMessage("插入成功");
                List<FundFlowPO> list = new ArrayList<FundFlowPO>();
                list.add(fundFlowPO);
                res.setFundFlowPOList(list);
                res.setCount(list.size());
            }
        } catch (Exception e) {
            res.setException(e);
        }
        return res;
    }

    @Override
    public FundFlowPOResult update(FundFlowPO fundFlowPO) {
        FundFlowPOResult res = new FundFlowPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("更新失败");
        try {
            int count = mapper.update(fundFlowPO);
            if (count > 0){
                res.setStatus(CommonResult.CODE.SUCCESS);
                res.setMessage("更新成功");
                List<FundFlowPO> list = new ArrayList<FundFlowPO>();
                list.add(fundFlowPO);
                res.setFundFlowPOList(list);
                res.setCount(list.size());
            }
        } catch (Exception e) {
            res.setException(e);
        }
        return res;
    }

    @Override
    public FundFlowPOResult delete(FundFlowPO fundFlowPO) {
        FundFlowPOResult res = new FundFlowPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("删除失败");
        try {
            int count = mapper.delete(fundFlowPO.getId());
            if (count > 0){
                res.setStatus(CommonResult.CODE.SUCCESS);
                res.setMessage("删除成功");
                res.setCount(count);
            }
        } catch (Exception e) {
            res.setException(e);
        }
        return res;
    }

    @Override
    public FundFlowPOResult queryByRequest(FundFlowPORequest request){
        return null;
    }

}
