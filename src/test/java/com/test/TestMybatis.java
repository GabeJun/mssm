package com.test;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.mssm.dbTable.pojo.User;
import com.mssm.dbTable.service.IUserService;
@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml" })
public class TestMybatis {
	 private static Logger logger = Logger.getLogger(TestMybatis.class);
	 @Resource
	private IUserService usersService;
	
	/***
	 * 成功
	 */
	@Test
	public void test() {
		Long userId=1L;
        User users = usersService.getUsersById(userId);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(users));
    }
}
