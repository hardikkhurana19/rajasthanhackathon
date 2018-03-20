package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dow.Registration;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String name, district, type, season, soil;
    long phoneNo;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		name = request.getParameter("name");
		district = request.getParameter("district");
		type = request.getParameter("type");
		season = request.getParameter("season");
		soil = request.getParameter("soil");
		phoneNo = Long.parseLong(request.getParameter("phoneno"));
		
		new Registration().register(name, district, type, season, soil, phoneNo);
		response.sendRedirect("index.html");
	}
}
