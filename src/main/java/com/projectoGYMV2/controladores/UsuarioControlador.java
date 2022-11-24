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

import com.projectoGYMV2.Servicios.UsuarioServicio;
import com.projectoGYMV2.entidad.Usuario;

@RestController
@RequestMapping(path = "/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioControlador {

	@Autowired
	private UsuarioServicio usuarioServicio;

	public UsuarioControlador(UsuarioServicio usuarioServicio) {
		this.usuarioServicio = usuarioServicio;
	}
	
	@GetMapping
	public List<Usuario> listarUsuariosControlador(){
		return usuarioServicio.ListarUsuarios();
	}
	
	@GetMapping("/{id}")
	public Optional<Usuario> buscarImplementoControlador(@PathVariable("id") int numDocumento) {
		return usuarioServicio.ListarUsuariosId(numDocumento);
	}
	
	@PostMapping
	public Usuario crearusuario (@RequestBody Usuario usuario) {
		return usuarioServicio.guardarUsuarios(usuario);
	}

	
	@PutMapping("/{id}") 
	Optional<Usuario> actualizarUsuarios(@PathVariable("id") int numDocumento, @RequestBody Usuario usuarioAct) {
	    Optional<Usuario> usuarioOptional = usuarioServicio.ListarUsuariosId(numDocumento);
	    if(usuarioOptional.isPresent()) {
	    	Usuario usuario = usuarioOptional.get();
	    	usuario.setNombres(usuarioAct.getNombres());
	    	usuario.setFechaRegistro(usuarioAct.getFechaRegistro());
	    	usuario.setTipoDoc(usuarioAct.getTipoDoc());
	    	usuario.setRol(usuarioAct.getRol());
	    	usuarioServicio.guardarUsuarios(usuario);
	    }
		return usuarioOptional;
	}
	
	@DeleteMapping(path = "/{id}")
	public String eliminarUsuariosId(@PathVariable("id") int numDocumento) {
		boolean resultadoPeticionEliminar = usuarioServicio.borrarUsuarios(numDocumento);
		if (resultadoPeticionEliminar) {
			return "implemento eliminado con exito numero de id = " + numDocumento;
		} else {
			return "No se pudo eliminar el implemento numero de id = " + numDocumento;
		}
	}
}


