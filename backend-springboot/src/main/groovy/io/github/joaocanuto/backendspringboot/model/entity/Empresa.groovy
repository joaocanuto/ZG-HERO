package io.github.joaocanuto.backendspringboot.model.entity

class Empresa {
    private Integer id
    private String nome
    private String email
    private String senha
    private String cnpj
    private String pais
    private String cep
    private String descricao
    private ArrayList<Competencia> competencias = []

    Empresa(){}

    Empresa(String nome, String email, String senha, String cnpj, String pais, String cep, String descricao, ArrayList<Competencia> competencias) {
        this.nome = nome
        this.email = email
        this.senha = senha
        this.cnpj = cnpj
        this.pais = pais
        this.cep = cep
        this.descricao = descricao
        this.competencias = competencias
    }

    Empresa(Integer id, String nome, String email, String senha,
            String cnpj, String pais, String cep, String descricao, ArrayList<Competencia> competencias) {
        this.id = id
        this.nome = nome
        this.email = email
        this.senha = senha
        this.cnpj = cnpj
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

    String getCnpj() {
        return cnpj
    }

    void setCnpj(String cnpj) {
        this.cnpj = cnpj
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

    ArrayList<Competencia> getCompetencias() {
        return competencias
    }

    void setCompetencias(ArrayList<Competencia> competencias) {
        this.competencias = competencias
    }

    @Override
    public String toString() {
        return "Candidato: " +
                "id: " + id + '\n' +
                "nome: " + nome + '\n' +
                "email: " + email + '\n' +
                "senha: " + senha + '\n' +
                "cnpj: " + cnpj + '\n' +
                "pais: " + pais + '\n' +
                "cep: " + cep + '\n' +
                "descricao: " + descricao + '\n' +
                "competencias: " + competencias +
                '\n-----------------------\n';
    }
}
