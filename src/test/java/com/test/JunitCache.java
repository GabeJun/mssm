package com.test;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.mssm.dbTable.pojo.User;
import com.mssm.dbTable.service.ITestCacheService;
import com.mssm.dbTable.service.impl.TestCacheService2;
@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml" })
public class JunitCache {
	 private static Logger logger = Logger.getLogger(JunitCache.class);
	 @Resource
	private TestCacheService2 service;
	
	/***
	 * 成功
	 */
	@Test
	public void test() {
		Long userId=1L;
        User users = service.getTestCacheable(userId);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(users));
    }
}
