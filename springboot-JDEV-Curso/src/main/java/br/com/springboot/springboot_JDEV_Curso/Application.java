package br.com.springboot.springboot_JDEV_Curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 *
 * Spring Boot application starter class  
 */
//@ComponentScan(basePackages = {"br.com.springboot_JDEV_Curso.repository"})
@EntityScan(basePackages = "br.com.springboot_JDEV_Curso.model")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); //Linha principal que roda o projeto SpringBoot
    }
}
