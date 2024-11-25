package servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/httpone")
public class Http1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req ,HttpServletResponse res ) throws IOException {
		
		res.getWriter().print("from anchor tag");
	}
}
