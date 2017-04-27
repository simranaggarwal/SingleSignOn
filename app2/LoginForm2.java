package app2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginForm2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        /*PrintWriter out = response.getWriter();
        HttpSession session2=request.getSession(false);
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setDateHeader("Expires", 0);*/
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
        
        
        /*if(session2!=null)
        {
        	RequestDispatcher rs = request.getRequestDispatcher("Welc2");
            rs.forward(request, response);
        }
        else
        if(session2==null && centralizedAuth.Authenticate.getauth2()==true)
        {
        	String ses=centralizedAuth.Authenticate.generatesess();
        	session2.setAttribute("ed",ses); 
        	RequestDispatcher rs = request.getRequestDispatcher("Welc2");
            rs.forward(request, response);
        }
        else
        {
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Login Form 2</title>");
	        out.println(" <link rel='stylesheet' type='text/css' href='myStyle.css' />");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h1>Log In for Application 2!</h1>");
	   		out.println("<form name='loginform2' method='post' action=Log2>");
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