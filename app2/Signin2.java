package app2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/Signin2")
public class Signin2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = response.getWriter();
          
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        String city = request.getParameter("city");

        int i=0;
		Connection cn=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			cn=DbC2.myConnection();
			
			PreparedStatement stm=cn.prepareStatement("insert into application values(?,?,?,?)");
			
			stm.setString(1,name); 
			stm.setString(2,email);
			stm.setString(3,pass);
			stm.setString(4,city);
			i=stm.executeUpdate();  
			System.out.println(i);
			RequestDispatcher rs = request.getRequestDispatcher("LogFo2");
            rs.forward(request, response);
			
		}catch(Exception e)
		{
			RequestDispatcher rs = request.getRequestDispatcher("Signin2.html");
            rs.forward(request, response);
		}
    }  
}