package com.naptex.prep.springbootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public Docket swaggerConfigration(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.naptex.prep"))
				.build()
				.apiInfo(apiDetails());
	}

	public ApiInfo apiDetails(){
		return new ApiInfo(
				"Country Details",
				"Sample API",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("jayesh","https://github.com/jayeshd7/SwaggerSpringBootIntegration/blob/master/README.md","jayeshdalal7@gmail.com"),
				"API licence",
				"http://github.com",
				Collections.emptyList()
		);



	}
}


