package model;

import java.sql.Date;

public class PersonaModel {
	
	private String rut;
	private String nombre;
	private String apellido;
	private String telefono;
	private Date fecha_ingreso;
	
	public PersonaModel() {
		// TODO Auto-generated constructor stub
	}

	public PersonaModel(String rut, String nombre, String apellido, String telefono, Date fecha_ingreso) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.fecha_ingreso = fecha_ingreso;
	}

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

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	@Override
	public String toString() {
		return "PersonaModel [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", fecha_ingreso=" + fecha_ingreso + "]";
	}
	
	
	
}
