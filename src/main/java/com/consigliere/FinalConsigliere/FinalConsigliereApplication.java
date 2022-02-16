package com.consigliere.FinalConsigliere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.consigliere")
@SpringBootApplication
public class FinalConsigliereApplication extends SpringBootServletInitializer  {
	
	@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			return application.sources(FinalConsigliereApplication.class);
		}


		public static void main(String[] args) {
			SpringApplication.run(FinalConsigliereApplication.class, args);
		
}
}