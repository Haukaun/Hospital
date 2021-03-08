package ntnu;

public class Patient extends Person implements Diagnosable {
    private String diagnosis;

    protected Patient(String firstName, String lastName, String personNumber){
        super(firstName, lastName, personNumber);
    }

    public String getDiagnosis(){
        return this.diagnosis;
    }

    public String toString(){
        return getFullName();
    }

    public void setDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }
}
