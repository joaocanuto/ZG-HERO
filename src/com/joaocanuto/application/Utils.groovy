package com.joaocanuto.application

class Utils {


    static int printarMenu() {
        println ""
        println "O que deseja fazer ?"
        println "0 - Sair da Aplicação"
        println "1 - Listar as Empresa cadastradas!"
        println "2 - Listar os Devs cadastrados"

        Scanner input = new Scanner(System.in)
        int resposta = input.nextInt()
        if(resposta == 0){
            println "Encerrando a Aplicação!"
        }
        resposta
    }


    static void listarDevs(def d = []){
        println "Devs:"
        d.each{ devs ->
            println " " + devs
        }
    }

    static void listarEmpresas(def e = []){
        println "Empresas:"
        e.each{empresas ->
            println " " + empresas
        }
    }
    static int voltarMenu(){
        println ""
        println "0 - Voltar ao Menu Principal"
        println "1 - Sair da Aplicação"
        Scanner input = new Scanner(System.in);
        int resposta = input.nextInt();
        if(resposta == 1){
            System.out.println("Encerrando suas Tarefas!");
        }
        return resposta
    }

}
