package joaocanuto.dao.candidato

import joaocanuto.model.Candidato
import joaocanuto.services.ConnectionJDBC

import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException
import java.util.logging.Logger

class CandidatoJDBC implements CandidatoDAO{

    private Connection connection

    CandidatoJDBC(){
        connection = ConnectionJDBC.getConnectionBD()
    }

    @Override
    List<Candidato> listarCandidatos() {
        String sql = "SELECT * FROM candidatos"
        List<Candidato> listaCandidatos = new ArrayList<>()
        try{
            PreparedStatement stmt = connection.prepareStatement(sql)
            ResultSet resultado = stmt.executeQuery()
            while(resultado.next()){
                Candidato candidato = new Candidato();
                candidato.setId(resultado.getInt("id"));
                candidato.setNome(resultado.getString("nome"))
                candidato.setSobrenome(resultado.getString("sobrenome"))
                candidato.setData_nascimento(resultado.getString("data_de_nascimento"))
                candidato.setEmail(resultado.getString("email"))
                candidato.setSenha(resultado.getString("senha"))
                candidato.setCpf(resultado.getString("cpf"))
                candidato.setPais(resultado.getString("pais"))
                candidato.setCep(resultado.getString("cep"))
                candidato.setDescricao(resultado.getString("descricao"))
                listaCandidatos.add(candidato)
            }
        } catch (SQLException ex){
            ex.printStackTrace()
        }
        return listaCandidatos
    }

    @Override
    boolean inserirCandidato(Candidato cnd) {
        String sql = "INSERT INTO candidatos(nome,sobrenome,data_de_nascimento,email,senha,cpf,pais,cep,descricao) VALUES (?,?,?,?,?,?,?,?,?)"
        try{
            PreparedStatement stmt = connection.prepareStatement(sql)
            stmt.setString(1, cnd.getNome())
            stmt.setString(2, cnd.getSobrenome())
            stmt.setString(3, cnd.getData_nascimento())
            stmt.setString(4, cnd.getEmail())
            stmt.setString(5, cnd.getSenha())
            stmt.setString(6, cnd.getCpf())
            stmt.setString(7, cnd.getPais())
            stmt.setString(8, cnd.getCep())
            stmt.setString(9, cnd.getDescricao())
            stmt.execute()
            return true
        } catch (SQLException ex){
            ex.printStackTrace()
            return false
        }
    }

    @Override
    boolean alterarCandidato(Candidato cnd, String cpf) {
        String sql = "UPDATE candidatos SET nome=?,sobrenome=?,data_de_nascimento=?,email=?,senha=?,cpf=?,pais=?,cep=?,descricao=? WHERE cpf=?"
        try{
            PreparedStatement stmt = connection.prepareStatement(sql)
            stmt.setString(1, cnd.getNome())
            stmt.setString(2, cnd.getSobrenome())
            stmt.setString(3, cnd.getData_nascimento())
            stmt.setString(4, cnd.getEmail())
            stmt.setString(5, cnd.getSenha())
            stmt.setString(6, cnd.getCpf())
            stmt.setString(7, cnd.getPais())
            stmt.setString(8, cnd.getCep())
            stmt.setString(9, cnd.getDescricao())
            stmt.setString(10, cnd.getCpf())
            stmt.execute()
            return true
        } catch (SQLException ex){
            ex.printStackTrace()
            return false
        }
    }

    @Override
    boolean removerCandidato(String cpf) {
        String sql = "DELETE FROM candidatos WHERE cpf=?"
        try{
            PreparedStatement stmt = connection.prepareStatement(sql)
            stmt.setString(1, cpf)
            stmt.execute()

        } catch(SQLException ex){
            ex.printStackTrace()
        }
        return false
    }



}
