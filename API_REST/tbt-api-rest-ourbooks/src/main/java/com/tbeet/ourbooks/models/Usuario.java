package com.tbeet.ourbooks.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usuarios") /*
							 * esto se pono solo si se quiere que la tabla tenga un nombre diferente al de
							 * la clase cmo tal, por estandar los nombres de las tablas suelen ir en
							 * minuscula y en plural, mientras que las clases en java por estandar van
							 * Capitalizadas y en singular
							 */
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id // se indica que es la llave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // el id es autoincrementado
	@Column(name = "id_usuario", nullable = false) // nombre como va a quedar en la bd, por estandar las palabras
													// compuestas van en minusculas y separadas por guion, mientras que
													// en java van pegadas y capitalizadas
	private Integer idUsuario;

	@Column(name = "nombre_usuario", nullable = true, unique = true) // no puede ser nulo
	private String nombreUsuario;

	@Column(nullable = false) // no puede ser nulo
	private String nombres;

	@Column(nullable = true) // no puede ser nulo
	private String apellidos;

	@Column(nullable = true, unique = false) // no puede ser nulo y no puede haber un correo repetido
	private String correo;

	@Column(nullable = false) // no puede ser nulo
	private String pais;

	
	
	@Column(nullable = false) // no puede ser nulo
	private String contrasena;
	


	@Column(name = "fecha_creacion", nullable = true) // nombre como va a quedar en la bd, por estandar las palabras
														// compuestas van en minusculas y separadas por guion, mientras
														// que en java van pegadas y capitalizadas
	@Temporal(TemporalType.DATE) // indica el formato en que se va a guardar en bd
	private Date fechaCreacion;


	
	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public String getPais() {
		return pais;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
	
}