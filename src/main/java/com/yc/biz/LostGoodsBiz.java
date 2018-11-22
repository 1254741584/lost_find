package com.yc.biz;

import java.util.HashMap;
import java.util.List;

import com.yc.bean.LostGoods;

public interface LostGoodsBiz {

	public List<LostGoods> getNewLost(HashMap<String, Object> pageParams);
	
	public boolean createLost(HashMap<String, Object> params);
	
	public List<LostGoods> getLostList(HashMap<String, Object> params);
}

