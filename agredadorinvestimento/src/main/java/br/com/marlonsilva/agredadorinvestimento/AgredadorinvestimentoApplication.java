package br.com.marlonsilva.agredadorinvestimento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.service.something","com.service.application"})
public class AgredadorinvestimentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgredadorinvestimentoApplication.class, args);
	}

}
