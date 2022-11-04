package com.projectoGYMV2.Vista;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projectoGYMV2.entidad.Implemento;

@Repository
public interface ImplementoVista extends CrudRepository<Implemento, Integer>{
	
}
