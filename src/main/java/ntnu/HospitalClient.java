package ntnu;

import java.util.Scanner;

public class HospitalClient {

    private static Hospital hospital;
    private static Department department;


    /**
     * Fills the Departments with Test data and initializes one of the departments.
     */
    public static void init(){
        hospital = new Hospital("Akershus");

        try{

            HospitalTestData.fillRegisterWithTestData(hospital);

        } catch (IllegalArgumentException e){

            System.out.println("An error occured printing one of the Departments. Check if you added persons correctly.");

        }
        department = hospital.getDepartments().get(0);
    }


    /**
     * Successfully Tries to remove person from the first department.
     */
    public static void removePersonValid(){

        try{
            System.out.println("Person:  "+ department.getEmployees().get(0) + " has been removed.");
            department.removePerson(department.getEmployees().get(0));
            System.out.println(hospital.getDepartments().get(0).getPersonList().values());
        } catch (RemoveException e){
            e.printStackTrace();
        }
    }


    /**
     * Tries to remove persons from department that doesn't exist.
     */
    public static void removePersonInvalid() throws RemoveException {

        Patient patient = new Patient("Håkon", "Sætre", "310799");

        try{
            department.removePerson(patient);
        } catch (RemoveException e) {
            System.out.println("---------------------------");
            System.out.println("Trying to remove a person that dont exist in Department: ");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Method that prints out List of persons And removes person from removePersonValid method.
     */
    public static void start(){
        System.out.println("----------------------------");
        System.out.println(hospital.getDepartments());
        System.out.println("----------------------------");
        System.out.println("Entering Akutten and printing all of the Persons in Department");
        System.out.println("----------------------------");
        System.out.println(hospital.getDepartments().get(0).getPersonList().values());
        System.out.println("----------------------------");
        System.out.println("Removing person.");
        removePersonValid();
    }

    /**
     * Starts the applications, 3 methods.
     * @param args
     * @throws RemoveException
     */
    public static void main(String[] args) throws RemoveException {
        init();
        start();
        removePersonInvalid();
    }
}
