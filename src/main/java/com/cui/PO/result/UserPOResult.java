package com.cui.PO.result;

import com.cui.PO.data.UserPO;

import java.util.List;

/**
 * Created by Promisesaybye on 2018/6/29.
 */
public class UserPOResult extends CommonResult{

    private List<UserPO> userPOList;

    public List<UserPO> getUserPOList() {
        return userPOList;
    }

    public void setUserPOList(List<UserPO> userPOList) {
        this.userPOList = userPOList;
    }
}
