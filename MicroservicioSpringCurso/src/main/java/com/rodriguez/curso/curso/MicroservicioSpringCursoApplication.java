package com.rodriguez.curso.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.rodriguez.common.usuario.models.entity.*",
	"com.rodriguez.curso.models.entity.*"
})
@EnableJpaRepositories({"com.rodriguez.common.usuario.models.entity.*", "com.rodriguez.curso.models.entity.*"
	})
@EntityScan({"com.rodriguez.common.usuario.models.entity.*", "com.rodriguez.curso.models.entity.*"})
public class MicroservicioSpringCursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioSpringCursoApplication.class, args);
	}

}
