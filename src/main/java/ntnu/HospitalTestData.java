package ntnu;


public class HospitalTestData {

    /**
     * Fills the hospital provided as a parameter with
     * departments and some employees and patients.
     *
     * @param hospital the hospital to be populated with testdata
     */
    public static void fillRegisterWithTestData(final Hospital hospital) {

        // Add some departments


            Department emergencyRoom = new Department("Akutten");
            emergencyRoom.addEmployee(new Employee("OddEven", "Primtallet", "34"));
            emergencyRoom.addEmployee(new Employee("Huppasahn", "DelFinito", "342"));
            emergencyRoom.addEmployee(new Nurse("Rigmor", "Mortis", "234"));
            emergencyRoom.addEmployee(new GeneralPractitioner("Inco", "Gnito", "234"));
            emergencyRoom.addEmployee(new Surgeon("Inco", "Gnito", "324"));
            emergencyRoom.addPatient(new Patient("Nina", "Teknologi", "124"));
            emergencyRoom.addPatient(new Patient("Ove", "Ralt", "134234"));
            hospital.addDepartment(emergencyRoom);

            Department childrensPolyclinic = new Department("Barne poliklinikk");
            childrensPolyclinic.addEmployee(new Employee("Salti", "Kaffen", "52345"));
            childrensPolyclinic.addEmployee(new Employee("Nidel V.", "Elveflger", "34234"));
            childrensPolyclinic.addEmployee(new Nurse("Anton", "Nym", "123445"));
            childrensPolyclinic.addEmployee(new GeneralPractitioner("Gene", "Sis", "12344"));
            childrensPolyclinic.addPatient(new Patient("Nanna", "Na", "124234"));
            childrensPolyclinic.addPatient(new Patient("Nora", "Toriet", "1234"));
            hospital.addDepartment(childrensPolyclinic);

    }

}