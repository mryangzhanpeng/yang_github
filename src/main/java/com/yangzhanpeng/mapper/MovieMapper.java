package com.yangzhanpeng.mapper;

import java.util.List;
import java.util.Map;
/**
 * 
 * @ClassName: MovieMapper 
 * @Description: TODO
 * @author: 凡人不凡
 * @date: 2019年6月11日 下午5:10:29
 */
public interface MovieMapper {
	//影片列表
	public List movielist(Map<Object, Object> map);

	public void delete(String id);

	public void update(int id);

	public void update1(int id);
}
