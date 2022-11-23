package com.projectoGYMV2.Servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.projectoGYMV2.Servicios.Interface.UsuarioInterfaceServicio;
import com.projectoGYMV2.Vista.UsuarioVista;
import com.projectoGYMV2.entidad.Usuario;
@Service
public class UsuarioServicio implements UsuarioInterfaceServicio {

	@Autowired
	private UsuarioVista usuarioVista;

	@Override
	public List<Usuario> ListarUsuarios() {
		return (List<Usuario>) usuarioVista.findAll();
	}

	@Override
	public Optional<Usuario> ListarUsuariosId(int numDocumento) {
		return usuarioVista.findById(numDocumento);
	}

	@Override
	public Usuario guardarUsuarios(Usuario usuario) {
		return usuarioVista.save(usuario);
	}

	@Override
	public Usuario actualizarUsuarios(Usuario usuario) {
		return usuarioVista.save(usuario);
	}
	@Override
	public Boolean borrarUsuarios(int numDocumento) {
		try {
			usuarioVista.deleteById(numDocumento);
			return true;
		} catch (Exception err) {
			return false;
		}		
	}
}
