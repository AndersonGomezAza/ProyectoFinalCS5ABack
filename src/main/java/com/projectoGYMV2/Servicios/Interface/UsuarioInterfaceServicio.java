package com.projectoGYMV2.Servicios.Interface;

import java.util.List;
import java.util.Optional;

import com.projectoGYMV2.entidad.Usuario;

public interface UsuarioInterfaceServicio {
	public List<Usuario>ListarUsuarios();
	public Optional<Usuario> ListarUsuariosId(int numDocumento);
	public Usuario guardarUsuarios(Usuario usuario);
	public Usuario actualizarUsuarios(Usuario usuario);
	public Boolean borrarUsuarios(int numDocumento);
}
