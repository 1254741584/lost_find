package com.yc.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.bean.LostType;
import com.yc.biz.LostTypeBiz;
import com.yc.dao.LostTypeMapper;

@Service("lostTypeBiz")
public class LostTypeBizImpl implements LostTypeBiz{
	
	@Autowired
	private LostTypeMapper lostTypeMapper;
	
	public void setLostTypeMapper(LostTypeMapper lostTypeMapper) {
		this.lostTypeMapper = lostTypeMapper;
	}



	@Override
	public List<LostType> getTypeList() {
		return this.lostTypeMapper.getTypeList();
	}

}
