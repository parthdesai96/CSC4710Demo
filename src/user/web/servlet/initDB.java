
package user.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.domain.User;
import user.service.UserService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * Servlet implementation class findAll
 */

public class initDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection connect = null;
	private static Statement statement = null;
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		

		 
		    try {

		      Class.forName("com.mysql.jdbc.Driver");
		      // Setup the connection with the DB
		      connect = DriverManager
		          .getConnection("jdbc:mysql://localhost:3306/sampledb?"
		              + "user=root&password=parth55");

		        

		      // Statements allow to issue SQL queries to the database
		      statement = connect.createStatement();
		      
		      statement.executeUpdate("DROP TABLE IF EXISTS review");
		      statement.executeUpdate("DROP TABLE IF EXISTS pcmember");
		      statement.executeUpdate("DROP TABLE IF EXISTS writeT");
		      statement.executeUpdate("DROP TABLE IF EXISTS author");
		      statement.executeUpdate("DROP TABLE IF EXISTS paper");
		      statement.executeUpdate("Drop view if exists AcceptedPaper");
		      
		     
		      

		      String sqlstmt = "CREATE TABLE paper " +
		               		"(paperid integer AUTO_INCREMENT, " +
		                   " title VARCHAR(50), " + 
		                   " abstract VARCHAR(250), " + 
		                   " pdf VARCHAR(100), " + 
		                   " primary key (paperid))"; 
		      statement.executeUpdate(sqlstmt);
		      
		      String sqlstmt1 = "CREATE TABLE author"+
		      "(email VARCHAR(100),"+
		      "name VARCHAR(50),"+
		      "affiliation VARCHAR(100),"+
		      "primary key(email))";
		      statement.executeUpdate(sqlstmt1);
		      
		     String sqlstmt2 = "CREATE table writeT(id integer  AUTO_INCREMENT,paperid integer,email varchar(50),ordercont integer,Primary key(id),foreign key (paperid) references paper(paperid),foreign key (email) references author(email))";
		     statement.executeUpdate(sqlstmt2);
		      
		     String sqlstmt3 = "CREATE table pcmember(email VARCHAR(50),name VARCHAR(20),primary key (email))";
		     statement.executeUpdate(sqlstmt3);
		      
		     //String sqlstmt4 ="CREATE table pcmember(email VARCHAR(50),name VARCHAR(20),primary key (email))";
		     //statement.executeUpdate(sqlstmt4);
		      
		     String sqlstmt5 ="create table review(reportid integer AUTO_INCREMENT,sdate DATE,comment VARCHAR(250),recommendation CHAR(1),paperid integer,email VARCHAR(100),foreign key (paperid) references paper(paperid),foreign key (email) references pcmember(email),primary key(reportid))";
		     statement.executeUpdate(sqlstmt5);
		      //paper
		     preparedStatement = connect.prepareStatement("insert into  paper(title, abstract,pdf) values (?, ?, ?)");
		     preparedStatement.setString(1, "title1");
		     preparedStatement.setString(2, "abstract1");
		     preparedStatement.setString(3, "pdf1");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  paper(title, abstract,pdf) values (?, ?, ?)");
		     preparedStatement.setString(1, "title2");
		     preparedStatement.setString(2, "abstract2");
		     preparedStatement.setString(3, "pdf2");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  paper(title, abstract,pdf) values (?, ?, ?)");
		     preparedStatement.setString(1, "title3");
		     preparedStatement.setString(2, "abstract3");
		     preparedStatement.setString(3, "pdf3");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  paper(title, abstract,pdf) values (?, ?, ?)");
		     preparedStatement.setString(1, "title4");
		     preparedStatement.setString(2, "abstract4");
		     preparedStatement.setString(3, "pdf4");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  paper(title, abstract,pdf) values (?, ?, ?)");
		     preparedStatement.setString(1, "title5");
		     preparedStatement.setString(2, "abstract5");
		     preparedStatement.setString(3, "pdf5");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  paper(title, abstract,pdf) values (?, ?, ?)");
		     preparedStatement.setString(1, "title6");
		     preparedStatement.setString(2, "abstract6");
		     preparedStatement.setString(3, "pdf6");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  paper(title, abstract,pdf) values (?, ?, ?)");
		     preparedStatement.setString(1, "title7");
		     preparedStatement.setString(2, "abstract7");
		     preparedStatement.setString(3, "pdf7");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  paper(title, abstract,pdf) values (?, ?, ?)");
		     preparedStatement.setString(1, "title8");
		     preparedStatement.setString(2, "abstract8");
		     preparedStatement.setString(3, "pdf8");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  paper(title, abstract,pdf) values (?, ?, ?)");
		     preparedStatement.setString(1, "title9");
		     preparedStatement.setString(2, "abstract9");
		     preparedStatement.setString(3, "pdf9");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  paper(title, abstract,pdf) values (?, ?, ?)");
		     preparedStatement.setString(1, "title10");
		     preparedStatement.setString(2, "abstract10");
		     preparedStatement.setString(3, "pdf10");
		     preparedStatement.executeUpdate();
		     //author
		     preparedStatement = connect.prepareStatement("insert into  author(email, name,affiliation) values (?, ?, ?)");
		     preparedStatement.setString(1, "email1");
		     preparedStatement.setString(2, "name1");
		     preparedStatement.setString(3, "affiliation1");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  author(email, name,affiliation) values (?, ?, ?)");
		     preparedStatement.setString(1, "email2");
		     preparedStatement.setString(2, "Matt");
		     preparedStatement.setString(3, "affiliation2");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  author(email, name,affiliation) values (?, ?, ?)");
		     preparedStatement.setString(1, "email3");
		     preparedStatement.setString(2, "name3");
		     preparedStatement.setString(3, "affiliation3");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  author(email, name,affiliation) values (?, ?, ?)");
		     preparedStatement.setString(1, "email4");
		     preparedStatement.setString(2, "name4");
		     preparedStatement.setString(3, "affiliation4");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  author(email, name,affiliation) values (?, ?, ?)");
		     preparedStatement.setString(1, "emailZhang");
		     preparedStatement.setString(2, "Zhang");
		     preparedStatement.setString(3, "affiliation5");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  author(email, name,affiliation) values (?, ?, ?)");
		     preparedStatement.setString(1, "emailLu");
		     preparedStatement.setString(2, "Lu");
		     preparedStatement.setString(3, "affiliation6");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  author(email, name,affiliation) values (?, ?, ?)");
		     preparedStatement.setString(1, "email7");
		     preparedStatement.setString(2, "John");
		     preparedStatement.setString(3, "affiliation7");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  author(email, name,affiliation) values (?, ?, ?)");
		     preparedStatement.setString(1, "email8");
		     preparedStatement.setString(2, "name8");
		     preparedStatement.setString(3, "affiliation8");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  author(email, name,affiliation) values (?, ?, ?)");
		     preparedStatement.setString(1, "email9");
		     preparedStatement.setString(2, "name9");
		     preparedStatement.setString(3, "affiliation9");
		     preparedStatement.executeUpdate();
		     //writeT
		     
		     preparedStatement = connect.prepareStatement("insert into  writeT(paperid, email,ordercont) values (?, ?, ?)");
		     preparedStatement.setString(1, "1");
		     preparedStatement.setString(2, "emailLu");
		     preparedStatement.setString(3, "1");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  writeT(paperid, email,ordercont) values (?, ?, ?)");
		     preparedStatement.setString(1, "2");
		     preparedStatement.setString(2, "emailZhang");
		     preparedStatement.setString(3, "2");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  writeT(paperid, email,ordercont) values (?, ?, ?)");
		     preparedStatement.setString(1, "3");
		     preparedStatement.setString(2, "email3");
		     preparedStatement.setString(3, "1");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  writeT(paperid, email,ordercont) values (?, ?, ?)");
		     preparedStatement.setString(1, "2");
		     preparedStatement.setString(2, "email4");
		     preparedStatement.setString(3, "1");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  writeT(paperid, email,ordercont) values (?, ?, ?)");
		     preparedStatement.setString(1, "8");
		     preparedStatement.setString(2, "emailZhang");
		     preparedStatement.setString(3, "1");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  writeT(paperid, email,ordercont) values (?, ?, ?)");
		     preparedStatement.setString(1, "8");
		     preparedStatement.setString(2, "emailLu");
		     preparedStatement.setString(3, "2");
		     preparedStatement.executeUpdate();
		     
		     //
		    
		    
		     preparedStatement = connect.prepareStatement("insert into  pcmember(email, name) values (?, ?)");
		     preparedStatement.setString(1, "email1");
		     preparedStatement.setString(2, "pcmember1");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  pcmember(email, name) values (?, ?)");
		     preparedStatement.setString(1, "email2");
		     preparedStatement.setString(2, "Matt");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  pcmember(email, name) values (?, ?)");
		     preparedStatement.setString(1, "email3");
		     preparedStatement.setString(2, "pcmember3");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  pcmember(email, name) values (?, ?)");
		     preparedStatement.setString(1, "email4");
		     preparedStatement.setString(2, "pcmember4");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  pcmember(email, name) values (?, ?)");
		     preparedStatement.setString(1, "email5");
		     preparedStatement.setString(2, "pcmember5");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  pcmember(email, name) values (?, ?)");
		     preparedStatement.setString(1, "email6");
		     preparedStatement.setString(2, "pcmember6");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  pcmember(email, name) values (?, ?)");
		     preparedStatement.setString(1, "email7");
		     preparedStatement.setString(2, "John");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  pcmember(email, name) values (?, ?)");
		     preparedStatement.setString(1, "email8");
		     preparedStatement.setString(2, "pcmember8");
		     preparedStatement.executeUpdate();
		     //review
		    
		     preparedStatement = connect.prepareStatement("insert into  review( sdate,comment,recommendation,paperid,email) values (?,?,?, ?, ?)");
		     preparedStatement.setString(1, "2018-04-06");
		     preparedStatement.setString(2, "test comment");
		     preparedStatement.setString(3, "N");
		     preparedStatement.setString(4, "1");
		     preparedStatement.setString(5, "email2");
		     preparedStatement.executeUpdate();
		     
		     preparedStatement = connect.prepareStatement("insert into  review( sdate,comment,recommendation,paperid,email) values (?,?,?, ?, ?)");
		     preparedStatement.setString(1, "2018-06-06");
		     preparedStatement.setString(2, "test comment");
		     preparedStatement.setString(3, "N");
		     preparedStatement.setString(4, "1");
		     preparedStatement.setString(5, "email7");
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  review( sdate,comment,recommendation,paperid,email) values (?,?,?, ?, ?)");
		     preparedStatement.setString(1, "2018-07-06");
		     preparedStatement.setString(2, "test comment");
		     preparedStatement.setString(3, "Y");
		     preparedStatement.setString(4, "1");
		     preparedStatement.setString(5, "email4");
		     preparedStatement.executeUpdate();preparedStatement = connect.prepareStatement("insert into  review( sdate,comment,recommendation,paperid,email) values (?,?,?, ?, ?)");
		     preparedStatement.setString(1, "2018-08-06");
		     preparedStatement.setString(2, "test comment");
		     preparedStatement.setString(3, "N");
		     preparedStatement.setString(4, "2");
		     preparedStatement.setString(5, "email7");
		     preparedStatement.executeUpdate();
		     preparedStatement.executeUpdate();preparedStatement = connect.prepareStatement("insert into  review( sdate,comment,recommendation,paperid,email) values (?,?,?, ?, ?)");
		     preparedStatement.setString(1, "2018-01-06");
		     preparedStatement.setString(2, "test comment");
		     preparedStatement.setString(3, "Y");
		     preparedStatement.setString(4, "6");
		     preparedStatement.setString(5, "email7");
		     preparedStatement.executeUpdate();
		     preparedStatement.executeUpdate();preparedStatement = connect.prepareStatement("insert into  review( sdate,comment,recommendation,paperid,email) values (?,?,?, ?, ?)");
		     preparedStatement.setString(1, "2018-02-06");
		     preparedStatement.setString(2, "test comment");
		     preparedStatement.setString(3, "Y");
		     preparedStatement.setString(4, "8");
		     preparedStatement.setString(5, "email6");
		     preparedStatement.executeUpdate();
		     
		     
		     preparedStatement = connect.prepareStatement("create view AcceptedPaper As  select p.paperid,p.title,count(*) from paper p inner join review r on r.paperid = p.paperid  inner join pcmember pc on r.email = pc.email where recommendation = 'Y'group by paperid having count(*) >= 2");
		     preparedStatement.executeUpdate();
		     
		    // preaparedStatememt = connect.prepareStatement("")
		     
		      
		      
		    } catch (Exception e) {
		         System.out.println(e);
		    } finally {
		      close();
		    }
			request.getRequestDispatcher("/jsps/body.jsp").forward(request, response);


		  }
	
		 
		 private static void close() {
			    try {
			      if (resultSet != null) {
			        resultSet.close();
			      }

			      if (statement != null) {
			        statement.close();
			      }

			      if (connect != null) {
			        connect.close();
			      }
			    } catch (Exception e) {

			    }
			    }
		
		
		
	}



