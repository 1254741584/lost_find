package com.yc.dao;

import com.yc.bean.Account;;

public interface UserMapper {
	
	public Account login(String account, String password);
	
	public boolean register(String account, String password);
}
