package com.docker.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.docker")
public class DockerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerProjectApplication.class, args);
	}

}
