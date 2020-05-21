package com.example.springboot;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import co.elastic.apm.attach.ElasticApmAttacher;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
        ElasticApmAttacher.attach();
		SpringApplication.run(Application.class, args);
	}

}
