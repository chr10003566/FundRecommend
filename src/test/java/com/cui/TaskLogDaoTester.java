package com.cui;

import com.cui.dao.FundFlowDao;
import com.cui.dao.TaskLogDao;
import com.cui.po.data.recommend.FundFlowPO;
import com.cui.po.data.recommend.TaskLogPO;
import com.cui.po.result.CommonResult;
import com.cui.po.result.recommend.FundFlowPOResult;
import com.cui.po.result.recommend.TaskLogPOResult;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * 描述:
 * 日志
 *
 * @author Administrator
 * @create 2018-07-10 14:36
 */
public class TaskLogDaoTester extends BaseTester {
    @Resource
    private TaskLogDao taskLogDao;

    private TaskLogPO generateData(){
        TaskLogPO taskLogPO = new TaskLogPO();
        taskLogPO.setTaskTableMsg("1");
        taskLogPO.setTaskId(1);
        return taskLogPO;
    }

    @Test
    public void testInsert() throws Exception{
        TaskLogPO taskLogPO = this.generateData();
        TaskLogPOResult res  = taskLogDao.insert(taskLogPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("插入成功",res.getStatus(), CommonResult.CODE.SUCCESS);
    }

    @Test
    public void testUpdate() throws Exception{
        TaskLogPO taskLogPO = this.generateData();
        taskLogPO.setTaskTableMsg("修改成功");
        TaskLogPOResult res  = taskLogDao.update(taskLogPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("修改成功",res.getStatus(), CommonResult.CODE.SUCCESS);
    }

    @Test
    public void testDelete() throws Exception{
        TaskLogPO taskLogPO = this.generateData();
        TaskLogPOResult res  = taskLogDao.delete(taskLogPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("删除成功",res.getStatus(), CommonResult.CODE.SUCCESS);
    }
}
