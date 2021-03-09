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
        department = hospital.getDepartments().get(0);


        try{

            HospitalTestData.fillRegisterWithTestData(hospital);

        } catch (IllegalArgumentException e){

            System.out.println("An error occured printing one of the Departments. Check if you added persons correctly.");

        }
    }


    /**
     * Successfully Tries to remove person from the first department.
     */
    public static void removePersonValid(){

        try{
        department.removePerson(department.getEmployees().get(0));
            System.out.println("Person:  "+ department.getEmployees().get(0) + " has been removed.");
        } catch (RemoveException e){
            e.printStackTrace();
        }
    }


    /**
     * Tries to remove persons from department that doesn't exist.
     */
    public static void removePersonInvalid() throws RemoveException {

        Employee employee = new Employee("Håkon", "Sætre", "310799");

        try{
            department.removePerson(employee);
        } catch (RemoveException e) {
            e.printStackTrace();
        }
    }


    /**
     * Starts the applications, 3 methods.
     * @param args
     * @throws RemoveException
     */
    public static void main(String[] args) throws RemoveException {
        init();
        removePersonValid();
        removePersonInvalid();
    }
}
