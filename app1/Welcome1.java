package app1;

import java.io.*;
//import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class Welcome1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Cookie ck1[]=request.getCookies();  
    	if(ck1!= null)
    	{
    		out.println("<html>");
	        out.println("<head><link rel='stylesheet' type='text/css' href='myStyle.css' /></head>");
	        out.println("<body>");
	        out.println("<h1>Welcome user to Application 1! <br></h1>");
	        out.println("<form action='Logt1' method=post>");
	        out.println("<input class='submit submit1' type='submit' value='Log Out'>");
	        out.println("</form>");
	        out.println("</body></html>"); 		
    	}
    	else
    	{
    		RequestDispatcher rs = request.getRequestDispatcher("index.html");
            rs.forward(request, response);
    	}
    }
}