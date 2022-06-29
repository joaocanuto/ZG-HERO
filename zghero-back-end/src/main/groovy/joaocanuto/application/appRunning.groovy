package joaocanuto.application

import joaocanuto.application.patterns.Company
import joaocanuto.application.patterns.Person
import joaocanuto.services.ServicesApplication
import joaocanuto.services.ServicesFiles
import joaocanuto.services.ServicesPrint

ArrayList<Person> arraylistOfPeople = new ArrayList<>()
ArrayList<Company> arraylistOfCompanies = new ArrayList<>()

ServicesApplication servicesApplication = new ServicesApplication();
ServicesFiles servicesFiles = new ServicesFiles(filePath: "file.txt");
ServicesPrint servicesPrint = new ServicesPrint();

//FileUtils f = new FileUtils(filePath: "file.txt")
//f.readFileData(arraylistOfPeoplelistOfPeople,arraylistOfCompanies)
servicesFiles.readFileData(arraylistOfPeople,arraylistOfCompanies)

//Printando o menu
println "Bem vindo ao LinkeTinder!"
println "Uma união de Tinker mais Linkedin!"


int answer = servicesPrint.printMenu();

while(answer != 0){
    if(answer == 1) servicesApplication.listCompanies(arraylistOfCompanies);
    else if(answer == 2) servicesApplication.listPeople(arraylistOfPeople);
    else if (answer == 3) {
        servicesApplication.insertCompany(arraylistOfCompanies,servicesPrint.companyWasInserted())
    }
    else if(answer == 4){
        servicesApplication.insertPerson(arraylistOfPeople, servicesPrint.personWasInserted())
    }
    else if (answer == 5){
        servicesFiles.exportFileData(arraylistOfPeople, arraylistOfCompanies)
    }

    if(servicesPrint.backMenu() == 1){
        answer = servicesPrint.printMenu();
    } else {
        answer = 0;
    }
}


