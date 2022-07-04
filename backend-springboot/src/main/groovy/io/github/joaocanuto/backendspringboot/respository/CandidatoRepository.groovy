package io.github.joaocanuto.backendspringboot.respository

import io.github.joaocanuto.backendspringboot.model.entity.Candidato
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.stereotype.Repository

import java.sql.ResultSet
import java.sql.SQLException

@Repository
class CandidatoRepository {
    // Gera as conexeos com a Tabela de candidatos

    private static String INSERT = "INSERT INTO candidatos(nome,sobrenome,data_de_nascimento,email,senha,cpf,pais,cep,descricao) VALUES (?,?,?,?,?,?,?,?,?)";
    private static String SELECT_ALL = "SELECT * FROM candidatos "

    @Autowired
    private JdbcTemplate jdbcTemplate;

    Candidato persistir(Candidato cnd){
        jdbcTemplate.update(INSERT, new Object[]{
                cnd.getNome(),
                cnd.getSobrenome(),
                cnd.getData_nascimento(),
                cnd.getEmail(),
                cnd.getSenha(),
                cnd.getCpf(),
                cnd.getPais(),
                cnd.getCep(),
                cnd.getDescricao()
        })
        return cnd
    }

    List<Candidato> listarCandidatos(){
        return jdbcTemplate.query(SELECT_ALL, new RowMapper<Candidato>() {
            @Override
            Candidato mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Candidato(rs.getInt("id"),rs.getString("nome"), rs.getString("sobrenome"), rs.getString("data_de_nascimento"), rs.getString("email"), rs.getString("senha"), rs.getString("cpf"), rs.getString("pais"), rs.getString("cep"), rs.getString("descricao"),null)
            }
        })
    }
}
