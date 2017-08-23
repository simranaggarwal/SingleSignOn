package centralizedAuth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie; 
@WebServlet("/AuthServer")
public class AuthServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Cookie ck[]=request.getCookies();  
		String str=(String)request.getAttribute("domain");
        if(ck!=null)
        {
        	String email=ck[0].getValue();
        	request.setAttribute("attributeName","123456");
	        request.setAttribute("email",email);
	        
	        if(str=="LogFo1")
	        {
	        	RequestDispatcher rs = request.getRequestDispatcher("LogFo1");
	        	rs.forward(request, response);
	        }
	        else
	        if(str=="LogFo2")
	        {
	        	RequestDispatcher rs = request.getRequestDispatcher("LogFo2");
	        	rs.forward(request, response);
	        }
        }
        else
		{
			out.println("<html>");
        	out.println("<head>");
	        out.println("<title>Login Form</title>");
	        out.println("<link rel='stylesheet' type='text/css' href='myStyle.css' />");
	        out.println("</head>");
	        out.println("<body>");
	        if(str=="LogFo1")
	        {
	        	out.println("<h1>Log In for Application 1!</h1>");
	        }
	        else
	        {
	        	out.println("<h1>Log In for Application 2!</h1>");
	        }
	   		out.println("<form name='loginform' method='post' action=authn>");
			out.println("<table>");
			out.println("<tr>");
			out.println("<td width='76' class='st'><div align='right'>E-mail ID</div></td>");
			out.println("<td width='177' ><input name='email' type='text' /></td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td width='76' class='st'><div align='right'>Password</div></td>");
			out.println("<td width='177' ><input name='password' type='password' /></td>");
			out.println("</tr>");
			if(str=="LogFo1")
			{
				out.println("<tr>");
				out.println("<td width='76' class='st'><div align='right'>Application</div></td>");
				out.println("<td width='177' ><input name='dom' type='text' value='Application 1' readonly/></td>");
				out.println("</tr>");
			}
			else
			{
				out.println("<tr>");
				out.println("<td width='76' class='st'><div align='right'>Application</div></td>");
				out.println("<td width='177' ><input name='dom' type='text' value='Application 2' readonly/></td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("<br><br>");
			out.println("<input class='submit submit1' type='submit' value='Log In!'>");
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
			
		}
	}
}
