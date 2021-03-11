package ntnu;

/**
 * Doctor is an abstract class for Surgeon and GeneralPractitioner, where these classes can set the diagnosis of an patient.
 */

public abstract class Doctor extends Employee {

    protected Doctor(String firstName, String lastName, String personNumber){
        super(firstName, lastName, personNumber);
    }


    /**
     * sets the Diagnosis of an patient
     * @param patient object
     * @param diagnosis text of which diagnosis
     */
    public abstract void setDiagnosis(Patient patient, String diagnosis);

}
