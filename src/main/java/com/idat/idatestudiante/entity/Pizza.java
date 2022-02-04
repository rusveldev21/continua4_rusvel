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
@Table(name = "pizza")
public class Pizza implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -7801047680032758752L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPizza;
	
	private String nombrePizza;
	
	private String descripcion;
	
	@ManyToMany
	@JoinTable(name = "cliente_pizza",
	    joinColumns = @JoinColumn(name = "id_pizza"),
	    inverseJoinColumns = @JoinColumn(name = "id_cliente"))
	private List<Cliente> clientes;
	
	
	public int getIdPizza() {
		return idPizza;
	}

	public void setIdPizza(int idPizza) {
		this.idPizza = idPizza;
	}

	public String getNombrePizza() {
		return nombrePizza;
	}

	public void setNombrePizza(String nombrePizza) {
		this.nombrePizza = nombrePizza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


}