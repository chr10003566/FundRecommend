package com.cui.service;

import com.cui.PO.data.UserPO;

/**
 * Created by Administrator on 2016/9/25.
 */
public interface UserService {

    void add(UserPO user) throws Exception;

    UserPO findUser(UserPO user) throws Exception;
}
