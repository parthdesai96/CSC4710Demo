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
				<h1>Zhang and Lu Author Page</h1>	
		</c:when>
		<c:otherwise>
		
			<center>


		<%@ page import="java.sql.*" %>		
		<p>Zhang Lu Papers: </p>

<table border="2">
<tr>
<td>Paper ID</td>
<td>Title</td>
<td>Abstract</td>
<td>PDF</td>
</tr>
<%
		try {	
		    String url = "jdbc:mysql://localhost:3306/sampledb";
		    Connection conn = DriverManager.getConnection(url,"root","parth55");
		    Statement stmt = conn.createStatement();
		    ResultSet rs; 
		    rs = stmt.executeQuery("SELECT * FROM paper WHERE paperid IN (SELECT paperid FROM writeT WHERE email = (SELECT email FROM author WHERE name = 'Lu')) AND paperid IN (SELECT paperid FROM writeT WHERE email=(SELECT email FROM author WHERE name = 'Zhang'))"); 
		    
		
		    while ( rs.next() )
		    { %>
			
			<tr><td><input type="text" name="email" readonly="readonly" value="<%=rs.getString("paperid") %>"></td>
			<td><input type="text" name="name" readonly="readonly" value="<%=rs.getString("title") %>"></td>
			<td><input type="text" name="name" readonly="readonly" value="<%=rs.getString("abstract") %>"></td>
			<td><input type="text" name="name" readonly="readonly" value="<%=rs.getString("pdf") %>"></td>
			</tr>
			
			 <%
			}

			rs.close();
			stmt.close();
			conn.close();
			}
			catch(Exception e)
			{
			e.printStackTrace();
			}
			%>

				</table>
				<br>
		<a href ="/CSC4710Demo/jsps/body.jsp"><button type = "submit">Return to home</button></a>
		<br>
			</center>			
		</c:otherwise>
	</c:choose>
  </body>
</html>
