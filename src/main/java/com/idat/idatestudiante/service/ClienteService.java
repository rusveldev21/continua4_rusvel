package com.idat.idatestudiante.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.idat.idatestudiante.entity.*;


public interface ClienteService {
	List<Cliente> listarCliente();
	Cliente obtenerClienteId(Integer id);
	void grabarCliente(Cliente estudiante);
	void eliminarCliente(Integer id);
}
