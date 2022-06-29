package joaocanuto.services;

import joaocanuto.application.patterns.Company;
import joaocanuto.application.patterns.Person;

import java.util.ArrayList;

public interface IServicesApplication {

    void listCompanies(ArrayList<Company> listOfCompanies);
    void listPeople(ArrayList<Person> listOfPeople);

    Person insertPerson(ArrayList<Person> listOfPeople, Person personWasInsered);
    //Must be return the insered person;
    Company insertCompany(ArrayList<Company> listOfCompanies, Company companyWasInserted);
    //Must be return the insered company;

}
