package com.boxposting.springboot.app.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boxposting.springboot.app.backend.models.entity.Noticias;
import com.boxposting.springboot.app.backend.models.service.MethodService;

@CrossOrigin(origins = {"http://localhost:3000"} )
@RestController
@RequestMapping("/api")
public class BoxPostingHomePageController {

	@Autowired
	private MethodService method;
	
	@GetMapping("/buscarnoticia/{id}")
	public Noticias RecibirNoticiaId(@PathVariable Long id) {
		return method.findByIdNoticia(id);
	}
	
	@GetMapping("/buscarnoticias")
	public List<Noticias> RecibirNoticiasTecnlogias() {
		return method.findAllTecnologia();
	}
	
	@GetMapping("/buscarnoticiasporgenero/{genero}")
	public List<Noticias> RecibirAllNoticiasTecnologicas(@PathVariable Long genero){
		return method.findByGeneroId(genero);
	}
	
	@GetMapping("/top3noticias")
	public List<Noticias> RecibirTop3Noticias(){
		return method.findTop3Noticias();
	}
	
	@GetMapping("/ultimasnoticiasordenada")
	public List<Noticias> RecibirNoticiasOrdenadas(){
		return method.findNoticiasOrdenadasAsc();
	}
	
	@GetMapping("/ultimasnoticiasordenadaporvistas")
	public List<Noticias> RecibirNoticiasOrdenadasPorVistas(){
		return method.findNoticiasPorVistasAsc();
	}
	
	@PostMapping("/agregarnoticia")
	public Noticias AgregarNoticia(@RequestBody Noticias noticias) {
		return method.saveNoticia(noticias);
	}
}
