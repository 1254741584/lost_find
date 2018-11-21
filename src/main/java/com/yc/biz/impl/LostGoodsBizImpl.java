package com.yc.biz.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.bean.LostGoods;
import com.yc.biz.LostGoodsBiz;
import com.yc.dao.LostGoodsMapper;

@Service("lostGoodsBiz")
public class LostGoodsBizImpl implements LostGoodsBiz {

	@Autowired
	private LostGoodsMapper lostGoodsMapper;
	
	public void setLostGoodsMapper(LostGoodsMapper lostGoodsMapper) {
		this.lostGoodsMapper = lostGoodsMapper;
	}


	@Override
	public List<LostGoods> getNewLost(HashMap<String, Object> pageParams) {
		List<LostGoods> list = this.lostGoodsMapper.getNewLost(pageParams);
		return list;
	}


	@Override
	public boolean createLost(HashMap<String, Object> params) {
		try {
			this.lostGoodsMapper.createLost(params);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
