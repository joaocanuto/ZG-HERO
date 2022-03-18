package com.joaocanuto.application.patterns

class Person extends PersonPattern{
    String cpf
    int idade


    @Override
    public String toString() {
        return  tipo +
                "," + name +
                "," + email  +
                "," + cpf  +
                "," + idade  +
                "," + estado  +
                "," + cep  +
                "," + descricao  +
                "," + competencias;

    }
}
