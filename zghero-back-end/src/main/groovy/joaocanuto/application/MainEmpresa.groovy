package joaocanuto.application

import joaocanuto.dao.candidato.CandidatoDAO
import joaocanuto.dao.candidato.CandidatoJDBC
import joaocanuto.dao.empresa.EmpresaDAO
import joaocanuto.dao.empresa.EmpresaJDBC
import joaocanuto.model.Candidato
import joaocanuto.model.Empresa

import java.sql.SQLException

class MainEmpresa {
    static void main(String [] args) throws SQLException, ClassNotFoundException {
        //Listagem
        listar()

        // Inserindo
        Empresa emp = new Empresa()
        //inserir(cand)

        //Update
        //Empresa empNova = new Empresa()
        //Candidato novoCand = new Candidato("Broken", "Pereira", "1999-11-17", "brkn@gmail.com", "1234567", "123.456.789-99","Brasil","42345-67","Estudante de Comp", null)
        //alterar(novoCand, "222.222.222-22")

        //Remover
        //remover("222.222.222-22")
    }

    def static listar(){
        EmpresaDAO empresaDAO = new EmpresaJDBC()
        println empresaDAO.listarEmpresas()
    }

    def static inserir(Empresa emp){
        EmpresaDAO empresaDAO = new EmpresaJDBC()
        empresaDAO.inserirEmpresa(emp)
    }
    def static alterar(Empresa emp, String cnpj){
        EmpresaDAO empresaDAO = new EmpresaJDBC()
        empresaDAO.alterarEmpresa(emp, cnpj)
    }
    def static remover(String cnpj){
        EmpresaDAO empresaDAO = new EmpresaJDBC()
        empresaDAO.removerEmpresa(cnpj)
    }

}
