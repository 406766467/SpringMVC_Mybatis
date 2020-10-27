package com.sky.test;

import com.alibaba.fastjson.JSON;
import com.sky.domain.User;
import com.sky.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    @Resource
    private UserService userService = null;

    @Test
    public void test1() {
        List<User> allUsers = userService.getAllUsers();
        logger.info(JSON.toJSONString(allUsers));
    }
}
