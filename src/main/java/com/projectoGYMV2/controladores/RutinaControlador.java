package com.projectoGYMV2.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projectoGYMV2.Servicios.RutinaServicio;
import com.projectoGYMV2.entidad.Rutina;

@RestController
@RequestMapping(path = "/rutina")
@CrossOrigin(origins = "http://localhost:4200")
public class RutinaControlador {

    @Autowired
    private RutinaServicio rutinaServicio;

    public RutinaControlador(RutinaServicio rutinaServicio){
        this.rutinaServicio = rutinaServicio;
    }

    @GetMapping
    public List<Rutina> listarRutinaControlador(){
        return rutinaServicio.ListarRutinas();
    }

    @GetMapping("{id}")
    public Optional<Rutina> buscarRutinaControlador(@PathVariable("id") int idRutina){
        return rutinaServicio.ListarRutinasId(idRutina);
    }
    
    @PostMapping
    public Rutina crearRutina(@RequestBody Rutina rutina){
        return rutinaServicio.guardarRutina(rutina);
    }

    @PutMapping("{id}")
    public Optional<Rutina> actualizarRutina(@PathVariable("id") int idRutina, @RequestBody Rutina rutinaAct){
        Optional<Rutina> rutinaOptional = rutinaServicio.ListarRutinasId(idRutina);
        if (rutinaOptional.isPresent()) {
            Rutina rutina = rutinaOptional.get();
            rutina.setNombreRutina(rutinaAct.getNombreRutina());
            rutina.setTiempoRutina(rutinaAct.getTiempoRutina());
            rutina.setDescripcionRutina(rutinaAct.getDescripcionRutina());
            rutinaServicio.actualizarRutina(rutina);
        }
        return rutinaOptional;
    }

    @DeleteMapping("{id}")
    public String eliminarRutinaId(@PathVariable("id") int idRutina){
        boolean resultadoPeticionEliminar = rutinaServicio.borrarRutina(idRutina);
        if (resultadoPeticionEliminar) {
            return "Rutina eliminada con exito numero de id = "+ idRutina;
        } else {
            return "No se pudo eliminar la rutina numero de id = " + idRutina;
        }
    }
}
