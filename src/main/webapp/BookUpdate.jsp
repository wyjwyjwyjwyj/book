<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="common.css">
<style>	 
	.sub{
		float: left;
		margin-left:50px ;
	}
	.res{
		float: left; 
		 
		margin-left: 100px;
	}  
	#content{
		font:35px;
		line-height:45px;
		
	}  
	#con{
		padding-left:30px;
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
			<form method="post" action="bookUpdateAction">
		书名：<input type="text" name="bookname" value="${param.bookname }">
			<font color="red">
						<s:fielderror>
							<s:param>bookname</s:param>
						</s:fielderror>
			</font>
		<br/>
		<c:set var="types" value="科学,教育,文学,生活,其他"></c:set>
		类别：
			<c:forEach items="${types }" var="t">
				<input type="checkbox" name="classname" value="${t}"
				<c:forEach items="${str }" var="s">
					<c:if test="${s eq t}">checked</c:if>
				</c:forEach> 
				>${t}
			</c:forEach><br>
		作者：<input type="text" name="author" value="${param.author }">
					<font color="red">
						<s:fielderror>
							<s:param>author</s:param>
						</s:fielderror>
					</font>
		<br/>
				<c:set var="fare" value="全价,九折,八折,七折,六折"></c:set>
				折扣：
					<c:forEach items="${fare }" var="d">
						<input type="radio" name="discount" value="${d }"
						<c:if test="${param.discount eq d }">checked</c:if>
						>${d }
					</c:forEach>
					<font color="red">
						<s:fielderror>
							<s:param>discount</s:param>
						</s:fielderror>
					</font>
					<br>
		价格：<input type="text" name="price" value="${param.price }">
					<font color="red">
						<s:fielderror>
							<s:param>price</s:param>
						</s:fielderror>
					</font>
		<br/>
		数量：<input type="text" name="num" value="${param.num }">
			<font color="red">
						<s:fielderror>
							<s:param>num</s:param>
						</s:fielderror>
					</font>
		<br/>
		简介：<textarea name="" id="" cols="30" rows="10"></textarea>
		<br/>
		<input type="submit" name="" value="更改" class="sub">
		<input type="reset" name="" value="重置" class="res">
	</form>
		</div>
	</div>
</div>
</body>
</html>