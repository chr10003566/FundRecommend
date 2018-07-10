package com.cui.bo.result;

import java.util.List;

/**
 * Created by Promisesaybye on 2018/7/10.
 */
public abstract class CommonListResult extends CommonResult {
    //	此方法相当于 XXXRes != null && XXXRes.isSuccess && XXX.getXXXList() != null && !XXX.getXXXList.isEmpty()
    abstract public List<?> getTypeList();
    public boolean hasResult() {
        if (!isSuccess()) return false;
        if (this.getTypeList() != null && !this.getTypeList().isEmpty()) return true;
        return false;
    }
}
