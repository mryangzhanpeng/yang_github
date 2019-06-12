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
	<input type="button" value="查询影片">
	<input type="button" value="+添加影片">
	<input type="button" value="删除影片">
	<table>
		<tr>
			<td><input type="checkbox" id="qx">全选<input type="checkbox" id="fx">反选</td>
			<td>影片名</td>
			<td>导演</td>
			<td>票价</td>
			<td><a href="/list.action?date=${date=='asc'?'desc':'asc'}&flag=1">上映时间</a></td>
			<td><a href="/list.action?mtime=${mtime=='desc'?'asc':'desc'}&flag=2">时长</a></td>
			<td>类型</td>
			<td><a href="/list.action?myear1=${myear1=='asc'?'desc':'asc'}&flag=3">年代</a></td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
	<c:forEach items="${list }" var="m">
		<tr>
			<td><input type="checkbox" value="${m.mid }" class="a"></td>
			<td>${m.mname }</td>
			<td>${m.mauthor }</td>
			<td>${m.mprice }</td>
			<td>${m.mdate }</td>
			<td>${m.mtime }</td>
			<td>${m.tname }</td>
			<td>${m.myear }</td>
			<td>${m.maddr }</td>
			<td>
				<c:if test="${m.stats=='0' }">正在热映</c:if>
				<c:if test="${m.stats=='1' }">已经下架</c:if>
				<c:if test="${m.stats=='2' }">即将下架</c:if>
			</td>
			<td>
				<input type="button" value="详情">
				<input type="button" value="编辑">
				
				<c:if test="${m.stats=='1' }">
					<input type="button" value="上架" onclick="sj('${m.mid}','${m.stats }')"> 
				</c:if>
				<c:if test="${m.stats!='1' }">
					<input type="button" value="下架" onclick="xj(${m.mid})"> 
				</c:if>
			</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="11">${page }</td>
	</tr>
	</table>
	<script type="text/javascript">
		$("input[value='删除影片' ]").click(function(){
			var ids="";
			$(":checkbox:checked.a").each(function(){
				ids+=","+$(this).val();
			})
			ids=ids.substring(1);
			if(confirm("是否删除该数据")){
				$.ajax({
					url:"/delete.action",
					data:{
						"id":ids,
					},
					dataType:"json",
					type:"post",
					success:function(obj){
						if(obj==true){
							alert("删除成功");
							location.reload();
						}else{
							alert("删除失败");
							location.reload();
						}
					}
				})
			}
		})
		function xj(id){
				$.ajax({
					url:"/update.action",
					data:{
						"id":id,
					},
					dataType:"json",
					type:"post",
					success:function(obj){
						if(obj==true){
							location.reload();
						}
					}
				})
		}
		function sj(id,a){
			if(a=='1'){
				alert("该影片已经下架");
			}else{
				$.ajax({
					url:"/update1.action",
					data:{
						"id":id,
					},
					dataType:"json",
					type:"post",
					success:function(obj){
						if(obj==true){
							location.reload();
						}
					}
				})
			}
				
		}
		//全选
		$("#qx").click(function(){
			$(".a").prop("checked",$(this).prop("checked"));
		})
		//反选
		$("#fx").click(function(){
			$(".a").each(function(){
				$(this).prop("checked",!$(this).prop("checked"));
			})
		})
		$("input[value='查询影片']").click(function(){
			location.href="/cx.jsp";
		})
	</script>
</body>
</html>