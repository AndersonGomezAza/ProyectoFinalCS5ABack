package com.projectoGYMV2.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectoGYMV2.Servicios.ImplementoServicio;
import com.projectoGYMV2.entidad.Implemento;

@RestController
@RequestMapping("/implemento")
@CrossOrigin(origins = "http://localhost:4200")
public class ImplementoControlador {
	
	@Autowired
	private ImplementoServicio implementoServicio;

	public ImplementoControlador(ImplementoServicio implementoServicio) {
		this.implementoServicio = implementoServicio;
	}
	
	@GetMapping
	public List<Implemento> listarImplementoControlador(){
		return implementoServicio.ListarImplementos();
	}
	
	@GetMapping("/{id}")
	public Optional<Implemento> buscarImplementoControlador(@PathVariable("id") int idImplemento) {
		return implementoServicio.ListarImplementosId(idImplemento);
	}
	
	@PostMapping
	public Implemento crearimplemento(@RequestBody Implemento implemento) {
		return implementoServicio.guardarImplemento(implemento);
	}
	
	@PutMapping("/{idImplemento}")
	public Optional<Implemento> actualizarImplementoId(@PathVariable int idImplemento, @RequestBody Implemento implementoAct) {
	    Optional<Implemento> implementoOptional = implementoServicio.ListarImplementosId(idImplemento);
	    if(implementoOptional.isPresent()) {
	        Implemento implemento = implementoOptional.get();
	        implemento.setNombreImplemento(implementoAct.getNombreImplemento());
	        implemento.setDescripcionImplemento(implementoAct.getDescripcionImplemento());
	        implemento.setCategoriaImplemento(implementoAct.getCategoriaImplemento());
	        implementoServicio.guardarImplemento(implemento);
	    }
		return implementoOptional;
	}
	
	@DeleteMapping(path = "/{id}")
	public String eliminarImplementoId(@PathVariable("id") int idImplemento) {
		boolean resultadoPeticionEliminar = implementoServicio.borrarImplemento(idImplemento);
		if (resultadoPeticionEliminar) {
			return "implemento eliminado con exito numero de id = " + idImplemento;
		} else {
			return "No se pudo eliminar el implemento numero de id = " + idImplemento;
		}
	}
}
