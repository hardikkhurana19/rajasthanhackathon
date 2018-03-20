package Dow;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBcon;

public class Registration {
	public void register(String name, String district, String type, String season, String soil, long phoneno) {
		Connection con = DBcon.getConnection();
		try {
			PreparedStatement preparedStatement = con.prepareStatement("insert into kissan values( ?, ?, ?, ?, ?, ?);");
			preparedStatement.setString(1, name);
			preparedStatement.setLong(2, phoneno);
			preparedStatement.setString(3, district);
			preparedStatement.setString(4, type);
			preparedStatement.setString(5, season);
			preparedStatement.setString(6, soil);
			preparedStatement.executeUpdate();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		}
	}

