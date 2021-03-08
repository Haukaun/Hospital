package ntnu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {
    Department emergencyRoom = new Department("Akutten");

    @BeforeEach
    void setUp() {
        emergencyRoom.addEmployee(new Employee("Odd Even", "Primtallet", null));
        emergencyRoom.addEmployee(new Employee("Huppasahn", "DelFinito", null));
        emergencyRoom.addEmployee(new Nurse("Rigmor", "Mortis", null));
        emergencyRoom.addEmployee(new GeneralPractitioner("Inco", "Gnito", null));
        emergencyRoom.addEmployee(new Surgeon("Inco", "Gnito", null));
        emergencyRoom.addPatient(new Patient("Nina", "Teknologi", null));
        emergencyRoom.addPatient(new Patient("Ove", "Ralt", null));
    }

    @AfterEach
    void tearDown() {
            emergencyRoom.getEmployees().clear();
            emergencyRoom.getPatient().clear();
    }






}