<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oracle.book.domain.Book" %>
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
					<h3>书名:${book.bookname}</h3>
					<h3>作者:${book.author }</h3>
					<h3>类名:${book.classname}</h3>
					<h3>价格:${book.price }</h3>
					<h3>打折:${book.discount }</h3>
					<h3>数量:${book.num}</h3>
			</div>
		</div>
	</div>
</body>
</html>