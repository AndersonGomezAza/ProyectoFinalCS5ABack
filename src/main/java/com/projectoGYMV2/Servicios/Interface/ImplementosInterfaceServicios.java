package com.projectoGYMV2.Servicios.Interface;

import java.util.List;
import java.util.Optional;

import com.projectoGYMV2.entidad.Implemento;

public interface ImplementosInterfaceServicios {
	public List<Implemento>ListarImplementos();
	public Optional<Implemento> ListarImplementosId(int IdImplemento);
	public Implemento guardarImplemento(Implemento implemento);
	public Implemento actualizarImplemento(Implemento implemento);
	public Boolean borrarImplemento(int idImplemento);
}
