package joaocanuto.dao.candidato

import joaocanuto.model.Candidato

interface CandidatoDAO {


    // Implementação do CRUD

    public List<Candidato> listarCandidatos()
    public boolean inserirCandidato(Candidato cnd)
    public boolean alterarCandidato(Candidato cnd, String cpf)
    public boolean removerCandidato(String cpf)

}