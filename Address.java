/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Idris Patan
 */
// class address
public class Address 
{
    private String city;
    private String state;
    private String streetAddress;
    private int zipCode;
    
    // empty constuctor 
    public Address()
    {
        
    }
    // four-argument constructor
    public Address(String city, String state, String streetAddress, int zipCode)
    {
        this.city = city;
        this.state = state;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
    } // end method constructor 

    /**
     * return city
     * @return 
     */
    public String getCity() 
    {
        return city;
    }

    /**
     *  set city
     * @param city 
     */
    public void setCity(String city) 
    {
        this.city = city;
    }

    /**
     * return state
     * @return 
     */
    public String getState() 
    {
        return state;
    }

    /**
    * Error check the two letter US state codes
    * @param st 
    * @return boolean true if code is valid
    */
   public boolean setState(String st)
   {
     if ((st.equals("AL")) || (st.equals("AK")) || 
         (st.equals("AZ")) || (st.equals("AR")) || 
         (st.equals("CA")) || (st.equals("CO")) || 
         (st.equals("CT")) || (st.equals("DE")) || 
         (st.equals("DC")) || (st.equals("FL")) || 
         (st.equals("GA")) || (st.equals("HI")) || 
         (st.equals("ID")) || (st.equals("IL")) || 
         (st.equals("IN")) || (st.equals("IA")) || 
         (st.equals("KS")) || (st.equals("KY")) || 
         (st.equals("LA")) || (st.equals("ME")) || 
         (st.equals("MD")) || (st.equals("MA")) || 
         (st.equals("MI")) || (st.equals("MN")) || 
         (st.equals("MS")) || (st.equals("MO")) || 
         (st.equals("MT")) || (st.equals("NE")) || 
         (st.equals("NV")) || (st.equals("NH")) || 
         (st.equals("NJ")) || (st.equals("NM")) || 
         (st.equals("NY")) || (st.equals("NC")) || 
         (st.equals("ND")) || (st.equals("OH")) || 
         (st.equals("OK")) || (st.equals("OR")) || 
         (st.equals("PA")) || (st.equals("RI")) || 
         (st.equals("SC")) || (st.equals("SD")) || 
         (st.equals("TN")) || (st.equals("TX")) || 
         (st.equals("UT")) || (st.equals("VT")) || 
         (st.equals("VA")) || (st.equals("WA")) || 
         (st.equals("WV")) || (st.equals("WI")) || 
         (st.equals("WY")) || (st.equals("AS")) || 
         (st.equals("GU")) || (st.equals("MP")) || 
         (st.equals("PR")) || (st.equals("VI")) || 
         (st.equals("FM")) || (st.equals("MH")) || 
         (st.equals("PW")) || (st.equals("AA")) || 
         (st.equals("AE")) || (st.equals("AP")))
     {
      state = st;
      return true;
     }
     return false;
   }//end set state

    /**
     * return street address 
     * @return 
     */
    public String getStreetAddress() 
    {
        return streetAddress;
    }

    /**
     * set street address
     * @param streetAddress 
     */
    public void setStreetAddress(String streetAddress)
    {
        this.streetAddress = streetAddress;
    }

    /**
     * return zip code
     * @return 
     */ 
    public int getZipCode() 
    {
        return zipCode;
    }

    /**
     * set zip code 
     * @param zipCode 
     */
    public void setZipCode(int zipCode) 
    {
        this.zipCode = zipCode;
    }
    
    /**
     * return String representation of address
     * @return 
     */
    @Override
    public String toString ()       
    {
        return String.format ("Address: %s %s %s %d",
                getStreetAddress(),getCity(),getState(),getZipCode());
    }// end method 
}
