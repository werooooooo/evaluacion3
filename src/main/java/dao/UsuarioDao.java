package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.PersonaBean;
import bean.UsuarioBean;
import conexion.Conexion;
import model.UsuarioModel;

public class UsuarioDao {
	
	public static UsuarioBean UsuarioLogin(UsuarioBean beanU, PersonaBean beanP) throws SQLException {
		
		ResultSet resultSet = null;
		UsuarioModel u = new UsuarioModel();
		
		PreparedStatement statement;
		String sql = null;
		Connection connection = obtenerConexion();
				
		try {
			sql = "SELECT u.rut, u.username, u.password, p.nombre, p.apellido, p.telefono FROM usuario u, persona p WHERE u.username = '" + beanU.getUsername() + "' AND password = '" + beanU.getPassword() + "' AND u.rut = p.rut";
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery(sql);
					
			if (resultSet.next()) {
				
				u.setRut(resultSet.getString(1));
				u.setUsername(resultSet.getString(2));
				u.setPassword(resultSet.getString(3));
				
				beanP.setRut(resultSet.getString(1));
				beanP.setNombre(resultSet.getString(4));
				beanP.setApellido(resultSet.getString(5));
				beanP.setTelefono(resultSet.getString(6));
				
				beanU.setValid(true);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return beanU;
	}
	
	
	// conexion pool
	private static Connection obtenerConexion() throws SQLException {
		return Conexion.getConnection();
	}
}
