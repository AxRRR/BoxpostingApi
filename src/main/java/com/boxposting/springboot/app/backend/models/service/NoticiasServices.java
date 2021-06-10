package com.boxposting.springboot.app.backend.models.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boxposting.springboot.app.backend.models.dao.INoticias;
import com.boxposting.springboot.app.backend.models.entity.Noticias;

@Service
public class NoticiasServices implements MethodService {

	@Autowired
	private INoticias in;
	
	@Autowired
	private EntityManager em;
	
	@Override
	public List<Noticias> findAllTecnologia() {
		return (List<Noticias>) in.findAll();
	}

	@Override
	public List<Noticias> findByGeneroId(Long genero_id) {
		return in.findByGeneroLike(genero_id);
	}

	@Override
	public List<Noticias> findTop3Noticias() {
		return in.findTop3ByOrderByFechaAsc();
	}

	@Override
	public List<Noticias> findNoticiasOrdenadasAsc() {
		return in.findByOrderByFechaAsc();
	}

	@Override
	public List<Noticias> findNoticiasPorVistasAsc() {
		return in.findByOrderByVistasDesc();
	}

	@Override
	public Noticias findByIdNoticia(Long id) {
		return em.find(Noticias.class, id);
	}

}
