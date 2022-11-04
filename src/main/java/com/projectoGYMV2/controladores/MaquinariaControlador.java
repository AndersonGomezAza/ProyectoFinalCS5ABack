package com.projectoGYMV2.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projectoGYMV2.Servicios.MaquinariaServicio;
import com.projectoGYMV2.entidad.Maquinaria;


@RestController
@RequestMapping(path = "/maquinaria")
@CrossOrigin(origins = "http://localhost:4200")
public class MaquinariaControlador {
	@Autowired
	private MaquinariaServicio maquinariaServicio;

	public MaquinariaControlador(MaquinariaServicio maquinariaServicio) {
		this.maquinariaServicio = maquinariaServicio;
	}
	
	@GetMapping
	public List<Maquinaria> listarMaquinariaControlador(){
		return maquinariaServicio.ListarMaquinarias();
	}
	
	@GetMapping("/{id}")
	public Optional<Maquinaria> buscarMaquinariaControlador(@PathVariable("id") int idMaquinaria) {
		return maquinariaServicio.ListarMaquinariasId(idMaquinaria);
	}
	
	@PostMapping
	public Maquinaria crearMaquinaria(@RequestBody Maquinaria maquinaria) {
		return maquinariaServicio.guardarMaquinaria(maquinaria);
	}
	
	@PutMapping("/{id}")
	public Optional<Maquinaria> actualizarMaquinariaId(@PathVariable("id") int idMaquinaria, @RequestBody Maquinaria maquinariaAct) {
	    Optional<Maquinaria> maquinariaOptional = maquinariaServicio.ListarMaquinariasId(idMaquinaria);
        if(maquinariaOptional.isPresent()) {
            Maquinaria maquinaria = maquinariaOptional.get();
            maquinaria.setNombreMaquinaria(maquinariaAct.getNombreMaquinaria());
            maquinaria.setDescripcionMaquinaria(maquinariaAct.getDescripcionMaquinaria());
            maquinaria.setCategoriaMaquinaria(maquinariaAct.getCategoriaMaquinaria());
            maquinariaServicio.actualizarMaquinaria(maquinaria);
        }
        return maquinariaOptional;
	}
	
	@DeleteMapping(path = "/{id}")
	public String eliminarMaquinariaId(@PathVariable("id") int idMaquinaria) {
		boolean resultadoPeticionEliminar = maquinariaServicio.borrarMaquinaria(idMaquinaria);
		if (resultadoPeticionEliminar) {
			return "Maquinaria eliminada con exito numero de id = " + idMaquinaria;
		} else {
			return "No se pudo eliminar la maquinaria numero de id = " + idMaquinaria;
		}
	}
}
