package joaocanuto.services


import joaocanuto.application.patterns.Company
import joaocanuto.application.patterns.Person

class ServicesApplication implements IServicesApplication{

    //Functions Services on App
    @Override
    void listCompanies(ArrayList<Company> listOfCompanies){
        println "Empresas:"
        listOfCompanies.each{ Company ->
            println " " + (listOfCompanies.indexOf(Company)+1) + ". " + Company
        }
    }
    @Override
    void listPeople(ArrayList<Person> listOfPeople){
        println "Candidatos:"
        listOfPeople.each{ Person ->
            println " " + (listOfPeople.indexOf(Person)+1) + ". " + Person
        }
    }
    @Override
    Person insertPerson(ArrayList<Person> listOfPeople,Person inserted){
        listOfPeople.add(inserted)
        return inserted;
    }
    @Override
    Company insertCompany(ArrayList<Company> listOfCompanies, Company inserted){
        listOfCompanies.add(inserted)
        return inserted;
    }
}
