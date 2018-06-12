

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
import java.lang.String;

/**
 * Servlet implementation class findAll
 */

public class assign extends HttpServlet {
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

		        

		     String pc0 = request.getParameter("assign0");
		     String pc1 = request.getParameter("assign1");
		     String pc2 = request.getParameter("assign2");
		     
		     String em0 = request.getParameter("email0");
		     String em1 = request.getParameter("email1");
		     String em2 = request.getParameter("email2");
		      

		  
		      
		     preparedStatement = connect.prepareStatement("insert into  pcmember(email,name) values (?,?)");
		     preparedStatement.setString(1,em0);
		     preparedStatement.setString(2,pc0);
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  pcmember(email,name) values (?,?)");
		     preparedStatement.setString(1,em1);
		     preparedStatement.setString(2,pc1);
		     preparedStatement.executeUpdate();
		     preparedStatement = connect.prepareStatement("insert into  pcmember(email,name) values (?,?)");
		     preparedStatement.setString(1,em2);
		     preparedStatement.setString(2,pc2);
		     preparedStatement.executeUpdate();
		      
		      
		     
		      
		      
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



