package com.cui;

import com.cui.dao.FundFlowDao;
import com.cui.dao.FundUserRDao;
import com.cui.po.data.recommend.FundFlowPO;
import com.cui.po.data.recommend.FundUserRPO;
import com.cui.po.result.CommonResult;
import com.cui.po.result.recommend.FundFlowPOResult;
import com.cui.po.result.recommend.FundUserRPOResult;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 14:33
 */
public class FundUserRDaoTester extends BaseTester {
    @Resource
    private FundUserRDao fundUserRDao;

    private FundUserRPO generateData(){
        FundUserRPO fundUserRPO = new FundUserRPO();
        fundUserRPO.setScrTxnAccno("1");
        fundUserRPO.setId(1);
        return fundUserRPO;
    }

    @Test
    public void testInsert() throws Exception{
        FundUserRPO fundUserRPO = this.generateData();
        FundUserRPOResult res  = fundUserRDao.insert(fundUserRPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("插入成功",res.getStatus(), CommonResult.CODE.SUCCESS);
    }

    @Test
    public void testUpdate() throws Exception{
        FundUserRPO fundUserRPO = this.generateData();
        fundUserRPO.setScrTxnAccno("修改成功");
        FundUserRPOResult res  = fundUserRDao.update(fundUserRPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("修改成功",res.getStatus(), CommonResult.CODE.SUCCESS);
    }

    @Test
    public void testDelete() throws Exception{
        FundUserRPO fundFlowPO = this.generateData();
        FundUserRPOResult res  = fundUserRDao.delete(fundFlowPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("删除成功",res.getStatus(), CommonResult.CODE.SUCCESS);
    }
}
