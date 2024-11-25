package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/verify")
public class Verify extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("user email");
		String name = req.getParameter("user name");
		long contact = Long.parseLong(req.getParameter("user contact"));
		int Id = Integer.parseInt(req.getParameter("user id"));
		
		res.getWriter().print(Id+ "" + name+ "" +email+ "" +contact+ "data fetched from html file");
		
		try {
			Class.forName("com.mysql.cj.jdbc.driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc :mysql:// localhost:3306/school","root","root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String query = "insert into student values (?,?,?,?)";
		Object con;
		PreparedStatement pst = (PreparedStatement) con.preparedStatement(query);
		pst.setInt(1, Id);
		pst.setString(2, name);
		pst.setString(3, email);
		pst.setLong(4,contact);
		
		int a = ((java.sql.Statement)pst).executeUpdate(query);
		con.clone();
		res.getWriter().print(a+"row inserted");
	}
	
}
