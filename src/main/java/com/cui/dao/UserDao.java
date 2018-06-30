package com.cui.dao;

import com.cui.PO.data.UserPO;
import com.cui.PO.request.UserPORequest;
import com.cui.PO.result.UserPOResult;

/**
 * Created by Promisesaybye on 2018/6/29.
 */
public interface UserDao {

    public UserPOResult insert(UserPO userPO);

    public UserPOResult delete(UserPO userPO);

    public UserPOResult update(UserPO userPO);

    public UserPOResult queryById (UserPORequest request);
}
