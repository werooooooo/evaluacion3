package bean;

import java.sql.Date;

public class PersonaBean {

	private String rut;
	private String nombre;
	private String apellido;
	private String telefono;
	private Date fechaIngreso;
	
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFecha_ingreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
}
