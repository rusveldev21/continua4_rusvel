package com.idat.idatestudiante.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import com.idat.idatestudiante.dto.EstudianteDTO;
import com.idat.idatestudiante.entity.Estudiante;

@Mapper(componentModel = "spring")//llenar un estudiante
public interface EstudinateRequestMapper {
	
	@Mappings(value = {
			@Mapping(source = "idEstudiante",target = "id"),
			@Mapping(source = "nombreEstudiante",target = "nombre"),
			@Mapping(source = "apellidoEstudiante",target = "apellido")
	})
	Estudiante estudiante(EstudianteDTO dto);

}
