package model;

public class UsuarioModel {

	private String rut;
	private String username;
	private String password;
	
	public UsuarioModel() {
		// TODO Auto-generated constructor stub
	}

	public UsuarioModel(String rut, String username, String password) {
		super();
		this.rut = rut;
		this.username = username;
		this.password = password;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UsuarioModel [rut=" + rut + ", username=" + username + ", password=" + password + "]";
	}	
}
