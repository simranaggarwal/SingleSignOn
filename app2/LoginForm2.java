package app2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginForm2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String att = (String)request.getAttribute("attributeName");
        String email=(String)request.getAttribute("email");
        if(att=="123456")
        {
        	Cookie ck2=new Cookie("email",email);  
	        response.addCookie(ck2);   
	        RequestDispatcher rs = request.getRequestDispatcher("Welc2");
        	rs.forward(request, response);
        }
        else
        {
        	request.setAttribute("domain","LogFo2");
        	RequestDispatcher rs = request.getRequestDispatcher("AuthServ");
        	rs.forward(request, response);
        }
    }
}