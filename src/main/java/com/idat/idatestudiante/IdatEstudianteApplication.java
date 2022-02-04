package com.idat.idatestudiante;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

//agregamos por buena practica enableeruekaClient
@EnableEurekaClient
@SpringBootApplication
public class IdatEstudianteApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdatEstudianteApplication.class, args);
	}
	
	//Defines todos los detalles informativos que tendra tu api
	private ApiInfo apiInfo()
	{
		return new ApiInfoBuilder()
				.description(" la api de estudiantes interactua con los datos"
						+ "de cada estudiante : update, delate , read")
				.termsOfServiceUrl("http://rusvel.com")
				.contact(new Contact("rusvel puchoc", "http://rusvel.com", "rusvel@gmail.com"))
				.license("rusdev 2022")
				.version("1.0.0")
				.build();
	}
	 
	@Bean
	public Docket petApi() {
		
		
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("universidad-api")
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.idat.idatestudiante"))
				.paths(PathSelectors.any())
				.build()
				.tags(new Tag("Estudiante API", "mostrar todas las apis de los estudiantes"));
		
	}

}
