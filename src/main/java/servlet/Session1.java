package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session1")
public class Session1 extends HttpServlet {
	 @Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		super.service(req, res);
		String mail = req.getParameter("email");
		String password = req.getParameter("pass");
		
		if(mail.equals("abc@gmail.com")&& password.equals("abc123"))
		{
			HttpSession session = req.getSession();
			session.setAttribute("k1", mail);
			res.sendRedirect("session2");
		}
		else {
			res.getWriter().print("invalid creation");
		}
	}
}

