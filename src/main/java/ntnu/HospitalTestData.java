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

        try {
            Department emergencyRoom = new Department("Akutten");
            emergencyRoom.addEmployee(new Employee("OddEven", "Primtallet", "34"));
            emergencyRoom.addEmployee(new Employee("Huppasahn", "DelFinito", "342"));
            emergencyRoom.addEmployee(new Nurse("Rigmor", "Mortis", "234"));
            emergencyRoom.addEmployee(new GeneralPractitioner("Inco", "Gnito", "234"));
            emergencyRoom.addEmployee(new Surgeon("Inco", "Gnito", "324"));
            emergencyRoom.addPatient(new Patient("Nina", "Teknologi", "124"));
            emergencyRoom.addPatient(new Patient("Ove", "Ralt", "134234"));
            hospital.addDepartment(emergencyRoom);

        } catch (IllegalArgumentException e){
            System.out.println("An error occured printing one of the Departments. Check if you add persons correctly.");
        }



        try
        {
            Department childrensPolyclinic = new Department("Barne poliklinikk");
            childrensPolyclinic.addEmployee(new Employee("Salti", "Kaffen", null));
            childrensPolyclinic.addEmployee(new Employee("Nidel V.", "Elveflger", null));
            childrensPolyclinic.addEmployee(new Nurse("Anton", "Nym", null));
            childrensPolyclinic.addEmployee(new GeneralPractitioner("Gene", "Sis", null));
            childrensPolyclinic.addPatient(new Patient("Nanna", "Na", null));
            childrensPolyclinic.addPatient(new Patient("Nora", "Toriet", null));
            hospital.addDepartment(childrensPolyclinic);

        } catch (IllegalArgumentException e){
            System.out.println("An error occured printing one of the Departments. Check if you added persons correctly.");
        }



    }

    public static void main(String[] args) {
        Hospital hospital = new Hospital("AKERSHUS");

        fillRegisterWithTestData(hospital);

        System.out.println(hospital.getDepartments().get(0).getEmployees());

    }
}