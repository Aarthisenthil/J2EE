package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/httptwo")
public class Http2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String contactString = req.getParameter("u_contact");
		System.out.println(contactString);
		
		long contact = Long.parseLong(contactString);
		String email = req.getParameter("u_email");
		
		((ServletResponse) req).getWriter().print(email+"" +contact+ "==============");
		
		
	}
}
