package com.cui.vo.param;

/**
 * Created by Promisesaybye on 2018/6/30.
 */
public class RecommendParam {

    private String tableName;

    private String scrPdEcd;

    private String uploadBatch;

    private String taskBatch;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getScrPdEcd() {
        return scrPdEcd;
    }

    public void setScrPdEcd(String scrPdEcd) {
        this.scrPdEcd = scrPdEcd;
    }

    public String getUploadBatch() {
        return uploadBatch;
    }

    public void setUploadBatch(String uploadBatch) {
        this.uploadBatch = uploadBatch;
    }

    public String getTaskBatch() {
        return taskBatch;
    }

    public void setTaskBatch(String taskBatch) {
        this.taskBatch = taskBatch;
    }
}
