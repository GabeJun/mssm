package com.mssm.dbTable.service;

import org.springframework.cache.annotation.Cacheable;

import com.mssm.dbTable.pojo.User;

public interface ITestCacheService {
	   public User getTestCacheable(Long userId);
	   public User getTestCachePut(Long userId);
	   public void getTestCacheEvict(Long userId);
	
}
