package com.cui.po.result.recommend;


import com.cui.po.data.recommend.TaskLogPO;
import com.cui.po.result.CommonResult;

import java.util.List;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-07-10 14:07
 */
public class TaskLogPOResult extends CommonResult {
    private List<TaskLogPO> taskLogPOList;

    public List<TaskLogPO> getTaskLogPOList() {
        return taskLogPOList;
    }

    public void setTaskLogPOList(List<TaskLogPO> taskLogPOList) {
        this.taskLogPOList = taskLogPOList;
    }
}
