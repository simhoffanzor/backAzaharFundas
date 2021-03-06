package com.ar.azaharfundas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AzaharfundasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzaharfundasApplication.class, args);
	}
        
        @Bean
        public WebMvcConfigurer corsConfigurer(){
            return new WebMvcConfigurer(){
                @Override
                public void addCorsMappings(CorsRegistry registry){
                    registry.addMapping("/**").allowedOrigins("https://azahar-fundas.firebaseapp.com/").allowedHeaders("*").allowedMethods("*");
                    
                }
            };
        }

}
