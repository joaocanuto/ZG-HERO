package joaocanuto.dao.empresa

import joaocanuto.model.Candidato
import joaocanuto.model.Empresa

interface EmpresaDAO {

    // Implementação do CRUD

    public List<Empresa> listarEmpresas()
    public boolean inserirEmpresa(Empresa emp)
    public boolean alterarEmpresa(Empresa emp, String cnpj)
    public boolean removerEmpresa(String cnpj)

}