package ntnu;

import java.util.*;


/**
 * Department class with different lists of different objeckts. Methods were you can set Department name and and add
 * Patients and Employees to the Person Hashmap.
 */
public class Department {
    private String departmentName;
    private HashMap<String, Person> persons;


    /**
     * Constructor
     * @param departmentName
     */
    public Department(String departmentName){
        this.departmentName = departmentName;
        this.persons = new HashMap<>();
    }

    /**
     * Sets the name of the Department.
     * @param departmentName
     */
    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    /**
     * Returns the name of the Department.
     * @return
     */
    public String getDepartmentName(){
        return departmentName;
    }

    /**
     * Creates a new Arraylist for all the Employees in the person hashmap, and returns the Arraylist.
     * @return Arraylist Employees returned.
     */
    public List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();

        persons.values().forEach((person) ->
                {
                    if (person instanceof Employee)
                    {
                        employees.add((Employee) person);
                    }
                }
                );
        return employees;
    }

    /**
     * Adds an Employee to the Person Hashmap.
     * @param employee
     */
    public void addEmployee(Employee employee) throws IllegalArgumentException{
        this.persons.put(employee.getPersonNumber(), employee);
    }

    /**
     * Creates a new Arraylist for all the Patients in the Person hashmap, and return the Arraylist.
     * @return Arraylist with Patients returned.
     */
    public List<Patient> getPatient(){
        List<Patient> patients = new ArrayList<>();

        this.persons.forEach((String, person) ->
                {
                    if(person instanceof Patient)
                    patients.add((Patient) person);
                }
        );

        return patients;
    }

    /**
     * Adds an Patient to Person Hashmap.
     * @param patient
     */
    public void addPatient(Patient patient) throws IllegalArgumentException{

        if (patient != null){
            this.persons.put(patient.getPersonNumber(), patient);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentName, that.departmentName) && Objects.equals(persons, that.persons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, persons);
    }


    /**
     * Removes a Person from the Hashmap if it contains personnumber.
     * @param person
     * @throws RemoveException
     */
    public void removePerson(Person person) throws RemoveException{

        if(persons.containsKey(person.getPersonNumber())){
            persons.remove(person.getPersonNumber());
        } else {
            throw new RemoveException("This person cant be Removed.");
        }
    }


    public String toString(){
        return getDepartmentName();
    }

}
