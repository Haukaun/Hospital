package ntnu;

public abstract class Person {

    private String firstName;
    private String LastName;
    private String socialSecurityNumber;

    public Person (String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.LastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;

    }

    public String getPersonNumber(){
        return this.socialSecurityNumber;
    }

    public void setPersonNumber(String personNumber){
        this.socialSecurityNumber = personNumber;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.LastName = lastName;
    }

    public String getLastName(){
        return this.LastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getFullName(){
        return firstName+""+LastName+""+socialSecurityNumber;
    }

    public void changeName(String newFirst, String newLast){
        if (!newFirst.equals("")){
            this.firstName = newFirst;
        }
        if (!newLast.equals("")){
            this.LastName = newLast;
        }
    }

    public abstract String toString();

}
