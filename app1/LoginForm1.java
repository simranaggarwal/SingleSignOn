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
        
        String att = (String)request.getAttribute("attributeName");
        String email=(String)request.getAttribute("email");
        if(att=="123456")
        {
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
    }
}