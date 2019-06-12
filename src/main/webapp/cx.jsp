<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/index2.css">
<script type="text/javascript" src="/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	影片名称：<input type="text" name="mname" value="${mname }">上映时间：<input type="text" name="start">--<input type="text" name="end"><br>
	导演：<input type="text" name="mauthor" value="${mauthor }">价格：<input type="text" name="min">--<input type="text" name="max"><br>
	电影年代：<input type="text" name="myear" value="${myear }">电影时长：<input type="text" name="min1">--<input type="text" name="max1"><br>
	<input type="button" value="查询影片">
	<script type="text/javascript">
		$("input[value='查询影片']").click(function(){
			var mname=$("[name='mname']").val();
			var mauthor=$("[name='mauthor']").val();
			var myear=$("[name='myear']").val();
			var start=$("[name='start']").val();
			var end=$("[name='end']").val();
			var min=$("[name='mim']").val();
			var max=$("[name='max']").val();
			var min1=$("[name='min1']").val();
			var max1=$("[name='max1']").val();
			location.href="/list.action?mname="+mname+"&&mauthor="+mauthor+"&&myear="+myear+"&&start="+start+"&&end="+end+"&&min="+min+"&&max="+max+"&&min1="+min1+"&&max1="+max1;
		})
	</script>
</body>
</html>