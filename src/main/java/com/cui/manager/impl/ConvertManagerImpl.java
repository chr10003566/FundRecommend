package com.cui.manager.impl;

import com.cui.manager.ConvertManager;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Promisesaybye on 2018/7/10.
 */
@Component
public class ConvertManagerImpl implements ConvertManager {


    @Resource
    private DozerBeanMapper mapper;

    @Override
    public <T> T transForNormal(Object obj, Class<T> c) {
        T res = mapper.map(obj, c);
        return res;
    }
}
