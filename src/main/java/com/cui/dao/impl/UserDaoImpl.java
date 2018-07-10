package com.cui.dao.impl;

import com.cui.po.data.UserPO;
import com.cui.po.request.UserPORequest;
import com.cui.po.result.CommonResult;
import com.cui.po.result.UserPOResult;
import com.cui.dao.UserDao;
import com.cui.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Promisesaybye on 2018/6/29.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private UserMapper mapper;

    @Override
    public UserPOResult insert(UserPO userPO) {
        UserPOResult res = new UserPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("插入失败");
        try {
            int count = mapper.insert(userPO);
            if (count > 0){
                res.setStatus(CommonResult.CODE.SUCCESS);
                res.setMessage("添加成功");
                List<UserPO> list = new ArrayList<UserPO>();
                list.add(userPO);
                res.setUserPOList(list);
                res.setCount(list.size());
            }
        } catch (Exception e) {
            res.setException(e);
        }
        return res;
    }

    @Override
    public UserPOResult delete(UserPO userPO) {
        return null;
    }

    @Override
    public UserPOResult update(UserPO userPO) {
        return null;
    }

    @Override
    public UserPOResult queryById(UserPORequest request) {
        UserPOResult res = new UserPOResult();
        res.setStatus(CommonResult.CODE.ERROR);
        res.setMessage("查询失败");
        try {
            List<UserPO> users = mapper.queryById(request);
            if (users != null) {
                res.setStatus(CommonResult.CODE.SUCCESS);
                res.setMessage("查询成功。");
                res.setUserPOList(users);
                res.setPage(request.getPage());
                res.setCount(users.size());
                res.setTotalCount(users.size());
            }
        } catch (Exception e) {
            res.setException(e);
        }

        return res;
    }


}
