package com.cui;

import com.cui.dao.FundFlowDao;
import com.cui.dao.RecommendDataDao;
import com.cui.po.data.recommend.FundFlowPO;
import com.cui.po.data.recommend.RecommendDataPO;
import com.cui.po.result.CommonResult;
import com.cui.po.result.recommend.FundFlowPOResult;
import com.cui.po.result.recommend.RecommendDataPOResult;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 14:36
 */
public class RecommendDataDaoTester extends BaseTester {
    @Resource
    private RecommendDataDao recommendDataDao;

    private RecommendDataPO generateData(){
        RecommendDataPO recommendDataPO = new RecommendDataPO();
        recommendDataPO.setUserid("1");
        recommendDataPO.setId(1);
        return recommendDataPO;
    }

    @Test
    public void testInsert() throws Exception{
        RecommendDataPO recommendDataPO = this.generateData();
        RecommendDataPOResult res  = recommendDataDao.insert(recommendDataPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("插入成功",res.getStatus(), CommonResult.CODE.SUCCESS);
    }

    @Test
    public void testUpdate() throws Exception{
        RecommendDataPO recommendDataPO = this.generateData();
        recommendDataPO.setUserid("修改成功");
        RecommendDataPOResult res  = recommendDataDao.update(recommendDataPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("修改成功",res.getStatus(), CommonResult.CODE.SUCCESS);
    }

    @Test
    public void testDelete() throws Exception{
        RecommendDataPO recommendDataPO = this.generateData();
        RecommendDataPOResult res  = recommendDataDao.delete(recommendDataPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("删除成功",res.getStatus(), CommonResult.CODE.SUCCESS);
    }
}
