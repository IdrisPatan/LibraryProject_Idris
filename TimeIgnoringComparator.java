/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.util.Calendar;
import java.util.Comparator;
//import java.util.GregorianCalendar;
    
/**
 *
 * @author Idris Patan
 */
// class time comparator 
public class TimeIgnoringComparator //implements Comparator<Calendar> 
{
   /**
    * This method takes in two dates. The first date should be the current date (c1) and the second date should be the comparing date, such as a due date (c2)
    * @param c1
    * @param c2
    * @return int - number of days between dates c1 and c2. 
    *    positive indicates c1 is before c2 and
    *    negative indicates c2 is before c1
    */
  public int compare(Calendar c1, Calendar c2) 
  {
    int daySum = 0;
    /*
     * Ex. 2/1/2013 and 3/13/2013
     * Ex. 12/12/2012 and 1/15/2013
     * Ex. 4/4/2013 and 4/9/2013
     * Ex. 4/11/2013 and 4/1/2013
     * Ex. 3/19/2013 and 2/2/2013
     * Ex. 1/19/2013 and 12/20/2012
     */
    if (c1.get(Calendar.YEAR) != c2.get(Calendar.YEAR)) 
    {
        daySum = 365 * 
                (c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR));
    }
    daySum = daySum +
            (c2.get(Calendar.DAY_OF_YEAR) - 
             c1.get(Calendar.DAY_OF_YEAR));
    return daySum;
  }
  
}


