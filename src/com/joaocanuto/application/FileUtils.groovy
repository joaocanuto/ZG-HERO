package com.joaocanuto.application

import java.lang.reflect.Array

class FileUtils {
    //Lendo do arquivo
    String filePath



    public void readFileData(def p = [],def c = [] ) throws  IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = null
            while((line = br.readLine()) != null){
                String [] data = line.split(",")
                if (data[0] == '1'){
                    def compet = []
                    for(int i=8; i < data.size();i++){
                        String aux = data[i]
                        compet << aux
                    }
                    Person temp = new Person(name:data[1], email: data[2],cpf: data[3],idade: Integer.parseInt(data[4]), estado: data[5], cep: data[6], descricao: data[7], competencias: compet)
                    temp.competencias.addAll(compet)
                    p << temp
                }
                else {
                    def compet = []
                    for(int i=8; i < data.size();i++){
                        String aux = data[i]
                        compet << aux
                    }
                    Company temp = new Company(name:data[1], email: data[2],cnpj: data[3],pais:data[4], estado: data[5], cep: data[6], descricao: data[7], competencias: compet)
                    temp.competencias.addAll(compet)
                    c << temp
                }
            }
        }
    }
}
