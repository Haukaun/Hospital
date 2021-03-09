package ntnu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hospital {

    private final String hospitalName;
    private ArrayList<Department> departments;


    public Hospital(String hospitalName){
        this.hospitalName = hospitalName;
        this.departments = new ArrayList<>();
    }

    public String getHospitalName(){
        return hospitalName;
    }


    public List<Department> getDepartments(){
        List<Department> listDepartments = new ArrayList<>();
        this.departments.forEach(department ->
                {
                    listDepartments.add(department);
                });

                return listDepartments;
    }



    public void addDepartment(Department department){
        if(department != null){
        this.departments.add(department);
        }
    }

    public String toString(){
        return getHospitalName();
    }



}
