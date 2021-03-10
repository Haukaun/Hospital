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
        if (departmentName == null){
            departmentName = "";
        }

        if(departmentName.isBlank()){
            throw new IllegalArgumentException();
        }

        this.departmentName = departmentName;
        this.persons = new HashMap<>();
    }

    /**
     * Hashmap with all the persons added.
     * @return Map with keys and values.
     */
    public HashMap<String,Person> getPersonList(){
        return this.persons;
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

        this.persons.values().forEach((person) -> //loops through hashmap.
                {
                    if (person instanceof Employee)
                    {
                        employees.add((Employee) person); //adds all the Employees in hashmap to new arraylist
                    }
                }
                );
        //employees.sort(((o1, o2) -> o1.getPersonNumber().compareTo(o2.getPersonNumber())));

        return employees;
    }

    /**
     * Adds an Employee to the Person Hashmap.
     * @param employee The added object.
     */
    public void addEmployee(Employee employee) throws IllegalArgumentException{
        if(employee != null) {
            this.persons.put(employee.getPersonNumber(), employee);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Creates a new Arraylist for all the Patients in the Person hashmap, and return the Arraylist.
     * @return Arraylist with Patients returned.
     */
    public List<Patient> getPatient(){
        List<Patient> patients = new ArrayList<>();

        this.persons.values().forEach((person) ->
                {
                    if(person instanceof Patient)
                    patients.add((Patient) person);
                }
        );
        //patients.sort(((o1, o2) -> o1.getPersonNumber().compareTo(o2.getPersonNumber())));
        return patients;
    }

    /**
     * Adds an Patient to Person Hashmap.
     * @param patient Adds Person objekt
     */
    public void addPatient(Patient patient) throws IllegalArgumentException{

        if (patient != null){
            this.persons.put(patient.getPersonNumber(), patient);
        }else{
            throw new IllegalArgumentException();
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
     * @return
     */
    public void removePerson(Person person) throws RemoveException{

        if(persons.containsKey(person.getPersonNumber())){
            persons.remove(person.getPersonNumber());
        } else {
            throw new RemoveException("Person " + person.getFirstName() + " cant be removed from department. Person doesn´t exist.");
        }
    }

    /**
     * Returns a string representation of the object. In general, the toString method returns a string that "textually represents" this object.
     */
    public String toString(){
        return getDepartmentName();
    }

}
