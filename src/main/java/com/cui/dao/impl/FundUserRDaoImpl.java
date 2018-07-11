package com.cui.dao.impl;

import com.cui.dao.FundUserRDao;
import com.cui.mapper.recommend.FundUserRMapper;
import com.cui.po.data.recommend.FundUserRPO;
import com.cui.po.request.recommend.FundUserRPORequest;
import com.cui.po.result.CommonResult;
import com.cui.po.result.recommend.FundUserRPOResult;
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
public class FundUserRDaoImpl implements FundUserRDao {
    @Resource
    private FundUserRMapper mapper;

    @Override
    public FundUserRPOResult insert(FundUserRPO fundUserRPO){
        FundUserRPOResult res = new FundUserRPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("插入失败");
        try {
            int count = mapper.insert(fundUserRPO);
            if(count > 0){
                res.setStatus(CommonResult.CODE.SUCCESS);
                res.setMessage("插入成功");
                List<FundUserRPO> list = new ArrayList<>();
                list.add(fundUserRPO);
                res.setFundUserRPOList(list);
                res.setCount(count);
            }

        }catch (Exception e){
            res.setException(e);
        }
        return res;
    }

    @Override
    public FundUserRPOResult update(FundUserRPO fundUserRPO){
        FundUserRPOResult res = new FundUserRPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("更新失败");
        try {
            int count = mapper.update(fundUserRPO);
            if(count > 0){
                res.setStatus(CommonResult.CODE.SUCCESS);
                res.setMessage("更新成功");
                List<FundUserRPO> list = new ArrayList<>();
                list.add(fundUserRPO);
                res.setFundUserRPOList(list);
                res.setCount(count);
            }

        }catch (Exception e){
            res.setException(e);
        }
        return res;
    }

    @Override
    public FundUserRPOResult delete(FundUserRPO fundUserRPO){
        FundUserRPOResult res = new FundUserRPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("删除失败");
        try {
            int count = mapper.delete(fundUserRPO.getId());
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
    public FundUserRPOResult queryByRequest(FundUserRPORequest request){return null;}
}
