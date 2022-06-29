package joaocanuto.services

import joaocanuto.application.patterns.Company
import joaocanuto.application.patterns.Person

interface IServicesPrint {
    //PrintMenu and InputServices
    int printMenu();
    int backMenu();

    Person personWasInserted();

    Company companyWasInserted();
    //Must be return the choice of a menu from user;
}