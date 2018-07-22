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

public class insertreview extends HttpServlet {
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
		      connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb?"+ "user=root&password=WayneState2017");

		      String ir1 = request.getParameter("date0");
		      String ir2 = request.getParameter("comment0");
		      String ir3 = request.getParameter("rec0");
		      String ir4 = request.getParameter("paperdid0");
		      String ir5 = request.getParameter("email0");
		      
		      preparedStatement = connect.prepareStatement("insert into  review(sdate,comment,recommendation,paperid,email) values (?,?,?,?,?)");
			  preparedStatement.setString(1,ir1);
			  preparedStatement.setString(2,ir2);
			  preparedStatement.setString(3,ir3);
			  preparedStatement.setString(4,ir4);
			  preparedStatement.setString(5,ir5);
			  
			  preparedStatement.executeUpdate();

		     
		      
		    } catch (Exception e) {
		         System.out.println(e);
		    } finally {
		      close();
		    }
			request.getRequestDispatcher("/jsps/Insertpaper.jsp").forward(request, response);


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
