package com.yangzhanpeng.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangzhanpeng.mapper.MovieMapper;
import com.yangzhanpeng.mapper.TypeMapper;
@Service
public class MyServiceImpI implements MyService{
	@Autowired
	private MovieMapper mapper1;
	@Autowired
	private TypeMapper mapper2;
	@Override
	public List movielist(Map<Object, Object> map) {
		return mapper1.movielist(map);
	}
	@Override
	public void delete(String id) {
		mapper1.delete(id);
	}
	@Override
	public void update(int id) {
		mapper1.update(id);
	}
	@Override
	public void update1(int id) {
		mapper1.update1(id);
	}


}
