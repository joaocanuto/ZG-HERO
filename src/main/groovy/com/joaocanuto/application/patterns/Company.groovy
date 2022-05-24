package com.joaocanuto.application.patterns

class Company extends PersonPattern{
    String cnpj
    String pais

    @Override
    public String toString() {
        return  tipo +
                "," + name  +
                "," + email  +
                "," + cnpj  +
                "," + pais  +
                "," + estado  +
                "," + cep  +
                "," + descricao  +
                "," + competencias;
    }
}
