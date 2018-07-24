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
	<style type = "text/css">	
	body{
			text-align:center;
			background: rgb(2,0,36);
			background: linear-gradient(0deg, rgba(2,0,36,1) 0%, rgba(0,0,255,1) 19%, rgba(255,255,255,1) 100%);
		}
	</style>

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
		
		
		<a href ="/CSC4710Demo/jsps/pcmeminsert.jsp"><button type = "submit">Insert a pc member</button></a>
		
		<a href ="/CSC4710Demo/jsps/pcmemupdate.jsp"><button type = "submit">Update a pc member</button></a>
	
		<a href ="/CSC4710Demo/jsps/pcmemdelete.jsp"><button type = "submit">Delete a pc member</button></a>
		<br>
		<a href ="/CSC4710Demo/jsps/Insertpaper.jsp"><button type = "submit">Insert a paper</button></a>
		
		<a href ="/CSC4710Demo/jsps/Updatepaper.jsp"><button type = "submit">Update a paper</button></a>
		
		<a href ="/CSC4710Demo/jsps/Deletepaper.jsp"><button type = "submit">Delete a paper</button></a>
		<br>
		<a href ="/CSC4710Demo/jsps/Insertreview.jsp"><button type = "submit">Insert a review</button></a>
		
		<a href ="/CSC4710Demo/jsps/UpdateReview.jsp"><button type = "submit">Update a review</button></a>
		
		<a href ="/CSC4710Demo/jsps/DeleteReview.jsp"><button type = "submit">Delete a review</button></a>
		<br>
		
		<a href ="/CSC4710Demo/jsps/Lu1.jsp"><button type = "submit">Search LU1</button></a>
		<br>
		<a href ="/CSC4710Demo/jsps/Lu2.jsp"><button type = "submit">Search LU2</button></a>
		<br>
		<a href ="/CSC4710Demo/jsps/ZhangLu.jsp"><button type = "submit">Search Zhang Lu</button></a>
		<br>
		<a href ="/CSC4710Demo/jsps/MostReviews.jsp"><button type = "submit">Most Reviews</button></a>
		<br>
		<a href ="/CSC4710Demo/jsps/NoReviews.jsp"><button type = "submit">No Papers</button></a>
		<br>
		<a href ="/CSC4710Demo/jsps/MattJohnRejects.jsp"><button type = "submit">Matt John Rejects</button></a>
		<br>
		<a href ="/CSC4710Demo/jsps/Allaccepted.jsp"><button type = "submit">View all accepted papers</button></a>
		<br>
		</c:otherwise>
	</c:choose>
  </body>
</html>
