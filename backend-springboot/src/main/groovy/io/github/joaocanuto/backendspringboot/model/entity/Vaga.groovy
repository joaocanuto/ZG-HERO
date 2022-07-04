package io.github.joaocanuto.backendspringboot.model.entity

class Vaga {
    private Integer id
    private String nome
    private String descricao
    private String local
    private String empresas_id

    public vaga(){}

    Vaga(Integer id, String nome,
         String descricao, String local, String empresas_id) {
        this.id = id
        this.nome = nome
        this.descricao = descricao
        this.local = local
        this.empresas_id = empresas_id
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

    String getDescricao() {
        return descricao
    }

    void setDescricao(String descricao) {
        this.descricao = descricao
    }

    String getLocal() {
        return local
    }

    void setLocal(String local) {
        this.local = local
    }

    String getEmpresas_id() {
        return empresas_id
    }

    void setEmpresas_id(String empresas_id) {
        this.empresas_id = empresas_id
    }


    @Override
    public String toString() {
        return "Vaga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", local='" + local + '\'' +
                ", empresas_id='" + empresas_id + '\'' +
                '}';
    }
}
