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
				<h1>Report Update Page</h1>	
		</c:when>
		<c:otherwise>

		
		<form action="<c:url value='/updatereview'/>" method="post">
		<label>Reportid: </label>
		<input type="text" name="reportid0" value=""/>
		<br>
		<label>Date:</label>
		<input type="text" name="date0" value=""/>
		<br>
		<label>Comments:</label>
		<input type="text" name="comments0" value=""/>
		<br>
		<label>Recommendation:</label>
		<input type="text" name="rec0" value=""/>
		<br>
		<label>Paperid:</label>
		<input type="text" name="paperid0" value=""/>
		<br>
		<label>Email:</label>
		<input type="text" name="email0" value=""/>
		<br>
		<br>
		<input type="submit" name="Update" value="Update"/>
		</form>
		
		<%@ page import="java.sql.*" %>		
		<p>Update Papers: </p>

<table border="2">
<tr>
<td>Report ID</td>
<td>Date</td>
<td>Comment</td>
<td>Recommendation</td>
<td>Paper Id</td>
<td>Email</td>
</tr>
<%
		try {	
		    String url = "jdbc:mysql://localhost:3306/sampledb";
		    Connection conn = DriverManager.getConnection(url,"root","parth55");
		    Statement stmt = conn.createStatement();
		    ResultSet rs; 
		    rs = stmt.executeQuery("SELECT * FROM review"); 
		    
		
		    while ( rs.next() )
		    { %>
			<form action="/updatereview" method="post">
			<tr><td><input type="text" name="email" readonly="readonly" value="<%=rs.getString("reportid") %>"></td>
			<td><input type="text" name="name" readonly="readonly" value="<%=rs.getString("sdate") %>"></td>
			<td><input type="text" name="name" readonly="readonly" value="<%=rs.getString("comment") %>"></td>
			<td><input type="text" name="name" readonly="readonly" value="<%=rs.getString("recommendation") %>"></td>
			<td><input type="text" name="name" readonly="readonly" value="<%=rs.getString("paperid") %>"></td>
			<td><input type="text" name="name" readonly="readonly" value="<%=rs.getString("email") %>"></td>
			</tr>
			</form>
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
		</c:otherwise>
	</c:choose>
  </body>
</html>
