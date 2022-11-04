package com.projectoGYMV2.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectoGYMV2.Servicios.Interface.MaquinariainterfaceServicios;
import com.projectoGYMV2.Vista.MaquinariaVista;
import com.projectoGYMV2.entidad.Maquinaria;

@Service
public class MaquinariaServicio implements MaquinariainterfaceServicios {
	
	@Autowired
	private MaquinariaVista maquinariaVista;
	
	@Override
	public List<Maquinaria> ListarMaquinarias() {
		return (List<Maquinaria>)maquinariaVista.findAll();
	}

	@Override
	public Optional<Maquinaria> ListarMaquinariasId(int IdMaquinaria) {
		return maquinariaVista.findById(IdMaquinaria);
	}

	@Override
	public Maquinaria guardarMaquinaria(Maquinaria maquinaria) {
		return maquinariaVista.save(maquinaria);
	}

	@Override
	public Maquinaria actualizarMaquinaria(Maquinaria maquinaria) {
		return maquinariaVista.save(maquinaria);
	}

	@Override
	public Boolean borrarMaquinaria(int idMaquinaria) {
		try {
			maquinariaVista.deleteById(idMaquinaria);
			return true;
		} catch (Exception err) {
			return false;
		}		
	}
	
}
