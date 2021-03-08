package ntnu;

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
        return firstName+" "+LastName+" PersonNumber:"+socialSecurityNumber;
    }

    public void changeName(String newFirst, String newLast){
        if (!newFirst.equals("")){
            this.firstName = newFirst;
        }
        if (!newLast.equals("")){
            this.LastName = newLast;
        }
    }



    public String toString(){
        return getFullName();
    }

}
