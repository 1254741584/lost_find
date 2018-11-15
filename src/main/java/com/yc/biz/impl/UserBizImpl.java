package com.yc.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.bean.Account;
import com.yc.biz.UserBiz;
import com.yc.dao.UserMapper;

@Service("userBiz")
public class UserBizImpl implements UserBiz {
	
	@Autowired
	private UserMapper userMapper;
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public Account login(String account, String password) {
		Account user = this.userMapper.login(account, password);
		return user;
	}

}
