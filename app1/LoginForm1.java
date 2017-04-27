package app1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import java.sql.*;

public class LoginForm1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        /*HttpSession session1=request.getSession(false);
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setDateHeader("Expires", 0);*/
        
        String att = (String)request.getAttribute("attributeName");
        String email=(String)request.getAttribute("email");
        if(att=="123456")
        {
        	System.out.println("Yeayyyy");
        	Cookie ck1=new Cookie("email",email);  
	        response.addCookie(ck1);   
	        RequestDispatcher rs = request.getRequestDispatcher("Welc1");
        	rs.forward(request, response);
        }
        else
        {
        	request.setAttribute("domain","LogFo1");
        	RequestDispatcher rs = request.getRequestDispatcher("AuthServ");
        	rs.forward(request, response);
        }
        /*if(session1!=null )
        {
        	RequestDispatcher rs = request.getRequestDispatcher("Welc1");
            rs.forward(request, response);
        }               
        else
        {
        	out.println("<html>");
        	out.println("<head>");
	        out.println("<title>Login Form 1</title>");
	        out.println(" <link rel='stylesheet' type='text/css' href='myStyle.css' />");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h1>Log In for Application 1!</h1>");
	        //out.println(session1.getAttribute("ed"));
	   		out.println("<form name='loginform1' method='post' action=Log1>");
			out.println("<table>");
			out.println("<tr>");
			out.println("<td width='76' class='st'><div align='right'>E-mail ID</div></td>");
			out.println("<td width='177' ><input name='email' type='text' /></td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td width='76' class='st'><div align='right'>Password</div></td>");
			out.println("<td width='177' ><input name='password' type='password' /></td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("<br><br>");
			out.println("<input class='submit submit1' type='submit' value='Log In!'>");
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
        }*/
    }
}