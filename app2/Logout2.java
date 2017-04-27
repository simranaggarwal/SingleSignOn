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
        
        //if(session1==null || session1.getAttribute("ed")==null)
        {
        	Cookie ck2=new Cookie("email","");  
        	ck2.setMaxAge(0);  
        	response.addCookie(ck2); 
        	RequestDispatcher rs = request.getRequestDispatcher("index.html");
            rs.forward(request, response);
        }
        /*out.println("<html>");
    	out.println("<head>");
        out.println("<link rel='stylesheet' type='text/css' href='myStyle.css' />");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>You are successfully logged out!</h1>");
        out.println("<form method='post' action=LogFo2>");
        out.println("<input class='submit submit1' type='submit' value='Log In!'>");
        out.println("</form>");
		out.println("</body>");
		out.println("</html>");
        */
    }
}