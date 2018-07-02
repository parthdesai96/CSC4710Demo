<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="">
    
    <title>LU1</title>
    
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
<style>
table, th, td {
    border: 1px solid black;
}
</style>
  </head>
  
  <body>
    
    <c:choose>
		<c:when test="${empty sessionScope.session_user }">
				<h1>LU1 Search Page</h1>
		</c:when>
		<c:otherwise>
		<form action="<c:url value='/LU1'/>" method="post">
		<br>
		<br>
		<input type="submit" name="search" value="search"/>
		</form>
		
<table style="width:50%">
  <tr>
    <th>Firstname</th>
    <th>Lastname</th> 
    <th>Age</th>
  </tr>
  <tr>
    <td>Paper1</td>
    <td>Smith</td>
    <td>50</td>
  </tr>
  <tr>
    <td>Paper2</td>
    <td>Jackson</td>
    <td>94</td>
  </tr>
  <tr>
    <td>Paper3</td>
    <td>Doe</td>
    <td>80</td>
  </tr>
</table>


<br>
		<a href ="/CSC4710Demo/jsps/body.jsp"><button type = "submit">Return to home</button></a>
		<br>
		
		</c:otherwise>
	</c:choose>
  </body>
</html>
