package com.jpaTask.ojol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class OjolApplication {

	public static void main(String[] args) {
		SpringApplication.run(OjolApplication.class, args);
	}

}

