/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 * Super Class Person 
 * @author Idris Patan
 */
// Super Class Person
public abstract class Person 
{
    private String firstName;
    private String lastName;
    Address addressPerson;
    Gender genderPerson;
    
    public Person ()
    {
        
    }
    
    /**
     *  three argument constructor 
     * @param first
     * @param last
     * @param address 
     */
    public Person (String first, String last, Address address)
    {
        firstName = first;
        lastName = last;
        addressPerson = address;
    } // end three argument constructor 
    
    /**
     * return First Name
     * @return 
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * set first name
     * @param firstName 
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    //return Last Name
    public String getLastName()
    {
        return lastName;
    }

    /**
     * set last name
     * @param lastName 
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * return Address
     * @return 
     */ 
    public Address getAddressPerson() 
    {
        return addressPerson;
    }

    /**
     * set address
     * @param addressPerson 
     */
    public void setAddressPerson(Address addressPerson)
    {
        this.addressPerson = addressPerson;
    }
    
    /**
     * return gender of person 
     * @return 
     */
    public Gender getGenderPerson() 
    {
        return genderPerson;
    }

    /**
     *  set gender
     * @param genderPerson 
     */
    public void setGenderPerson(Gender genderPerson) 
    {
        this.genderPerson = genderPerson;
    }
    
    // return String represenation of Person Object
    @Override
    public String toString()
    {
        return String.format("\nFirst Namer:%s \nLast Name:%s \nAddress:%s\n"
                + "Gender:", getFirstName(), getLastName(), getAddressPerson(), 
                getGenderPerson());
    }//end method toString
    
}
