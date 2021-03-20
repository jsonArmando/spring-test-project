package com.test.davivienda.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registro")
public class Registro implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numeroCalle;
	private String nombreCalle;
	private String ciudad;
	private String departamento;
	private Long codigoPostal;
	private Long perfil;
	private Long tipoDireccion;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumeroCalle() {
		return numeroCalle;
	}
	public void setNumeroCalle(String numeroCalle) {
		this.numeroCalle = numeroCalle;
	}
	public String getNombreCalle() {
		return nombreCalle;
	}
	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Long getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(Long codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public Long getPerfil() {
		return perfil;
	}
	public void setPerfil(Long perfil) {
		this.perfil = perfil;
	}
	public Long getTipoDireccion() {
		return tipoDireccion;
	}
	public void setTipoDireccion(Long tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
	}
	
	
}
