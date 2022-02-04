package com.idat.idatestudiante.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "modelo que representa los datos del estudiante.")
public class EstudianteDTO {
	
	@ApiModelProperty(name="id", required = true, example = "1", value="id del estudinate")
	private Integer idEstudiante;
	@ApiModelProperty(name="nombre", required = true, example = "rusvel", value="nombre del estudinate")
	private String nombreEstudiante;
	@ApiModelProperty(name="apellido", required = false, example = "puchoc", value="apellido del estudinate")
	private String apellidoEstudiante;
	
	public EstudianteDTO() {}
	
	public EstudianteDTO(Integer idEstudiante, String nombreEstudiante, String apellidoEstudiante) {
		super();
		this.idEstudiante = idEstudiante;
		this.nombreEstudiante = nombreEstudiante;
		this.apellidoEstudiante = apellidoEstudiante;
	}

	public Integer getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(Integer idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public String getApellidoEstudiante() {
		return apellidoEstudiante;
	}

	public void setApellidoEstudiante(String apellidoEstudiante) {
		this.apellidoEstudiante = apellidoEstudiante;
	}
	
	
	

}
