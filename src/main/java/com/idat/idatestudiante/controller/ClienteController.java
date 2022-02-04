package com.idat.idatestudiante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.idatestudiante.service.*;
import com.idat.idatestudiante.entity.*;
import com.idat.idatestudiante.repository.*;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService servicio;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Cliente>> listarCurso(){
		return new ResponseEntity<List<Cliente>>(servicio.listarCliente(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> cursoId(@PathVariable Integer id){
		return new ResponseEntity<Cliente>(servicio.obtenerClienteId(id), HttpStatus.OK);
	}
	
	@PostMapping("/grabar")
	public ResponseEntity<?> grabarCurso(@RequestBody Cliente estudiante){
		servicio.grabarCliente(estudiante);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<?> eliminarCurso(@PathVariable Integer id){
		Cliente curso = servicio.obtenerClienteId(id);
		if(curso != null) {
			servicio.eliminarCliente(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

	}
}
