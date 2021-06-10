package com.boxposting.springboot.app.backend.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Noticias {

	@Id
	private Long id_noticia;

	private String titulo_noticia;

	private String texto_noticia;

	private String imagen_noticia;

	@Column(name = "fecha_noticia")
	private Date fecha;

	@Column(name = "vistas_noticia")
	private Long vistas;

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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getVistas() {
		return vistas;
	}

	public void setVistas(Long vistas) {
		this.vistas = vistas;
	}

	public Long getGenero() {
		return genero;
	}

	public void setGenero(Long genero) {
		this.genero = genero;
	}

}
