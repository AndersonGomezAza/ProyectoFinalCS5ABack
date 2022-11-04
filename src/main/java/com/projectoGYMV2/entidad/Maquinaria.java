package com.projectoGYMV2.entidad;

import javax.persistence.*;

@Entity
@Table(name ="maquinaria")
public class Maquinaria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int idMaquinaria;
    
    private String nombreMaquinaria;
    private String descripcionMaquinaria;
    private String categoriaMaquinaria;
    
    public Maquinaria() {
        
    }

	public Maquinaria(int idMaquinaria, String nombreMaquinaria, String descripcioMaquinaria,String categoriaMaquinaria) {
		this.idMaquinaria = idMaquinaria;
		this.nombreMaquinaria = nombreMaquinaria;
		this.descripcionMaquinaria = descripcioMaquinaria;
		this.categoriaMaquinaria = categoriaMaquinaria;
	}

	public int getIdMaquinaria() {
		return idMaquinaria;
	}

	public void setIdMaquinaria(int idMaquinaria) {
		this.idMaquinaria = idMaquinaria;
	}

	public String getNombreMaquinaria() {
		return nombreMaquinaria;
	}

	public void setNombreMaquinaria(String nombreMaquinaria) {
		this.nombreMaquinaria = nombreMaquinaria;
	}

	public String getDescripcionMaquinaria() {
		return descripcionMaquinaria;
	}

	public void setDescripcionMaquinaria(String descripcioMaquinaria) {
		this.descripcionMaquinaria = descripcioMaquinaria;
	}

	public String getCategoriaMaquinaria() {
		return categoriaMaquinaria;
	}

	public void setCategoriaMaquinaria(String categoriaMaquinaria) {
		this.categoriaMaquinaria = categoriaMaquinaria;
	}
    
    
}