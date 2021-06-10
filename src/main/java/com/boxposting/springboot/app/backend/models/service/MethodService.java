package com.boxposting.springboot.app.backend.models.service;

import java.util.List;

import com.boxposting.springboot.app.backend.models.entity.Noticias;

public interface MethodService {

	public List<Noticias> findAllTecnologia();
	
	public List<Noticias> findByGeneroId(Long genero_id);
	
	public List<Noticias> findTop3Noticias();
	
	public List<Noticias> findNoticiasOrdenadasAsc();
	
	public List<Noticias> findNoticiasPorVistasAsc();
	
	public Noticias saveNoticia(Noticias noticias);
	
	public Noticias findByIdNoticia(Long id);
}
