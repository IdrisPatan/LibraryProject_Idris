/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.util.Calendar;
//import java.util.Comparator;
import java.util.GregorianCalendar;
/**
 * A date class to use for all library activities
 * Has data elements: day (integer), month (integer), year (integer)
 * 
 * @author Idris Patan
 */
// class LibraryDate
public class LibraryDate implements Constants
{
   private int day;
   private int month;
   private int year;
   
   
   /**
    * Default constructor with no inputs that gets the real current date from the OS by using one of the built in date types (e.g., Date, Calendar, GregorianCalendar, …)  The Java built-in type should ONLY be used to get the current date to put in the LibraryDate object.
    */
   public LibraryDate()
   {
      Calendar cal = new GregorianCalendar(); 
      year = cal.get(Calendar.YEAR);
      month = 1 + cal.get(Calendar.MONTH);      // 0 to 11
      day = cal.get(Calendar.DAY_OF_MONTH);

   }
/**
 * Constructor that accepts an input day, month, and year, error checks these values and stores them in a new LibraryDate object.  For Lab #3, dates must be REAL dates.  You may not use the "30-day" simplification.
 * @param day
 * @param month
 * @param year 
 */
   public LibraryDate(int day, int month, int year)
   {
      this.setDay(day);
      this.setMonth(month);
      this.setYear(year);
   }
   
   /**
    * Add a number of days to the current date
    * @param numdays
    * @return LibraryDate - future date of today plus numdays
    */
   
   public LibraryDate addDays(int numdays)
   {
      Calendar cal = new GregorianCalendar(); 
      cal.set(this.year, (this.month - 1), this.day);
      cal.add(Calendar.DAY_OF_YEAR, numdays);
      LibraryDate due = 
          new LibraryDate(cal.DAY_OF_MONTH, 
                          cal.MONTH, 
                          cal.YEAR );
      return due;

      
   }

   /**
    *
    * @return day value
    */
   public int getDay()
   {
      return day;
   }

   /**
    * Error check the value for testDay based on month and year
    * @param testDay
    * @return boolean - true means testDay is valid
    *
    * YOU MUST WRITE THIS METHOD
    */
   public boolean setDay(int testDay)
   {
       int [] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       //check if testDay in range for month
       if (testDay >0 && testDay <= daysPerMonth[month])
       {
           this.day = testDay;
           return true;
       }
       //check for leap year
       if (month == 2 && testDay == 29 && (year %400 == 0 || 
               (year %4 == 0 && year %100 !=0)))
       {
           this.day = testDay;
           return true;           
       }
           
       
       return false;
   }


   /**
    *
    * @return value of month 1 - 12
    */
   public int getMonth()
   {
      return month;
   }

   /**
    * Error check month value
    * @param month
    * @return boolean - true means valid month 1 - 12
    */
   public boolean setMonth(int month)
   {
      if ((month >= 1) && (month <= 12))
      {
         this.month = month;
         return true;
      }
      return false;
   }

   /**
    *
    * @return int year
    */
   public int getYear()
   {
      return year;
   }

   /**
    * Error check year for negative value
    * @param year
    * @return boolean - true means year was positive
    */
   public boolean setYear(int year)
   {
      if (year > 0)
      {
         this.year = year;
         return true;
      }
      return false;
   }
   
   /**
    * Compare two dates and return the number of days between the invoking date and the passed in date
    * @return 
    */
   public int howManyDays()
   {
       int hm;
       TimeIgnoringComparator tIC = 
               new TimeIgnoringComparator();  // this class is given to you
       Calendar today = Calendar.getInstance(); 
       Calendar date2 = 
               new GregorianCalendar(this.getYear(), 
                                    (this.getMonth() - 1),
                                     this.getDay()); //yr,mo,day
       hm = tIC.compare(today, date2);  
       return hm;   
   }
/*  
   public int howManyDays(LibraryDate day2)
   {
       int hm;
       TimeIgnoringComparator tIC = 
               new TimeIgnoringComparator();
       Calendar today = Calendar.getInstance(); 
       Calendar date2 = 
               new GregorianCalendar(day2.getYear(), 
                                    (day2.getMonth() - 1),
                                     day2.getDay()); //yr,mo,day
       hm = tIC.compare(today, date2);
       return hm;   
   }
*/   
   
   /**
    * 
    * @return 
    */
@Override
   public String toString()
   {
      return " "+ month + "/" +
                  day + "/" +
                  year + " ";
   }
   
}



  