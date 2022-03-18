package com.joaocanuto.services

import com.joaocanuto.application.patterns.Company
import com.joaocanuto.application.patterns.Person

class ServicesFiles implements IServicesFiles {
    String filePath = null;
    String header = null;

    @Override
    void readFileData(ArrayList<Person> listOfPeople, ArrayList<Company> listOfCompanies) throws  IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = null
            header = br.readLine();
            int totalOfFeatures = 8; // Define a quantidade de características que cada objeto tem.
            while((line = br.readLine()) != null){

                String [] data = line.split(",")
                if (data[0] == '1'){
                    String competencias = data[8];
                    competencias += ",";
                    for(int i=totalOfFeatures + 1; i < data.size();i++){
                        competencias += data[i];
                        if(i != data.size() - 1) competencias += ",";
                    }
                    Person temp = new Person(tipo:data[0],name:data[1], email: data[2],cpf: data[3],idade: Integer.parseInt(data[4]), estado: data[5], cep: data[6], descricao: data[7], competencias: competencias)
                    listOfPeople << temp
                }
                else {
                    String competencias = data[8];
                    competencias += ",";
                    for(int i=totalOfFeatures; i < data.size();i++){
                        competencias += data[i];
                        if(i != data.size() - 1) competencias += ",";
                    }
                    Company temp = new Company(tipo: data[0],name:data[1], email: data[2],cnpj: data[3],pais:data[4], estado: data[5], cep: data[6], descricao: data[7], competencias: competencias)
                    listOfCompanies << temp
                }
            }
        }
    }
    @Override
    void exportFileData(ArrayList<Person> listOfPeople, ArrayList<Company> listOfCompanies){
        def allLists = []
        allLists.addAll(listOfPeople)
        allLists.addAll(listOfCompanies)
        ServicesFiles servicesFiles = new ServicesFiles(filePath: "file.txt");
        File file = new File ("file.txt");
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado! Criamos um! Rode o programa novamente :)");
            //file.getParentFile().mkdirs();
        }
        printWriter.println(header)
        allLists.each { allItems ->
            printWriter.println(allItems);
        }
        printWriter.close ();
    }

}
