package ntnu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {
    Department emergencyRoom = new Department("Akutten");

    @BeforeEach
    void setUp() {
        emergencyRoom.addEmployee(new Employee("Odd Even", "Primtallet", "23423"));
        emergencyRoom.addEmployee(new Employee("Huppasahn", "DelFinito", "234234"));
        emergencyRoom.addEmployee(new Nurse("Rigmor", "Mortis", "23324"));
        emergencyRoom.addEmployee(new GeneralPractitioner("Inco", "Gnito", "234234"));
        emergencyRoom.addEmployee(new Surgeon("Inco", "Gnito", "12434"));
        emergencyRoom.addPatient(new Patient("Nina", "Teknologi", "123123"));
        emergencyRoom.addPatient(new Patient("Ove", "Ralt", "12314"));
    }

    @AfterEach
    void tearDown() {
            emergencyRoom.getPersonList().clear();
    }










}