package com.programmingfree.springservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan
@EnableJpaRepositories
@Import(MegaConfig.class)
@EnableAutoConfiguration
@PropertySource("application.properties")
public class Application {

	public static void main(String[] args) {
		System.out.println("QWEQWE");
		SpringApplication.run(Application.class, args);			
	}

	/*@Bean
	public ResourceProcessor<Resource<Category>> categoryProcessor() {
		return new ResourceProcessor<Resource<Category>>() {
			@Override public Resource<Category> process(Resource<Category> resource) {
				//resource.add(new Link("http://localhost:8080/people", "added-link"));
				*//*System.out.println(resource.getLinks());
				System.out.println(resource.getContent().getSubcategories());
				try {
					Collection<Subcategory> subcategories = resource.getContent().getSubcategories();
					for (Subcategory s : subcategories) {
						System.out.println(new ObjectMapper().writeValueAsString(s));
					}
				} catch (JsonProcessingException e) {
					System.out.println(e);
				}*//*
				//resource
				return resource;
			}
		};
	}*/
}