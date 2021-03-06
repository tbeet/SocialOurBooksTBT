package com.tbeet.ourbooks.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usuarios") /*esto se pono solo si se quiere que la tabla tenga un nombre diferente al de la clase cmo tal, por
estandar los nombres de las tablas suelen ir en minuscula y en plural, mientras que las clases en java por estandar
van Capitalizadas y en singular*/
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id //se indica que es la llave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY )//el id es autoincrementado
	@Column(name="id_usuario", nullable = false)//nombre como va a quedar en la bd, por estandar las palabras compuestas van en minusculas y separadas por guion, mientras que en java van pegadas y capitalizadas
	private Long idUsuario;
	
	@Column(name="nombre_usuario",nullable = false, unique = true)//no puede ser nulo
	private String nombreUsuario;
	
	@Column(nullable = false)//no puede ser nulo
	private String nombre;
	
	@Column(nullable = false)//no puede ser nulo
	private String apellido;
	
	@Column(nullable = false, unique = false)//no puede ser nulo y no puede haber un correo repetido
	private String correo;
	
	@Column(nullable = false)	//no puede ser nulo
	private String pais;
	
	@Column(name="fecha_usuario",nullable = false)//nombre como va a quedar en la bd, por estandar las palabras compuestas van en minusculas y separadas por guion, mientras que en java van pegadas y capitalizadas
	@Temporal(TemporalType.DATE)//indica el formato en que se va a guardar en bd
	private Date fechaCreacion;
	

	
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getCorreo() {
		return correo;
	}

	public String getPais() {
		return pais;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public void setPais(String pais) {
		pais = pais;
	}
	
}
