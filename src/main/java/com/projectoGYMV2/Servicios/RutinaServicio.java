package com.projectoGYMV2.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectoGYMV2.Servicios.Interface.RutinaIntefaceServicio;
import com.projectoGYMV2.Vista.RutinaVista;
import com.projectoGYMV2.entidad.Rutina;

@Service
public class RutinaServicio implements RutinaIntefaceServicio{

    @Autowired
    private RutinaVista rutinaVista;

    @Override
    public List<Rutina> ListarRutinas() {
        return (List<Rutina>)rutinaVista.findAll();
    }

    @Override
    public Optional<Rutina> ListarRutinasId(int IdRutina) {
        return rutinaVista.findById(IdRutina);
    }

    @Override
    public Rutina guardarRutina(Rutina rutina) {
        return rutinaVista.save(rutina);
    }

    @Override
    public Rutina actualizarRutina(Rutina rutina) {
        return rutinaVista.save(rutina);
    }

    @Override
    public Boolean borrarRutina(int idRutina) {
        try {
            rutinaVista.deleteById(idRutina);
            return true;
        } catch (Exception errException) {
            return false;
        }
    }
    
}
