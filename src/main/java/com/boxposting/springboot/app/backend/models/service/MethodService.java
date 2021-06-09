package com.boxposting.springboot.app.backend.models.service;

import java.util.List;

import com.boxposting.springboot.app.backend.models.entity.Tecnologia;

public interface MethodService {

	public List<Tecnologia> findAllTecnologia();
	
	public List<Tecnologia> findByGeneroId(Long genero_id);
	
}
