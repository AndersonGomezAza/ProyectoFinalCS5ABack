package com.projectoGYMV2.Servicios.Interface;

import java.util.List;
import java.util.Optional;

import com.projectoGYMV2.entidad.Maquinaria;

public interface MaquinariainterfaceServicios {
	public List<Maquinaria>ListarMaquinarias();
	public Optional<Maquinaria> ListarMaquinariasId(int IdMaquinaria);
	public Maquinaria guardarMaquinaria(Maquinaria maquinaria);
	public Maquinaria actualizarMaquinaria(Maquinaria maquinaria);
	public Boolean borrarMaquinaria(int idMaquinaria);
}
