package com.projectoGYMV2.entidad;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;


@Entity
@Table(name ="usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int numDocumento;
	private String nombres;
	@JsonFormat(pattern ="yyyy-MM-dd", shape = Shape.STRING)
	private String fechaRegistro;
	private String tipoDoc;
	private String rol;
	
	public Usuario() {
		
	}

	public Usuario(int numDocumento, String nombres, String fechaRegistro, String tipoDoc, String rol) {
		this.numDocumento = numDocumento;
		this.nombres = nombres;
		this.fechaRegistro = fechaRegistro;
		this.tipoDoc = tipoDoc;
		this.rol = rol;
	}

	public int getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(int numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
}
