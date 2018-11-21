package com.yc.dao;

import java.util.HashMap;
import java.util.List;

import com.yc.bean.LostGoods;

public interface LostGoodsMapper {

	public List<LostGoods> getNewLost(HashMap<String, Object> pageParams);
	
	public boolean createLost(HashMap<String, Object> params);
}
