package com.cui.mapper;

import com.cui.PO.data.UserPO;
import com.cui.PO.request.UserPORequest;

import java.util.List;

/**
 * Created by Promisesaybye on 2018/6/29.
 */
public interface UserMapper {
    public int insert(UserPO userPO);

    public int delete(Long loginId);

    public int update(UserPO userPO);

    public List<UserPO> queryById(UserPORequest req);
}
