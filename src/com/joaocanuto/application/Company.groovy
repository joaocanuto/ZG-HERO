package com.joaocanuto.application

class Company extends PersonPattern{
    String cnpj
    String pais

    @Override
    public String toString() {
        return  name  +
                "," + email  +
                "," + cnpj  +
                "," + pais  +
                "," + estado  +
                "," + cep  +
                "," + descricao  +
                "," + competencias;
    }
}
