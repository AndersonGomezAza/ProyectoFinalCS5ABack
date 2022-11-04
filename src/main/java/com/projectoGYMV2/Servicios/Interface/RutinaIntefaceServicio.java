package com.projectoGYMV2.Servicios.Interface;

import java.util.List;
import java.util.Optional;

import com.projectoGYMV2.entidad.Rutina;

public interface RutinaIntefaceServicio {
    public List<Rutina>ListarRutinas();
	public Optional<Rutina> ListarRutinasId(int IdRutina);
	public Rutina guardarRutina(Rutina rutina);
	public Rutina actualizarRutina(Rutina rutina);
	public Boolean borrarRutina(int idRutina);
}
