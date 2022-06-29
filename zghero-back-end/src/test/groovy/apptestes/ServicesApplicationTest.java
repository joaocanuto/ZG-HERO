package apptestes;

import joaocanuto.application.patterns.Company;
import joaocanuto.application.patterns.Person;
import joaocanuto.services.IServicesPrint;
import joaocanuto.services.ServicesApplication;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class ServicesApplicationTest {
    @Test
    void insertPersonTest() {
        ArrayList<Person> listOfPeople = new ArrayList<>();
        ServicesApplication servicesApplication = new ServicesApplication();
        IServicesPrint servicesPrint = mock(IServicesPrint.class);

        Person expectedInsert = new Person();
        expectedInsert = servicesPrint.personWasInserted();
        servicesApplication.insertPerson(listOfPeople,expectedInsert);
        assertEquals(expectedInsert,listOfPeople.get(0));
    }

    @Test
    void insertCompanyTest() {
        ArrayList<Company> listOfCompanies = new ArrayList<>();
        ServicesApplication servicesApplication = new ServicesApplication();
        IServicesPrint servicesPrint = mock(IServicesPrint.class);

        Company expectedInsert = new Company();
        expectedInsert = servicesPrint.companyWasInserted();
        servicesApplication.insertCompany(listOfCompanies,expectedInsert);
        assertEquals(expectedInsert,listOfCompanies.get(0));
    }
}