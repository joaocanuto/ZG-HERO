package com.joaocanuto.application

class PersonPattern {
    int tipo // se o tipo = 0 empresa, se igual a 1: pessoa
    String name,email,estado,cep,descricao
    ArrayList<String> competencias



    @Override
    public String toString() {
        return "PersonPattern{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                ", descricao='" + descricao;
                //", competencias=" + competencias;
    }
}
