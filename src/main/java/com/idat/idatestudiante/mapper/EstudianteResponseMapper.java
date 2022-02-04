package com.idat.idatestudiante.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import com.idat.idatestudiante.dto.EstudianteDTO;
import com.idat.idatestudiante.entity.Estudiante;

//mapper response para listar el DTO - ResponseMapper - RequestMapper

@Mapper(componentModel = "spring")
public interface EstudianteResponseMapper {
   
	//concepto de mappers
	@Mappings(value = {
			@Mapping(source = "id",target = "idEstudiante"),
			@Mapping(source = "nombre",target = "nombreEstudiante"),
			@Mapping(source = "apellido",target = "apellidoEstudiante")
	})
	EstudianteDTO estudianteDTO(Estudiante estudinate);
	
	List<EstudianteDTO> listarEStudinateDTO(List<Estudiante> estudinate);
}
