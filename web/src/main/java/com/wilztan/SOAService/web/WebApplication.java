package com.wilztan.SOAService.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.wilztan.SOAService.repository.RepositoryApplication;
import com.wilztan.SOAService.service.ServiceApplication;

@SpringBootApplication()
//@SpringBootApplication(scanBasePackageClasses = ServiceApplication.class)
@EntityScan(basePackageClasses = RepositoryApplication.class)
@EnableJpaRepositories(basePackageClasses = RepositoryApplication.class)

public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
