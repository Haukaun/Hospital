package ntnu;


/**
 * Class defines Employees from patients. Employees can either be docktor, nurse or GeneralPractitioner.
 */
public class Employee extends Person {


    public Employee(String firstName, String lastName, String personNumber) {
        super(firstName, lastName, personNumber);
    }

    /**
     * Returns a string representation of the object. In general, the toString method returns a string that "textually represents" this object.
     */
    public String toString(){
        return "Employee: "+ getFullName();
    }
}
