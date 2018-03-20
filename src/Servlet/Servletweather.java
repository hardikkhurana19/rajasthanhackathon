package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dow.WeatherDow;


@WebServlet("/Servletweather")
public class Servletweather extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	String conditions, datetime, city;
    	float humidity, temperature,pressure, sealevel, windspeed;
    	
	protected void doGet(HttpServletRequest request, HttpServletResponse response){
		try {
		System.out.println("***************DATA HAS ARRIVED*************");
		conditions = request.getParameter("conditions");
		humidity = Float.parseFloat(request.getParameter("humidity"));
		temperature = Float.parseFloat(request.getParameter("temperature"));
		pressure = Float.parseFloat(request.getParameter("pressure"));
		sealevel = Float.parseFloat(request.getParameter("sealevel"));
		windspeed = Float.parseFloat(request.getParameter("windspeed"));
		datetime = request.getParameter("datetime");
		city = request.getParameter("city");
		
		new WeatherDow().insertWeather(conditions, datetime, humidity, temperature, pressure, sealevel, windspeed, city);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	
}
