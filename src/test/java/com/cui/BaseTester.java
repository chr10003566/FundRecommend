package com.cui;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Promisesaybye on 2018/7/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:ctx-base-test.xml", "classpath:ctx-datasource-test.xml"})
@Ignore
public class BaseTester {
}
