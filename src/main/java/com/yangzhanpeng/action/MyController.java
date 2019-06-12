package com.yangzhanpeng.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.sql.PagerUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yangzhanpeng.service.MyService;
import com.yangzhanpeng.utils.PageUtil;

@Controller
public class MyController {
	@Autowired
	private MyService service;
	//上架
	@RequestMapping("/update1.action")
	@ResponseBody
	public Object update1(@RequestParam(defaultValue="0")int id) {
		service.update1(id);
		return true;
	}
	//下架
	@RequestMapping("/update.action")
	@ResponseBody
	public Object update(@RequestParam(defaultValue="0")int id) {
		service.update(id);
		return true;
	}
	//删除
	@RequestMapping("/delete.action")
	@ResponseBody
	public Object delete(@RequestParam(defaultValue="")String id) {
		service.delete(id);
		return true;
	}
	//影片列表
	@RequestMapping("/list.action")
	public String movielist(HttpServletRequest request,Model model,@RequestParam(defaultValue="1")int page,
			@RequestParam(defaultValue="")String mname,@RequestParam(defaultValue="")String mauthor,@RequestParam(defaultValue="")String myear
			,@RequestParam(defaultValue="")String start,@RequestParam(defaultValue="")String end
			,@RequestParam(defaultValue="")String min,@RequestParam(defaultValue="")String max,@RequestParam(defaultValue="")String min1,@RequestParam(defaultValue="")String max1,
			@RequestParam(defaultValue="asc") String date,@RequestParam(defaultValue="desc") String mtime,
			@RequestParam(defaultValue="asc") String myear1,@RequestParam(defaultValue="1")int flag) {
		PageHelper.startPage(page, 3);
		Map<Object,Object> map=new HashMap();
		map.put("mname",mname);
		map.put("mauthor", mauthor);
		map.put("myear", myear);
		map.put("start", start);
		map.put("end", end);
		map.put("min", min);
		map.put("max", max);
		map.put("min1", min1);
		map.put("max1", max1);
		map.put("date", date);
		map.put("mtime", mtime);
		map.put("myear1", myear1);
		map.put("flag", flag);
		List list = service.movielist(map);
		PageInfo info=new PageInfo<>(list);
		
		String url="/list.action?mname="+mname+"&&mauthor="+mauthor+"&&myear="+myear+"&&start="+start+"&&end="+end+"&&min="+min+"&&max="+max+"&&min1="+min1+"&&max1="+max1;
		PageUtil.page(request, url, 3, list, info.getTotal(), page);
		model.addAttribute("list", list);
		model.addAttribute("date", date);
		model.addAttribute("mtime", mtime);
		model.addAttribute("myear1", myear1);
		return "list";
	}
}
