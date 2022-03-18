package com.joaocanuto.services


import com.joaocanuto.application.patterns.Company
import com.joaocanuto.application.patterns.Person;

interface IServicesFiles {
    String filePath
    void readFileData(ArrayList<Person> listOfPeople, ArrayList<Company> listOfCompany)
    void exportFileData(ArrayList<Person> listOfPeople, ArrayList<Company> listOfCompany)
}