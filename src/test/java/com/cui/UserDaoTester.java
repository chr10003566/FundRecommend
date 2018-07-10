package com.cui;

import com.cui.po.data.UserPO;
import com.cui.po.result.CommonResult;
import com.cui.po.result.UserPOResult;
import com.cui.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Random;

/**
 * Created by Promisesaybye on 2018/7/7.
 */
// 这个注解的意义在于执行test方法之后的自动回滚,不会让test的数据污染数据库,不过你执行之后没法在本地数据库进行校验,一般建议加上
@Transactional
public class UserDaoTester extends BaseTester {

    @Resource
    private UserDao userDao;

    private UserPO generalCreate(){
        UserPO userPO = new UserPO();
        // 或许可以用这个随机int函数代替?是一个建议,不用你做强转
        System.out.println(new Random().nextInt(100));
        userPO.setAge( (int)(100 * Math.random()));
        userPO.setCellNumber("dadqwqcqd");
        userPO.setDuty("dasdasdqw");
        int i = (int )(Math.random() * 10);
        userPO.setLoginId("223124" + i);
        userPO.setName("12312" + i);
        userPO.setPwd("111111");
        userPO.setUsed(false);
        userPO.setPhotoUrl("da2e12asc1");
        userPO.setSex("m");

        return userPO;
    }

    @Test
    public void testInsert() throws Exception{
        UserPO userPO = this.generalCreate();
        UserPOResult res  = userDao.insert(userPO);

        Assert.assertNotNull(res);
        Assert.assertEquals("插入成功",res.getStatus(), CommonResult.CODE.SUCCESS);
        Assert.assertEquals("插入数据成功",res.getUserPOList().get(0),userPO);
    }
}
