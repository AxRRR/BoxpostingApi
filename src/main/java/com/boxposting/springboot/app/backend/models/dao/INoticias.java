package com.boxposting.springboot.app.backend.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.boxposting.springboot.app.backend.models.entity.Noticias;

public interface INoticias extends CrudRepository<Noticias, Long>{
	
	public List<Noticias> findByGeneroLike(Long genero);
	
	public List<Noticias> findTop3ByOrderByFechaAsc();
}
