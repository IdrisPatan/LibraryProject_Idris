/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 * sub class Patron
 * @author Idris Patan
 */
// Sub class patron
public class Patron extends Person implements Comparable<Patron>
{
    private int patronID;
    LibraryDate lastCheckOut;
    private String joinDate;
    private int donations;
    
    /**
     * empty Constructor
     */ 
    public Patron ()
    {
        
    }
    
    /**
     * Two argument constructor 
     * @param pLastCheckOutDate
     * @param patronID 
     */
    public Patron(LibraryDate pLastCheckOutDate, int patronID, String date, int donations) 
    {
        this.lastCheckOut = pLastCheckOutDate;
        this.patronID = patronID;
        this.joinDate = date;
        this.donations = donations;
    }

    /**
     * Return check out date
     * @return 
     */
    public LibraryDate getLastCheckOut() 
    {
        return lastCheckOut;
    }

    /**
     * set check out 
     * @param lastCheckOut 
     */
    public void setLastCheckOut(LibraryDate lastCheckOut) 
    {
        this.lastCheckOut = lastCheckOut;
    }
    
    /**
     * Return patron id
     * @return 
     */
    public int getPatronID()
    {
        return patronID;
    }

    /**
     * Set patron id
     * @param patronID 
     */ 
    public void setPatronID(int patronID)
    {
        this.patronID = patronID;
    }
    
    public String getJoinDate() 
    {
        return joinDate;
    }

    public void setJoinDate(String joinDate) 
    {
        this.joinDate = joinDate;
    }
    
    public int getDonations() 
    {
        return donations;
    }

    public void setDonations(int donations) 
    {
        this.donations = donations;
    }

    public int compareTo (Patron item)
    {
        Patron member = item;
        if(getLastName().compareTo(member.getLastName()) > 0 )
        {
            return 1;
        }
        else if (getLastName().compareTo(member.getLastName()) < 0 )
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    @Override
    public String toString()
    {
        return String.format("%s: %s\n%s: %d\n%s: %s\n","Patron info:",super.toString(),
                "Patron ID:",getPatronID(),"Last Checked out date:", getLastCheckOut(), "Patron Join date:", getJoinDate(), "Donation Amount:",getDonations() );
    }//end toString
}//end patron
