package com.cui.po.data.recommend;

import java.util.Date;

public class RecommendDataPO {
    private Integer id;

    private String userid;

    private String probility;

    private String taskBatch;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getProbility() {
        return probility;
    }

    public void setProbility(String probility) {
        this.probility = probility == null ? null : probility.trim();
    }

    public String getTaskBatch() {
        return taskBatch;
    }

    public void setTaskBatch(String taskBatch) {
        this.taskBatch = taskBatch == null ? null : taskBatch.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}