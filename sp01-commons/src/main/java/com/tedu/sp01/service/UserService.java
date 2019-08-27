package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	/**
	 * 获取用户数据
	 * @param id 用户ID
	 * @return
	 */
	User getUser(Integer id);
	/**
	 * 增加用户积分
	 * @param id 用户id
	 * @param score 增加的积分
	 */
	void addScore(Integer id, Integer score);
}
