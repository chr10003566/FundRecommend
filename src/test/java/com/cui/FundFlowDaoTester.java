package com.cui;

import com.cui.dao.FundFlowDao;
import com.cui.po.data.UserPO;
import com.cui.po.data.recommend.FundFlowPO;
import com.cui.po.result.CommonResult;
import com.cui.po.result.UserPOResult;
import com.cui.po.result.recommend.FundFlowPOResult;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 14:36
 */
public class FundFlowDaoTester extends BaseTester {

    @Resource
    private FundFlowDao fundFlowDao;

    private FundFlowPO generateData(){
        FundFlowPO fundFlowPO = new FundFlowPO();
        fundFlowPO.setTxnCfmDt("1");
        fundFlowPO.setId(1);
        return fundFlowPO;
    }

    @Test
    public void testInsert() throws Exception{
        FundFlowPO fundFlowPO = this.generateData();
        FundFlowPOResult res  = fundFlowDao.insert(fundFlowPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("插入成功",res.getStatus(), CommonResult.CODE.SUCCESS);
    }

    @Test
    public void testUpdate() throws Exception{
        FundFlowPO fundFlowPO = this.generateData();
        fundFlowPO.setTxnCfmDt("修改成功");
        FundFlowPOResult res  = fundFlowDao.update(fundFlowPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("修改成功",res.getStatus(), CommonResult.CODE.SUCCESS);
    }

    @Test
    public void testDelete() throws Exception{
        FundFlowPO fundFlowPO = this.generateData();
        FundFlowPOResult res  = fundFlowDao.delete(fundFlowPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("删除成功",res.getStatus(), CommonResult.CODE.SUCCESS);
    }



}
