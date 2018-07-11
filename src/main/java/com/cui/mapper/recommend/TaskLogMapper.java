package com.cui.mapper.recommend;

import com.cui.po.data.recommend.TaskLogPO;

public interface TaskLogMapper {
    int delete(Integer taskId);

    int insert(TaskLogPO record);

    int update(TaskLogPO record);
}