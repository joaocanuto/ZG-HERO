package com.joaocanuto.services

import com.joaocanuto.application.patterns.Company
import com.joaocanuto.application.patterns.Person

class ServicesPrint implements IServicesPrint{
    //Input and Print Services
    @Override
    int printMenu(){
        println ""
        println "O que deseja fazer ?"
        println "1 - Listar as Empresa cadastradas!"
        println "2 - Listar os Devs cadastrados"
        println "3 - Inserir novas Empresas"
        println "4 - Inserir novos Candidados"
        println "5 - Salvar suas modificações"
        println "0 - Sair da Aplicação"

        Scanner input = new Scanner(System.in)
        int answer = input.nextInt();
        if(answer == 0){
            println "Encerrando a aplicação!"
        }

        return answer;
    }
    @Override
    int backMenu(){
        println ""
        println "1 - Voltar ao Menu Principal"
        println "0 - Sair da Aplicação"
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if(answer == 1){
            System.out.println("Encerrando suas Tarefas!");
        }
        return answer;
    }
    @Override
    Person personWasInserted(){
        Person answer = new Person();
        String bufferForAswers;
        Scanner input = new Scanner(System.in)
        println "Qual o nome do candidato que você deseja adcionar: "
        answer.name = input.nextLine()
        println "QuaL o seu cpf: "
        answer.cpf = input.nextLine()
        println "Qual sua idade: "
        answer.idade = input.nextInt()

        bufferForAswers = input.nextLine()

        println "Qual o estado dele: "
        answer.estado = input.nextLine()
        println "Qual seu CEP: "
        answer.cep = input.nextLine()
        println "Como ele descreve seu perfil ?"
        answer.descricao = input.nextLine()
        println "Quais são as competencias dele ?"
        println "Aqui digite da seguinte forma : "
        println "Ex: Python,Java,Ruby,Groovy"
        println "Com cada competencia separada por ',' e sem espaços durante a separação "
        answer.competencias = input.nextLine()

        return answer;
    }
    @Override
    Company companyWasInserted(){
        Company answer = new Company();
        Scanner input = new Scanner(System.in)
        println "Qual o nome da empresa que você deseja adcionar: "
        answer.name = input.nextLine()
        println "Qual o seu cnpj: "
        answer.cnpj = input.nextLine()
        println "Qual seu pais: "
        answer.pais = input.nextLine()
        println "Qual seu estado: "
        answer.estado = input.nextLine()
        println "Qual seu CEP: "
        answer.cep = input.nextLine()
        println "Como ele descreve seu recrutamento ?"
        answer.descricao = input.nextLine()
        println "Quais são as competencias que ela busca em um Candidato ?"
        println "Aqui digite da seguinte forma : "
        println "Ex: Python,Java,Ruby,Groovy"
        println "Com cada competencia separada por ',' e sem espaços durante a separação "
        answer.competencias = input.nextLine()
        return answer;
    }

}
