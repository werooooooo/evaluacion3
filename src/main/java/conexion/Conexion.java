package conexion;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
	
	private static BasicDataSource dataSourse=null;

	private  static DataSource getDataSource() {
		
		if (dataSourse == null) {
			dataSourse = new BasicDataSource();
			dataSourse.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSourse.setUsername("root");
			dataSourse.setPassword("root");
			dataSourse.setUrl("jdbc:mysql://localhost:3307/banco_platinum");
			dataSourse.setInitialSize(20);
			dataSourse.setMaxIdle(15);
			dataSourse.setMaxTotal(20);
			dataSourse.setMaxWaitMillis(5000);
		}
		return dataSourse;
	}
	
	public static Connection getConnection() throws SQLException {
		return getDataSource().getConnection();
	}
}
