package Dow;

import java.sql.Connection;

import java.sql.PreparedStatement;

import connection.DBcon;

public class WeatherDow {
	static Connection con = DBcon.getConnection();
	
	public void insertWeather(String condition, String datetime,float humidity, float temperature, float pressure, float sealevel, float windspeed, String city) {
	try {
		PreparedStatement preparedStatement = con.prepareStatement("insert into weather values(?, ?, ?, ?, ?, ?, ?, ?);");
		preparedStatement.setString(1, condition);
		preparedStatement.setFloat(2, humidity);
		preparedStatement.setFloat(3, temperature);
		preparedStatement.setFloat(4, pressure);
		preparedStatement.setFloat(5, sealevel);
		preparedStatement.setFloat(6, windspeed);
		preparedStatement.setString(7, datetime);
		preparedStatement.setString(8, city);
		preparedStatement.executeUpdate();
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	}
}
