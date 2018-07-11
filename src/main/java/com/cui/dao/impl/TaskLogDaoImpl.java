package com.cui.dao.impl;

import com.cui.dao.TaskLogDao;
import com.cui.mapper.recommend.FundFlowMapper;
import com.cui.mapper.recommend.TaskLogMapper;
import com.cui.po.data.recommend.SimilarityPO;
import com.cui.po.data.recommend.TaskLogPO;
import com.cui.po.request.recommend.TaskLogPORequest;
import com.cui.po.result.CommonResult;
import com.cui.po.result.recommend.TaskLogPOResult;
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
public class TaskLogDaoImpl implements TaskLogDao {
    @Resource
    private TaskLogMapper mapper;


    @Override
    public TaskLogPOResult insert(TaskLogPO taskLogPO) {
        TaskLogPOResult res = new TaskLogPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("插入失败");
        try {
            int count = mapper.insert(taskLogPO);
            if(count > 0){
                res.setStatus(CommonResult.CODE.SUCCESS);
                res.setMessage("插入成功");
                List<TaskLogPO> list = new ArrayList<>();
                list.add(taskLogPO);
                res.setTaskLogPOList(list);
                res.setCount(count);
            }

        }catch (Exception e){
            res.setException(e);
        }
        return res;
    }

    @Override
    public TaskLogPOResult update(TaskLogPO taskLogPO) {
        TaskLogPOResult res = new TaskLogPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("更新失败");
        try {
            int count = mapper.update(taskLogPO);
            if(count > 0){
                res.setStatus(CommonResult.CODE.SUCCESS);
                res.setMessage("更新成功");
                List<TaskLogPO> list = new ArrayList<>();
                list.add(taskLogPO);
                res.setTaskLogPOList(list);
                res.setCount(count);
            }

        }catch (Exception e){
            res.setException(e);
        }
        return res;
    }

    @Override
    public TaskLogPOResult delete(TaskLogPO taskLogPO) {
        TaskLogPOResult res = new TaskLogPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("删除失败");
        try {
            int count = mapper.delete(taskLogPO.getTaskId());
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
    public TaskLogPOResult queryByRequest(TaskLogPORequest request) {
        return null;
    }
}
