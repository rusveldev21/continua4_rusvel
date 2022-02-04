package com.idat.idatestudiante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatestudiante.service.*;
import com.idat.idatestudiante.entity.*;
import com.idat.idatestudiante.repository.*;


@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	ClienteRepository repositorio;
		
	
	@Override
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Cliente obtenerClienteId(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

	@Override
	public void grabarCliente(Cliente estudiante) {
		repositorio.save(estudiante);
		
	}

	@Override
	public void eliminarCliente(Integer id) {
		repositorio.deleteById(id);
		
	}

}
