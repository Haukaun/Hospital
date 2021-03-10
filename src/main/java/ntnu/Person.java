package ntnu;

import java.util.Comparator;

/**
 * Abstract class with the information to every person added.
 */
public abstract class Person{

    private String firstName;
    private String LastName;
    private String socialSecurityNumber;

    public Person (String firstName, String lastName, String socialSecurityNumber) throws  IllegalArgumentException{

            if(firstName == null){
                firstName = "";
            }
            if(lastName == null){
                lastName = "";
            }
            if(socialSecurityNumber == null){
                socialSecurityNumber = "";
            }

            if(firstName.isBlank() || lastName.isBlank() || socialSecurityNumber.isBlank()){
               throw new IllegalArgumentException("Firstname, lastname or personnumber cant be null.");
            }

            this.firstName = firstName.trim();
            this.LastName = lastName.trim();
            this.socialSecurityNumber = socialSecurityNumber.trim();

    }

    /**
     * Gives you the perosnnumber of an person.
     * @return
     */
    public String getPersonNumber(){
        return this.socialSecurityNumber;
    }

    /**
     * Sets the personnumber of an person.
     * @param personNumber
     */
    public void setPersonNumber(String personNumber){
        this.socialSecurityNumber = personNumber;
    }

    /**
     * Sets the firstname of an person.
     * @param firstName
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
     * Sets the lastname of an person.
     * @param lastName
     */
    public void setLastName(String lastName){
        this.LastName = lastName;
    }

    /**
     * Gets the lastname of an added person.
     * @return
     */
    public String getLastName(){
        return this.LastName;
    }

    /**
     * Gets the firstname of an added person.
     * @return
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * Gets the fullname of an added person.
     * @return
     */
    public String getFullName(){
        return firstName+" "+LastName+" "+socialSecurityNumber;
    }

    /**
     * Changes the name of an added person.
     * @param newFirst
     * @param newLast
     */
    public void changeName(String newFirst, String newLast){
        if (!newFirst.equals("")){
            this.firstName = newFirst;
        }
        if (!newLast.equals("")){
            this.LastName = newLast;
        }
    }


    /**
     * Returns a string representation of the person object.
     * @return
     */
    public String toString(){
        return getFullName();
    }

}
