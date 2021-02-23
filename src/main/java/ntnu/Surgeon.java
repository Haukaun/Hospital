package ntnu;

public class Surgeon extends Doctor{

    public Surgeon(String firstName, String lastName, String personNumber){
        super(firstName, lastName, personNumber);
    }

    public void setDiagnosis(Patient patient, String diagnosis){
        patient.setDiagnosis(diagnosis);
    }
}
