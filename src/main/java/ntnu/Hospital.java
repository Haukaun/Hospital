package ntnu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * The Hospital holds different departments filled with different employees and patients.
 */
public class Hospital {

    private final String hospitalName;
    private ArrayList<Department> departments;

    /**
     * Method where you create your Hospital name. Constructor.
     * @param hospitalName Name of Hospital.
     */
    public Hospital(String hospitalName){
        if(hospitalName == null){
            hospitalName = "";
        }

        if(hospitalName.isBlank()){
            throw new IllegalArgumentException("Hospital cant be blank or null.");
        }

        this.hospitalName = hospitalName.trim();
        this.departments = new ArrayList<>();
    }

    /**
     * Gets you the name of the Hospital.
     * @return
     */
    public String getHospitalName(){
        return hospitalName;
    }


    /**
     * Make new list of departments and returns it.
     * @return list of Departments
     */
    public List<Department> getDepartments(){
        List<Department> listDepartments = new ArrayList<>();
        this.departments.forEach(department ->
                {
                    listDepartments.add(department);
                });

                return listDepartments;
    }


    /**
     * Adds a Department to Hospital.
     * @param department
     */
    public void addDepartment(Department department){
        if(department != null){
        this.departments.add(department);
        }
    }

    /**
     * Returns a string representation of the object.
     * @return
     */
    public String toString(){
        return getHospitalName();
    }



}
