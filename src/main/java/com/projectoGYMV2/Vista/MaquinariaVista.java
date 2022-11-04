package com.projectoGYMV2.Vista;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projectoGYMV2.entidad.Maquinaria;

@Repository
public interface MaquinariaVista extends CrudRepository<Maquinaria, Integer>{

}
