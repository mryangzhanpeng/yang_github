package com.yangzhanpeng.service;

import java.util.List;
import java.util.Map;

public interface MyService {
	//影片列表
	public List movielist(Map<Object, Object> map);
	//删除
	public void delete(String id);
	//修改
	public void update(int id);
	//修改
	public void update1(int id);
}
