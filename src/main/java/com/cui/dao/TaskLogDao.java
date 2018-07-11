package com.cui.dao;


import com.cui.po.data.recommend.TaskLogPO;
import com.cui.po.request.recommend.TaskLogPORequest;
import com.cui.po.result.recommend.TaskLogPOResult;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 13:56
 */
public interface TaskLogDao {
    public TaskLogPOResult insert(TaskLogPO recommendPO);

    public TaskLogPOResult delete(TaskLogPO recommendPO);

    public TaskLogPOResult update(TaskLogPO recommendPO);

    public TaskLogPOResult queryByRequest(TaskLogPORequest request);
}
