package com.yc.controller;


import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.bean.LostGoods;
import com.yc.biz.LostGoodsBiz;

@RestController
public class LostGoodsController {
	
	@Autowired
	private LostGoodsBiz lostGoodsBiz;
	
	public void setLostGoodsBiz(LostGoodsBiz lostGoodsBiz) {
		this.lostGoodsBiz = lostGoodsBiz;
	}

	@RequestMapping("/lost/getNewLost")
	public List<LostGoods> getNewLost() {
		HashMap<String, Object> pageParams = new HashMap<String, Object>();
		pageParams.put("page", 0);
		pageParams.put("pageSize", 10);
		List<LostGoods> list = this.lostGoodsBiz.getNewLost(pageParams);
		return list;
	}
}
