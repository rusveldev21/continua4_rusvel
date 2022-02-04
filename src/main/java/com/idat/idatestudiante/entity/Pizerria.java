package com.idat.idatestudiante.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pizerria")
public class Pizerria implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6253681098779742950L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPizerria;
	
	private String direccion;
	
	private String sede;
	
	@ManyToMany
	@JoinTable(name = "pizza_pizerria",
	    joinColumns = @JoinColumn(name = "id_pizerria"),
	    inverseJoinColumns = @JoinColumn(name = "id_pizza"))
	private List<Pizza> piza;
	
	public int getIdPizerria() {
		return idPizerria;
	}

	public void setIdPizerria(int idPizerria) {
		this.idPizerria = idPizerria;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}	

}
