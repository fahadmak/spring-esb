package edu.miu.intergration_sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class IntergrationSysApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(IntergrationSysApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
	}

}
