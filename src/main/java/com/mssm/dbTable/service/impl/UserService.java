package com.mssm.dbTable.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.mssm.dbTable.dao.UserMapper;
import com.mssm.dbTable.pojo.User;
import com.mssm.dbTable.service.IUserService;
@Service
public class UserService implements IUserService {
	
	private static Logger logger = Logger.getLogger(UserService.class);

	@Resource
	private UserMapper userDao ;
	@Override
	public User getUsersById(Long userId) {
		User u =this.userDao.selectByPrimaryKey(userId);
		return u;
	}

	
	/**
	 *  * @Cacheable注解        负责将方法的返回值加入到缓存中 
	 *  @CachePut 的作用 和 @Cacheable 不同的是，它每次都会触发真实方法的调用
 * @CacheEvict注解     负责清除缓存(它的三个参数与@Cacheable的意思是一样的) 
 * ---------------------------------------------------------------------------------------------------------- 
 * value------缓存位置的名称,不能为空,若使用EHCache则其值为ehcache.xml中的<cache name="myCache"/> 
 * key--------缓存的Key,默认为空(表示使用方法的参数类型及参数值作为key),支持SpEL 
 * condition--只有满足条件的情况才会加入缓存,默认为空(表示全部都加入缓存),支持SpEL 
 * 该注解的源码位于spring-context-*.RELEASE-sources.jar中 
 * Spring针对Ehcache支持的Java源码位于spring-context-support-*.RELEASE-sources.jar中 
	 */
	//将查询到的数据缓存到myCache中,并使用方法名称加上参数中的userNo作为缓存的key    
	//通常更新操作只需刷新缓存中的某个值,所以为了准确的清除特定的缓存,故定义了这个唯一的key,从而不会影响其它缓存值    
	@Cacheable(value="myCache", key="#userId")    
	public User getUsernameByIdByCache(Long userId){    
	    System.out.println("调用了测试缓存的方法");   
	    System.out.println("数据库中查到此用户号[" + userId + "]对应的用户名为[" + this.userDao.selectByPrimaryKey(userId).getUserName() + "]");   
	    return this.userDao.selectByPrimaryKey(userId);    
	}

}
