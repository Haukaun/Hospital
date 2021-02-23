package ntnu;

public class Employee extends Person {


    public Employee(String firstName, String lastName, String personNumber) {
        super(firstName, lastName, personNumber);
    }

    public String toString(){
        return getFullName();
    }
}
