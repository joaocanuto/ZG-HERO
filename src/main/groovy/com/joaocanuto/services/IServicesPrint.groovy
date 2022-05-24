package com.joaocanuto.services

import com.joaocanuto.application.patterns.Company
import com.joaocanuto.application.patterns.Person

interface IServicesPrint {
    //PrintMenu and InputServices
    int printMenu();
    int backMenu();

    Person personWasInserted();

    Company companyWasInserted();
    //Must be return the choice of a menu from user;
}