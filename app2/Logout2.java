package app2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import java.sql.*;

public class Logout2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        {
        	Cookie ck2=new Cookie("email","");  
        	ck2.setMaxAge(0);  
        	response.addCookie(ck2); 
        	RequestDispatcher rs = request.getRequestDispatcher("index.html");
            rs.forward(request, response);
        }
    }
}