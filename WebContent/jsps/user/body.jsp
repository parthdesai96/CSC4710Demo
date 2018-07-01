<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="">
    
    <title>body</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;char
	set=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    
    <c:choose>
		<c:when test="${empty sessionScope.session_user }">
				<h1>Welcome to the demo</h1>	
		</c:when>
		<c:otherwise>
			<form action="<c:url value='/initDB'/>" method="post">
		<input type="submit" name="initdb" value="Initialize Database"/>
		</form>
		
		<form action="<c:url value='/assign'/>" method="post">
		<label>email 1</label>
		<input type="text" name="email0" value=""/>
		<label>member 1</label>
		<input type="text" name="assign0" value=""/>
		<br>
		<label>email 2</label>
		<input type="text" name="email1" value=""/>
		<label>member 2</label>
		<input type="text" name="assign1" value=""/>
		<br>
		<label>email 3</label>
		<input type="text" name="email2" value=""/>
		<label>member 3</label>
		<input type="text" name="assign2" value=""/>
		<br>
		<label>paper id</label>
		<input type="text" name="paperid" value=""/>
		<br>
		<input type="submit" name="assign" value="Assign"/>
		</form>
		
		
		</c:otherwise>
	</c:choose>
  </body>
</html>
