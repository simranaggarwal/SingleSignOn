package app2;

import java.io.*;
//import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class Welcome2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //Connection cn=null;
        //Statement stmt=null;
    	/*HttpSession session2=request.getSession(false);
    	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setDateHeader("Expires", 0);*/
        Cookie ck2[]=request.getCookies();  
    	if(ck2!= null)
    	{
	        out.println("<html>");
	        out.println("<head><link rel='stylesheet' type='text/css' href='myStyle.css' /></head>");
	        out.println("<body>");
	        out.println("<h1>Welcome user to Application 2! <br></h1>");
	        out.println("<form action='Logt2' method=post>");
	        out.println("<input class='submit submit1' type='submit' value='Log Out'>");
	        out.println("</form>");
	        out.println("</body></html>");
    	}
    	else
    	{
    		RequestDispatcher rs = request.getRequestDispatcher("LogFo2");
            rs.forward(request, response);
    	}
    }
}