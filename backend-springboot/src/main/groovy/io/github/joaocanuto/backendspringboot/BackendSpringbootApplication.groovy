package io.github.joaocanuto.backendspringboot

import io.github.joaocanuto.backendspringboot.model.entity.Candidato
import io.github.joaocanuto.backendspringboot.respository.CandidatoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class BackendSpringbootApplication {

//	@Autowired
//	@Qualifier("applicationName")
	@Value("\${application.name}")
	private String applicationName

	@GetMapping("/hello")
	public String helloWorld(){
		return applicationName
	}

	@Bean
	public CommandLineRunner init(@Autowired CandidatoRepository candidatoRepository){
		return (args) -> {
//			Candidato cand = new Candidato("Lapiseira", "Pereira", "1999-11-17", "lps@gmail.com", "1234567", "222.222.222-22","Brasil","42345-67","Estudante de Comp", null)
//			candidatoRepository.persistir(cand)

			List<Candidato> listaDeCandidatos = candidatoRepository.listarCandidatos()
			listaDeCandidatos.forEach(System.out::println)
		}
	}

	static void main(String[] args) {
		SpringApplication.run(BackendSpringbootApplication, args)
	}

}
