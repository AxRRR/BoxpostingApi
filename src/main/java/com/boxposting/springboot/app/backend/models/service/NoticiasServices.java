package com.boxposting.springboot.app.backend.models.service;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boxposting.springboot.app.backend.models.dao.ITecnologia;
import com.boxposting.springboot.app.backend.models.entity.Tecnologia;

@Service
public class NoticiasServices implements MethodService {

	@Autowired
	private ITecnologia ITEG;
	
	@Autowired
	private EntityManager em;
	
	@Override
	public List<Tecnologia> findAllTecnologia() {
		return (List<Tecnologia>) ITEG.findAll();
	}

	@Override
	public List<Tecnologia> findByGeneroId(Long genero_id) {
		return ITEG.findByGeneroLike(genero_id);
	}

}
