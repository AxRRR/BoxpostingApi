package com.boxposting.springboot.app.backend.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.boxposting.springboot.app.backend.models.entity.Tecnologia;

public interface ITecnologia extends CrudRepository<Tecnologia, Long>{

	/*@Query("select g from Tecnologia g where g.genero_id like %?1%")
	public List<Tecnologia> findByGenero_id(Long genero_id);*/
	
	public List<Tecnologia> findByGeneroLike(Long genero);
}
