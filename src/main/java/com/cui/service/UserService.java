package com.cui.service;

import com.cui.po.data.UserPO;

/**
 * Created by Administrator on 2016/9/25.
 */
public interface UserService {

    void add(UserPO user) throws Exception;

    UserPO findUser(UserPO user) throws Exception;
}
