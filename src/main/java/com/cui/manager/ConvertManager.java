package com.cui.manager;

/**
 * Created by Promisesaybye on 2018/7/10.
 */
public interface ConvertManager {

    public <T extends Object>T transForNormal(Object obj,Class<T> c);
}
