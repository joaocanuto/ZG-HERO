package io.github.joaocanuto.backendspringboot

import groovyjarjarpicocli.CommandLine
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("development")
class MyConfiguration {


    @Bean
    public CommandLineRunner executar(){
        return (args) -> {
            println ("Rodando a configuração de Desenvolvimento")
        }
    }

    // Login no BD:

    @Bean(name = "userBD")
    public String userBD(){
        return "postgres"
    }
    @Bean(name = "passwordBD")
    public String passwordBD(){
        return "postgres"
    }
}
