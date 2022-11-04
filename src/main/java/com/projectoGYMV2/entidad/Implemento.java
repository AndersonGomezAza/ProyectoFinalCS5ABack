package com.projectoGYMV2.entidad;

import javax.persistence.*;

@Entity
@Table(name ="implemento")
public class Implemento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int idImplemento;
	
	private String nombreImplemento;
	private String descripcionImplemento;
	private String categoriaImplemento;
	
	public Implemento() {
		
	}

	public Implemento(int idImplemento, String nombreImplemento, String descripcioImplemento,String categoriaImplemento) {
		this.idImplemento = idImplemento;
		this.nombreImplemento = nombreImplemento;
		this.descripcionImplemento = descripcioImplemento;
		this.categoriaImplemento = categoriaImplemento;
	}

	public int getIdImplemento() {
		return idImplemento;
	}

	public void setIdImplemento(int idImplemento) {
		this.idImplemento = idImplemento;
	}

	public String getNombreImplemento() {
		return nombreImplemento;
	}

	public void setNombreImplemento(String nombreImplemento) {
		this.nombreImplemento = nombreImplemento;
	}

	public String getDescripcionImplemento() {
		return descripcionImplemento;
	}

	public void setDescripcionImplemento(String descripcioImplemento) {
		this.descripcionImplemento = descripcioImplemento;
	}

	public String getCategoriaImplemento() {
		return categoriaImplemento;
	}

	public void setCategoriaImplemento(String categoriaImplemento) {
		this.categoriaImplemento = categoriaImplemento;
	}
	
	
	
}
