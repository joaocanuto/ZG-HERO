package io.github.joaocanuto.backendspringboot.model.entity

class Competencia {
    private Integer id
    private String nome

    Competencia(){
    }
    Competencia(String nome){
        this.nome
    }
    Competencia(Integer id, String nome) {
        this.id = id
        this.nome = nome
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


    @Override
    public String toString() {
        return "Competencias: " +
                "id: " + id + '\n'
                "nome: " + nome + '\n'
    }
}
