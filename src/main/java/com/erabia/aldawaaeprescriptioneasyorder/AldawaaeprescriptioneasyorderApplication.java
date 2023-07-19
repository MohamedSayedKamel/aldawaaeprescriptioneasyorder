package com.erabia.aldawaaeprescriptioneasyorder;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AldawaaeprescriptioneasyorderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AldawaaeprescriptioneasyorderApplication.class, args);
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.erabia.aldawaaeprescriptioneasyorder")).build().apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfo("Aldawaa E-prescription Easy order Client Integration ", " backend api.", null, null, null, "Author : Mohamed Sayed Kamel", "  ",
				Collections.emptyList());
	}


}
