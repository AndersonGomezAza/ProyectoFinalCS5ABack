package com.projectoGYMV2.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.projectoGYMV2.Servicios.Interface.ImplementosInterfaceServicios;
import com.projectoGYMV2.Vista.ImplementoVista;
import com.projectoGYMV2.entidad.Implemento;

@Service
public class ImplementoServicio implements ImplementosInterfaceServicios{
	
	@Autowired
	private ImplementoVista implementoVista;
	
	@Override
	public List<Implemento> ListarImplementos() {
		return (List<Implemento>)implementoVista.findAll();
	}

	@Override
	public Optional<Implemento> ListarImplementosId(int idImplemento) {
		return implementoVista.findById(idImplemento);
	}

	@Override
	public Implemento guardarImplemento(Implemento implemento) {
		return implementoVista.save(implemento);
	}
	
	@Override
	public Implemento actualizarImplemento(Implemento implemento) {
		return implementoVista.save(implemento);
	}


	@Override
	public Boolean borrarImplemento(int idImplemento) {
		try {
			implementoVista.deleteById(idImplemento);
			return true;
		} catch (Exception err) {
			return false;
		}		
	}

	
}
