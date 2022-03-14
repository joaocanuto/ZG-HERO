package com.joaocanuto.application

class Person extends PersonPattern{
    String cpf
    int idade


    @Override
    public String toString() {
        return  name  +
                "," + email  +
                "," + cpf  +
                "," + idade  +
                "," + estado  +
                "," + cep  +
                "," + descricao  +
                "," + competencias;
    }
}
