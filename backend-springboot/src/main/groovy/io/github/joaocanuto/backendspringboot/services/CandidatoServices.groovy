package io.github.joaocanuto.backendspringboot.services

import io.github.joaocanuto.backendspringboot.model.entity.Candidato
import io.github.joaocanuto.backendspringboot.respository.CandidatoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CandidatoServices {
    //Classe que acessa as repository, e trata as operações dentro do BD!

    private CandidatoRepository repository

    //Dizendo que eu quero injetar essa dependencia via construtor com o autowired;
    @Autowired
    CandidatoServices( CandidatoRepository repository ){
        this.repository = repository
    }

    public void salvarCandidato(Candidato candidato){
        validarCandidato(candidato)
        this.repository.persistir(candidato);
    }

    public void validarCandidato(Candidato candidato){
        //Aplica as validações!
    }

}
