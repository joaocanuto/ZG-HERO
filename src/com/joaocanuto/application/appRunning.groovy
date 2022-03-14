package com.joaocanuto.application

import java.lang.reflect.Array

ArrayList<Person> p = new ArrayList<>()
ArrayList<Company> c = new ArrayList<>()

FileUtils f = new FileUtils(filePath: "file.txt")
f.readFileData(p,c)


//Printando o menu
println "Bem vindo ao LinkeTinder!"
println "Uma união de Tinker mais Linkedin!"

int resposta = Utils.printarMenu();

while(resposta != 0){
    if(resposta == 1) Utils.listarEmpresas(c);
    else if(resposta == 2) Utils.listarDevs(p);

    if(Utils.voltarMenu() == 0){
        resposta = Utils.printarMenu()
    }
    else {
        resposta = 0
    }
}


