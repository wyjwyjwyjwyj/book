<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oracle.book.service.BookService" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="common.css">
<style>
	#con table{
		margin-left:30px;
	}
</style>
</head>
<body>
<div id="wrap">	
		<div id="head">
			<img src="img/banner.png" alt="">
		</div>
		<div id="content">
			<div id="left">
				<h2><a href="index.html">首&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;页</a></h2>
				<h2><a href="BookRegister.jsp">入库登记</a></h2>
				<h2><a href="bookAction">库存列表</a></h2>
			</div>
			<div id="con">
				<table width="500" border="1" cellspacing="0">
				<tr>
					<td>编号</td>
					<td>书名</td>
					<td>作者</td>
					<td>价格</td>
					<td>折扣</td>
					<td>数量</td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<c:forEach items="${books }" var = "book">
				<tr>
					<td>${book.id}</td>
					<td>${book.bookname}</td>
					<td>${book.author }</td>
					<td>${book.price }</td>
					<td>${book.discount }</td>
					<td>${book.num}</td>
					<td><a href="bookDetailsAction?id=${book.id }">详情</a></td>
					<td><a href="bookUpdateAction?id=${book.id }" >更新</a><br/></td>
					<td><a href="bookDeleteAction?id=${book.id }" >删除</a><br/></td>
				</tr>
				</c:forEach>
			</div>
		</div>
	</div>
	
</body>
</html>