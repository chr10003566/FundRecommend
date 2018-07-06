package com.cui.service.impl;


import com.cui.po.data.UserPO;
import com.cui.po.request.UserPORequest;
import com.cui.po.result.UserPOResult;
import com.cui.dao.UserDao;
import com.cui.exception.OtherThingsException;
import com.cui.service.UserService;
import com.cui.vo.result.CommonResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Promisesaybye on 2016/9/25.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    /**
     * 添加用户，一般来说需要检查用户为空、用户名为空、密码为空
     */
    public void add(UserPO user) throws OtherThingsException {

        UserPOResult result = new UserPOResult(); //受影响的行数默认为0
        try {
            result = userDao.insert(user);
        } catch (Exception e) {
            result.setStatus(CommonResult.CODE.SUCCESS);
            result.setMessage("添加用户失败,用户已经存在");
        }
        if (result.isSuccess())
            System.out.println("添加用户成功");
    }

    /**
     * 查找用户
     *
     * @param user 用户bean
     * @throws Exception
     */
    public UserPO findUser(UserPO user) {
        UserPORequest request = new UserPORequest();

        request.setLoginId(user.getLoginId());

        UserPOResult result =  userDao.queryById(request);

        List<UserPO> list = result.getUserPOList();

        if (list.isEmpty() || list.size() == 0){
            return null;
        }
        return list.get(0);
    }


}
