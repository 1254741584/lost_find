package com.yc.biz;

import com.yc.bean.Account;

public interface UserBiz {

	public Account login(String account, String password);
	
	public boolean register(String account, String password);
}
