package com.tbt.api.ourbooks.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {

	@Id
	private int idUsuario;
	@Column(name = "correo")
	private String correo;
	@Column(name = "claveIngreso")
	private String claveIngreso;
	public int getIdUsuario() {
		return idUsuario;
	}
	public String getCorreo() {
		return correo;
	}
	public String getClaveIngreso() {
		return claveIngreso;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public void setClaveIngreso(String claveIngreso) {
		this.claveIngreso = claveIngreso;
	}
	
	
}
