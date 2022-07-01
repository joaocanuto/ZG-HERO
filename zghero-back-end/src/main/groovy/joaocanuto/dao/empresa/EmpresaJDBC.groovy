package joaocanuto.dao.empresa

import joaocanuto.model.Candidato
import joaocanuto.model.Empresa
import joaocanuto.services.ConnectionJDBC

import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException

class EmpresaJDBC implements EmpresaDAO {

    private Connection connection

    EmpresaJDBC(){
        connection = ConnectionJDBC.getConnectionBD()
    }

    @Override
    List<Empresa> listarEmpresas() {
        String sql = "SELECT * FROM empresas"
        List<Empresa> listaEmpresa = new ArrayList<>()
        try{
            PreparedStatement stmt = connection.prepareStatement(sql)
            ResultSet resultado = stmt.executeQuery()
            while(resultado.next()){
                Empresa empresa = new Empresa();
                empresa.setId(resultado.getInt("id"));
                empresa.setNome(resultado.getString("nome"))
                empresa.setEmail(resultado.getString("email"))
                empresa.setSenha(resultado.getString("senha"))
                empresa.setCnpj(resultado.getString("cnpj"))
                empresa.setPais(resultado.getString("pais"))
                empresa.setCep(resultado.getString("cep"))
                empresa.setDescricao(resultado.getString("descricao"))
                listaEmpresa.add(empresa)
            }
        } catch (SQLException ex){
            ex.printStackTrace()
        }
        return listaEmpresa
    }

    @Override
    boolean inserirEmpresa(Empresa emp) {
        return false
    }

    @Override
    boolean alterarEmpresa(Empresa emp, String cnpj) {
        return false
    }

    @Override
    boolean removerEmpresa(String cnpj) {
        return false
    }
}
