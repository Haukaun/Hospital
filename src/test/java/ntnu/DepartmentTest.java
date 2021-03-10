package ntnu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {
    Department emergencyRoom = new Department("Akutten");

    @BeforeEach
    /**
     * Adds information used for testing.
     */
    void setUp() {
        emergencyRoom.addEmployee(new Employee("OddEven", "Primtallet", "34"));
        emergencyRoom.addEmployee(new Employee("Huppasahn", "DelFinito", "342"));
        emergencyRoom.addEmployee(new Nurse("Rigmor", "Mortis", "234"));
        emergencyRoom.addEmployee(new GeneralPractitioner("Inco", "Gnito", "234"));
        emergencyRoom.addEmployee(new Surgeon("Inco", "Gnito", "324"));
        emergencyRoom.addPatient(new Patient("Nina", "Teknologi", "124"));
        emergencyRoom.addPatient(new Patient("Ove", "Ralt", "65644"));
    }

    @AfterEach
    /**
     * Clears hashmap when testing is finished.
     */
    void tearDown() {
            emergencyRoom.getPersonList().clear();
    }

    @Test
    @DisplayName("Test to remove persons from hashmap.")
    void testRemovePersonHashMap() throws RemoveException {
        Patient patient = emergencyRoom.getPatient().get(0);

        emergencyRoom.removePerson(patient);

        assertEquals(false, emergencyRoom.getPersonList().containsValue(patient));

    }

    @Test
    @DisplayName("Test if we can remove an person that dont exist in hashmap.")
    void testRemoveInvalidPerson() throws RemoveException {
        Employee employee = new Employee("Håkon", "Sætre", "310799");

        try{
            emergencyRoom.removePerson(employee);
        } catch (RemoveException e){
            assertEquals("Person " + employee.getFirstName() + " cant be removed from department. Person doesn´t exist.", e.getMessage());
        }

    }

}