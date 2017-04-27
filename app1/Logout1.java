package app1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import java.sql.*;

public class Logout1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");       
            
        	Cookie ck1=new Cookie("email","");  
        	ck1.setMaxAge(0);  
        	response.addCookie(ck1);  
        	RequestDispatcher rs = request.getRequestDispatcher("index.html");
            rs.forward(request, response);
        
        /*else
        {
	        out.println("<html>");
	    	out.println("<head>");
	        out.println("<link rel='stylesheet' type='text/css' href='myStyle.css' />");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h1>You are successfully logged out!</h1>");
			out.println("</body>");
			out.println("</html>");
        }*/
    }
}