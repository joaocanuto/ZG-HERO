package joaocanuto.application

import joaocanuto.dao.candidato.CandidatoDAO
import joaocanuto.dao.candidato.CandidatoJDBC
import joaocanuto.model.Candidato

import java.sql.SQLException

class MainCandidato {
     static void main(String [] args) throws SQLException, ClassNotFoundException {

        //Listagem
        listar()

        // Inserindo
        Candidato cand = new Candidato("Lopes", "Pereira", "1999-11-17", "lps@gmail.com", "1234567", "222.222.222-22","Brasil","42345-67","Estudante de Comp", null)
        //inserir(cand)

        //Update
        Candidato novoCand = new Candidato("Broken", "Pereira", "1999-11-17", "brkn@gmail.com", "1234567", "123.456.789-99","Brasil","42345-67","Estudante de Comp", null)
        //alterar(novoCand, "222.222.222-22")

        //Remover
        //remover("222.222.222-22")
    }

    def static listar(){
        CandidatoDAO candidatoDAO = new CandidatoJDBC()
        println candidatoDAO.listarCandidatos()
    }

    def static inserir(Candidato cnd){
        CandidatoDAO candidatoDAO = new CandidatoJDBC()
        candidatoDAO.inserirCandidato(cnd)
    }
    def static alterar(Candidato cnd, String cpf){
        CandidatoDAO candidatoDAO = new CandidatoJDBC()
        candidatoDAO.alterarCandidato(cnd, cpf)
    }
    def static remover(String cpf){
        CandidatoDAO candidatoDAO = new CandidatoJDBC()
        candidatoDAO.removerCandidato(cpf)
    }
}
