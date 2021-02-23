package ntnu;

public abstract class Doctor extends Employee {

    protected Doctor(String firstName, String lastName, String personNumber){
        super(firstName, lastName, personNumber);

    }

    public abstract void setDiagnosis(Patient patient, String diagnosis);

}
