package io.github.joaocanuto.backendspringboot.model.entity

import groovy.transform.Canonical

@Canonical
class Candidato {
    private Integer id
    private String nome
    private String sobrenome
    private String data_nascimento
    private String email
    private String senha
    private String cpf
    private String pais
    private String cep
    private String descricao
    private List<Competencia> competencias = []

    Candidato(){}

    Candidato(String nome, String sobrenome, String data_nascimento, String email, String senha, String cpf, String pais, String cep, String descricao, List<Competencia> competencias) {
        this.nome = nome
        this.sobrenome = sobrenome
        this.data_nascimento = data_nascimento
        this.email = email
        this.senha = senha
        this.cpf = cpf
        this.pais = pais
        this.cep = cep
        this.descricao = descricao
        this.competencias = competencias
    }

    Candidato(Integer id, String nome, String sobrenome, String data_nascimento, String email, String senha, String cpf, String pais, String cep, String descricao, List<Competencia> competencias) {
        this.id = id
        this.nome = nome
        this.sobrenome = sobrenome
        this.data_nascimento = data_nascimento
        this.email = email
        this.senha = senha
        this.cpf = cpf
        this.pais = pais
        this.cep = cep
        this.descricao = descricao
        this.competencias = competencias
    }

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    String getNome() {
        return nome
    }

    void setNome(String nome) {
        this.nome = nome
    }

    String getSobrenome() {
        return sobrenome
    }

    void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome
    }

    String getData_nascimento() {
        return data_nascimento
    }

    void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento
    }

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    String getSenha() {
        return senha
    }

    void setSenha(String senha) {
        this.senha = senha
    }

    String getCpf() {
        return cpf
    }

    void setCpf(String cpf) {
        this.cpf = cpf
    }

    String getPais() {
        return pais
    }

    void setPais(String pais) {
        this.pais = pais
    }

    String getCep() {
        return cep
    }

    void setCep(String cep) {
        this.cep = cep
    }

    String getDescricao() {
        return descricao
    }

    void setDescricao(String descricao) {
        this.descricao = descricao
    }

    List<Competencia> getCompetencias() {
        return competencias
    }

    void setCompetencias(List<Competencia> competencias) {
        this.competencias = competencias
    }


    @Override
    public String toString() {
        return "Candidato: " +
                "id: " + id + '\n' +
                "nome: " + nome + '\n' +
                "sobrenome: " + sobrenome + '\n' +
                "data_nascimento: " + data_nascimento + '\n' +
                "email: " + email + '\n' +
                "senha: " + senha + '\n' +
                "cpf: " + cpf + '\n' +
                "pais: " + pais + '\n' +
                "cep: " + cep + '\n' +
                "descricao: " + descricao + '\n' +
                "competencias: "  + competencias +
                '\n-----------------------\n';
    }
}
