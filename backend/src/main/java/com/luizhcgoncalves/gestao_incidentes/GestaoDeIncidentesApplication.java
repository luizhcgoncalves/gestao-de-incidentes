package com.luizhcgoncalves.gestao_incidentes;

import com.luizhcgoncalves.gestao_incidentes.role.Role;
import com.luizhcgoncalves.gestao_incidentes.role.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaAuditing
@EnableAsync
public class GestaoDeIncidentesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoDeIncidentesApplication.class, args);
	}

    @Bean
    public CommandLineRunner runner(RoleRepository roleRepository) {
        return args -> {
            if(roleRepository.findByName("USER").isEmpty()) {
                roleRepository.save(new Role("USER"));
            }
        };
    }

}
