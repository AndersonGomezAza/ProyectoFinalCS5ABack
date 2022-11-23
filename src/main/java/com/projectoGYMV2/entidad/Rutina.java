package com.projectoGYMV2.entidad;

import javax.persistence.*;

@Entity
@Table(name = "rutina")
public class Rutina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int idRutina;
    
    private String nombreRutina;
    private String tiempoRutina;
    private String caloriasRutina;
    private String descripcionRutina;
    
    public Rutina() {
        
    }

    public Rutina(int idRutina, String nombreRutina, String tiempoRutina, String caloriasRutina, String descripcionRutina) {
        this.idRutina = idRutina;
        this.nombreRutina = nombreRutina;
        this.tiempoRutina = tiempoRutina;
        this.caloriasRutina = caloriasRutina;
        this.descripcionRutina = descripcionRutina;
    }

    public int getIdRutina() {
        return idRutina;
    }

    public void setIdRutina(int idRutina) {
        this.idRutina = idRutina;
    }

    public String getNombreRutina() {
        return nombreRutina;
    }

    public void setNombreRutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
    }

    public String getTiempoRutina() {
        return tiempoRutina;
    }

    public void setTiempoRutina(String tiempoRutina) {
        this.tiempoRutina = tiempoRutina;
    }

    public String getDescripcionRutina() {
        return descripcionRutina;
    }

    public void setDescripcionRutina(String descripcionRutina) {
        this.descripcionRutina = descripcionRutina;
    }

    public String getCaloriasRutina() {
        return caloriasRutina;
    }

    public void setCaloriasRutina(String caloriasRutina) {
        this.caloriasRutina = caloriasRutina;
    }

    
}
