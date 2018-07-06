package com.cui.vo.result;

/**
 * Created by Promisesaybye on 2018/6/29.
 */
public class CommonResult{
    // 内部类，静态内部类
    public static class CODE {
        public static int SUCCESS = 200;
        public static int ERROR = 400;
        public static int UNAUTH = 600; // 表示没有权限
        public static int UPDATE = 800; //表示正在更新
        public static int LIQUIDATE = 801; //表示正在清机
    }

    /**
     * 表示返回结果的状态（成功、延时等等）
     */
    private int status;

    /**
     * 表示当前查询的数量
     */
    private int count;

    /**
     * 表示查询的总数
     */
    private int totalCount;

    /**
     * 表示出现的异常
     */
    private Exception exception;

    /**
     * 异常信息
     */
    private String message;

    /**
     * 返回页码数，在进行查询时，通过该参数可以让客户端知道该次的数据返回的是第几页的内容。
     */
    private int page;

    private String deviceId;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    /**
     * @return the deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * @param deviceId the deviceId to set
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 判断是否成功
     * @return
     */
    public boolean isSuccess(){
        if (this.getStatus()== com.cui.po.result.CommonResult.CODE.SUCCESS){
            return true;
        }
        return false;
    }

}
