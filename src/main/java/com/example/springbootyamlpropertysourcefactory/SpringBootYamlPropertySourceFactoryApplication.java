package com.example.springbootyamlpropertysourcefactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootYamlPropertySourceFactoryApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootYamlPropertySourceFactoryApplication.class, args);
  }

  @Bean
  CommandLineRunner commandLineRunner(final HobbitNameProperties hobbitNameProperties) {
    return (String[] args) -> {
      hobbitNameProperties.getNames().stream().forEach(System.out::println);
    };
  }

}
