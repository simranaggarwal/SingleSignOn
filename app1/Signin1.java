package app1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/Signin1")
public class Signin1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        String city = request.getParameter("city");
        
        int i;
		Connection cn=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			cn=DbC1.myConnection();
			
			PreparedStatement stm=cn.prepareStatement("insert into application (Name, ID, Password, City) values(?,?,?,?)");
			stm.setString(1,name); 
			stm.setString(2,email);
			stm.setString(3,pass);
			stm.setString(4,city);			
			i=stm.executeUpdate();  
			RequestDispatcher rs = request.getRequestDispatcher("LogFo1");
            rs.forward(request, response);
			
		}catch(Exception e)
		{
			System.out.println(e);
			RequestDispatcher rs = request.getRequestDispatcher("Signin1.html");
			rs.forward(request, response);
		}
    }  
}