package com.cui;

import com.cui.dao.FundFlowDao;
import com.cui.dao.SimilarityDao;
import com.cui.po.data.recommend.FundFlowPO;
import com.cui.po.data.recommend.SimilarityPO;
import com.cui.po.result.CommonResult;
import com.cui.po.result.recommend.FundFlowPOResult;
import com.cui.po.result.recommend.SimilarityPOResult;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 14:35
 */
public class SimilarityDaoTester extends BaseTester {
    @Resource
    private SimilarityDao similarityDao;

    private SimilarityPO generateData(){
        SimilarityPO similarityPO = new SimilarityPO();
        similarityPO.setFundIdFirst("1");
        similarityPO.setId(1);
        return similarityPO;
    }

    @Test
    public void testInsert() throws Exception{
        SimilarityPO similarityPO = this.generateData();
        SimilarityPOResult res  = similarityDao.insert(similarityPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("插入成功",res.getStatus(), CommonResult.CODE.SUCCESS);
    }

    @Test
    public void testUpdate() throws Exception{
        SimilarityPO similarityPO = this.generateData();
        similarityPO.setFundIdFirst("修改成功");
        SimilarityPOResult res  = similarityDao.update(similarityPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("修改成功",res.getStatus(), CommonResult.CODE.SUCCESS);
    }

    @Test
    public void testDelete() throws Exception{
        SimilarityPO similarityPO = this.generateData();
        SimilarityPOResult res  = similarityDao.delete(similarityPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("删除成功",res.getStatus(), CommonResult.CODE.SUCCESS);
    }
}
