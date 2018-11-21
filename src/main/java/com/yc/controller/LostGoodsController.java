package com.yc.controller;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.yc.bean.Account;
import com.yc.bean.LostGoods;
import com.yc.bean.LostType;
import com.yc.biz.LostGoodsBiz;
import com.yc.biz.LostTypeBiz;

@RestController
public class LostGoodsController {
	
	@Autowired
	private LostGoodsBiz lostGoodsBiz;
	
	public void setLostGoodsBiz(LostGoodsBiz lostGoodsBiz) {
		this.lostGoodsBiz = lostGoodsBiz;
	}
	
	@Autowired
	private LostTypeBiz lostTypeBiz;
	
	public void setLostTypeBiz(LostTypeBiz lostTypeBiz) {
		this.lostTypeBiz = lostTypeBiz;
	}

	@RequestMapping("/lost/getNewLost")
	public List<LostGoods> getNewLost() {
		HashMap<String, Object> pageParams = new HashMap<String, Object>();
		pageParams.put("page", 0);
		pageParams.put("pageSize", 10);
		List<LostGoods> list = this.lostGoodsBiz.getNewLost(pageParams);
		return list;
	}
	
	@RequestMapping("/lost/lostTypeList")
	public List<LostType> getLostTypeList() {
		List<LostType> list = this.lostTypeBiz.getTypeList();
		return list;
	}
	
	@RequestMapping("/lost/create")
	public HashMap<String, Object> creatLostGoods(HttpServletRequest request) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("name", String.valueOf(request.getParameter("name")));
		data.put("description", String.valueOf(request.getParameter("description")));
		String select = String.valueOf(request.getParameter("selected"));
		String[] address = select.split(",");
		data.put("lost_province", address[0]);
		data.put("lost_city", address[1]);
		data.put("lost_district", address[2]);
		data.put("address", String.valueOf(request.getParameter("address")));
		data.put("img", String.valueOf(request.getParameter("img")));
		data.put("reward", String.valueOf(request.getParameter("reward")));
		data.put("lostType", Integer.valueOf(String.valueOf(request.getParameter("lostType"))));
		data.put("status", 0);
		data.put("create_time", new Date().getTime() + "");
		
		HashMap<String, Object> result = new HashMap<String, Object>();
		Account account = (Account)request.getSession().getAttribute("account");
		System.out.println(account);
		if (account == null || account.getId() <= 0) {
			result.put("status", "fail");
			return result;
		}
		data.put("account_id", account.getId());
		
		System.out.println(data);
		boolean res = this.lostGoodsBiz.createLost(data);
		
		if (res) {
			result.put("status", "success");
		} else {
			result.put("status", "fail");
		}
		return result;
	}
	
	@RequestMapping("/lost/img/upload")
	@ResponseBody
	public HashMap<String, Object> lostImgUpload(HttpServletRequest request) {
		List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
		HashMap<String, Object> data = new HashMap<String, Object>();
		List<String> list = new ArrayList<String>();
		if (files.isEmpty()) {
			data.put("status", "fail");
			data.put("msg", "file is null");
            return data;
        }
		String filePath = "D:\\file\\";
		
		
		for (int i = 0; i < files.size(); i++) {
	        MultipartFile file = files.get(i);
	        String fileName = file.getOriginalFilename();
	        File dest = new File(filePath + Calendar.getInstance().getTimeInMillis() + "_" + fileName);
	        try {
	            file.transferTo(dest);
	            list.add(fileName);
	        } catch (IOException e) {
	        	data.put("status", "fail");
	            data.put("msg", e.getMessage());
	            return data;
	        }
	    }
		
		data.put("status", "success");
		data.put("path", list);
		return data;
	}
	
	@RequestMapping("/lost/list")
	public HashMap<String, Object> getLostList(HttpServletRequest request) {
		HashMap<String, Object> data = new HashMap<String, Object>(); 
		return data;
	}
}
