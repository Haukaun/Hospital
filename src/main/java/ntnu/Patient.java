package ntnu;

/**
 * Defines Patients, You can get diagnosis from patients and set diagnosis for patients.
 */
public class Patient extends Person implements Diagnosable {
    private String diagnosis;

    protected Patient(String firstName, String lastName, String personNumber){
        super(firstName, lastName, personNumber);
    }

    /**
     * get you the diagnosis of an patient.
     * @return
     */
    public String getDiagnosis(){
        return this.diagnosis;
    }

    /**
     * Returns a string representation of the object.
     * @return
     */
    public String toString(){
        return "Patient: "+ getFullName();
    }

    public void setDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }
}
