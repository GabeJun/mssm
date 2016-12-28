package com.mssm.dbTable.service;

import com.mssm.dbTable.pojo.User;

public interface IUserService {
	public User getUsersById(Long userId);
	/***
	 * 使用缓存获取数据
	 * @param userId
	 * @return
	 */
	public User getUsernameByIdByCache(Long userId);
	
}
