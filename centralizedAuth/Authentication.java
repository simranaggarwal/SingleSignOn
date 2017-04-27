package centralizedAuth;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();        
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        String str= request.getParameter("dom");
        Boolean flag=Val1.checkUser(email, pass);
        if(flag)
        {
        	Cookie ck=new Cookie("email",email);  
	        response.addCookie(ck);         	
	        request.setAttribute("attributeName","123456");
	        request.setAttribute("email",email);
	        
	        System.out.println(str);
	        if(str.equals("Application 1"))
	        {	        	
	        	RequestDispatcher rs = request.getRequestDispatcher("LogFo1");
	        	rs.forward(request, response);
	        }
	        else
	        {
	        	RequestDispatcher rs = request.getRequestDispatcher("LogFo2");
	        	rs.forward(request, response);
	        }
        }
        else
        {
           out.println("E-mail or Password incorrect");
           RequestDispatcher rs = request.getRequestDispatcher("index.html");
           rs.include(request, response);
        }
    }  
}