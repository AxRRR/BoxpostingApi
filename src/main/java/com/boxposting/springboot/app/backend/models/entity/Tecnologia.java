package com.boxposting.springboot.app.backend.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tecnologia {

	@Id
	private Long id_noticia;

	private String titulo_noticia;

	private String texto_noticia;

	private String imagen_noticia;

	private Date fecha_noticia;

	private Long vistas_noticia;

	@Column(name = "genero_id")
	private Long genero;

	public Long getId_noticia() {
		return id_noticia;
	}

	public void setId_noticia(Long id_noticia) {
		this.id_noticia = id_noticia;
	}

	public String getTitulo_noticia() {
		return titulo_noticia;
	}

	public void setTitulo_noticia(String titulo_noticia) {
		this.titulo_noticia = titulo_noticia;
	}

	public String getTexto_noticia() {
		return texto_noticia;
	}

	public void setTexto_noticia(String texto_noticia) {
		this.texto_noticia = texto_noticia;
	}

	public String getImagen_noticia() {
		return imagen_noticia;
	}

	public void setImagen_noticia(String imagen_noticia) {
		this.imagen_noticia = imagen_noticia;
	}

	public Date getFecha_noticia() {
		return fecha_noticia;
	}

	public void setFecha_noticia(Date fecha_noticia) {
		this.fecha_noticia = fecha_noticia;
	}

	public Long getVistas_noticia() {
		return vistas_noticia;
	}

	public void setVistas_noticia(Long vistas_noticias) {
		this.vistas_noticia = vistas_noticias;
	}

	public Long getGenero() {
		return genero;
	}

	public void setGenero(Long genero) {
		this.genero = genero;
	}

}
