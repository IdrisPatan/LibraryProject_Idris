/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.util.ArrayList;
import java.util.List;


/**
 * Class Item That creates each instance of items
 * @author Idris Patan
 */
public class Item implements Constants
{
    private double iSBN;
    private String title = new String(); 
    ItemType type ;
    private String publisher = new String();
    private int pageInfoHowMany ;
    private double price;
    private int publicationYear ;
    private boolean checkedOut;
    private int patronID;
    LibraryDate dueDate;
    Author authorInfo;
    private String keyWord;
    /**
     * empty constructor 
     */
    public Item ()
        {
            
        }
    /**
     * 
     * @param isbn
     * @param title
     * @param type
     * @param publisher
     * @param numberOfPages
     * @param price
     * @param yearPublished
     * @param status
     * @param patId 
     */
     public Item (double isbn, String title, ItemType type, String publisher, 
       int numberOfPages, double price, int yearPublished, boolean status, 
       int patId, Author authorInfo)
    {
       this.iSBN = isbn;
       this.title = title;
       this.type = type;
       this.publisher = publisher;
       this.pageInfoHowMany = numberOfPages;
       this.price = price;
       this.publicationYear = yearPublished;
       this.checkedOut = status;  
       this.patronID = patId;
       this.authorInfo = authorInfo;
     //  this.keyWords = keyWords; 
    }
     
     public int daysUntilDue()
     {
         LibraryDate d1 = new LibraryDate();
         return d1.howManyDays();
     }
    
    /**
     * get due dtate 
     * @return 
     */
    public LibraryDate getDueDate() 
    {
        return dueDate;
    }
     /**
     * return isbn
     * @return 
     */
    public double getiSBN() 
    {
        return iSBN;
    }
    
    /**
     * return getPageInfoHowMany
     * @return 
     */
    public int getPageInfoHowMany() 
    {
        return pageInfoHowMany;
    }
    
    /**
     * return getPatronID
     * @return 
     */
    public int getPatronID() 
    {
        return patronID;
    }

    /**
     * return getPrice
     * @return 
     */
    public double getPrice() 
    {
        return price;
    }
    
     /**
     * return getPublicationYear
     * @return 
     */
    public int getPublicationYear() 
    {
        return publicationYear;
    }

    /**
     * return publisher
     * @return 
     */
    public String getPublisher() 
    {
        return publisher;
    }

    /**
     * return title 
     * @return 
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * @return Enum ItemType
     */
    public ItemType getType() 
    {
        return type;
    }
    
    /**
     * return isStatus
     * @return 
     */
    public boolean isCheckedOut() 
    {
        return checkedOut;
    }
    
    /**
     * set isStatus
     * @param checkedOut 
     */
    public void setCheckedOut(boolean checkedOut) 
    {
        this.checkedOut = checkedOut;
    }

    /**
     * set Due date
     * @param dueDate 
     */
    public void setDueDate(LibraryDate dueDate) 
    {
        this.dueDate = dueDate;
    }
    
    /**
     * set isbn
     * @param iSBN 
     */
    public boolean setiSBN(double iSBN) 
    {
        if ((iSBN >0.0) && (iSBN < Double.MAX_VALUE))
        {
            this.iSBN = iSBN;
            return true;
        }
        System.out.println("Please enter double value for isbn");
        return false;
    }
      

    public Item(double iSBN, ItemType type, int pageInfoHowMany, 
            double price, int publicationYear, boolean checkedOut,
            int daysLeft, int patronID, LibraryDate dueDate) 
    {
        this.iSBN = iSBN;
        this.type = type;
        this.pageInfoHowMany = pageInfoHowMany;
        this.price = price;
        this.publicationYear = publicationYear;
        this.checkedOut = checkedOut;
        //this.daysLeft = daysLeft;
        this.patronID = patronID;
        this.dueDate = dueDate;
    }
    /**
     * set getPageInfoHowMany
     * @param pageInfoHowMany 
     */
    public boolean setPageInfoHowMany(int pageInfoHowMany) 
    {
        if(pageInfoHowMany > 0 )
        {
            this.pageInfoHowMany = pageInfoHowMany;
            return true;
        }
        System.out.println("Number of Pages should be > 0 ");
        return false;
    }
    
    /**
     * set getPatronID
     * @param patronID 
     */
    public void setPatronID(int patronID) 
    {
        this.patronID = patronID;
    }
    
    /**
     * set getPrice
     * @param price
     * @return true
     */
    public boolean setPrice(double price)
    {      
        if ((price > 0.0) && (price < Double.MAX_VALUE))
        {
            this.price = price; 
            return true;
        }
        System.out.println("Invalid Price Try Again");
        return false;       
    }
    
    /**
     * set getPublicationYear
     * @param publicationYear 
     * @return ture 
     */
    public boolean setPublicationYear(int publicationYear) 
    {
        this.publicationYear = publicationYear;  
        return true;
    }
    
     /**
     * set publisher 
     * @param publisher 
     */
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    
     /**
     * set title 
     * @param title 
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * set type
     * @param type 
     */ 
    public void setType(ItemType type) 
    {
        this.type = type;
    }
    
    public String typeString (ItemType typeE)
    {
        return typeE.name();
    }

    public Author getAuthorInfo()
    {
        return authorInfo;
    }

    public void setAuthorInfo(Author authorInfo) 
    {
        this.authorInfo = authorInfo;
    }

    public String getKeyWord() 
    {
        return keyWord;
    }

    public void setKeyWord(String keyWord) 
    {
        this.keyWord = keyWord;
    }

    
    //return String represenation of item Object
    @Override
    public String toString()
    {
        if (isCheckedOut() == true )
        {
            return String.format ("ISBN:%.1f\nTitle:%s\nItemType:%s\nPublisher:%s\nPage Info:%d\nPrice:%.1f\nPublication Year:%d\nItem Status:%s\nPatron ID:%d\nAuthor:%s\nKey Words:%s", getiSBN(), getTitle(), typeString(getType()),getPublisher(),getPageInfoHowMany(),getPrice(),getPublicationYear(),isCheckedOut(),getPatronID(),getAuthorInfo(),getKeyWord() );        }
        else
        {
            return String.format ("ISBN:%.1f\nTitle:%s\nItemType:%s\nPublisher:%s\nPage Info:%d\nPrice:%.1f\nPublication Year:%d\nItem Status:%s\nPatron ID:%d\nAuthor:%s\nKey Words:%s", getiSBN(), getTitle(), typeString(getType()),getPublisher(),getPageInfoHowMany(),getPrice(),getPublicationYear(),isCheckedOut(),getPatronID(),getAuthorInfo(),getKeyWord() );
        }
        /*
       String result = new String();
       String NEW_LINE = System.getProperty("line.seperator");
       
       result = result.concat(this.getClass().getName() + NEW_LINE);
       result = result.concat("ISBN: " + this.getiSBN()+ NEW_LINE);
       result = result.concat("Title: " + this.getTitle()+ NEW_LINE);
       result = result.concat("ItemType: " + typeString(getType())+ NEW_LINE);
       result = result.concat("Publisher: " + this.getPublisher()+ NEW_LINE);
       result = result.concat("Page Info: " + this.getPageInfoHowMany()+ NEW_LINE);
       result = result.concat("Price: " + this.getPrice()+ NEW_LINE);
       result = result.concat("Publication Year: " + this.getPublicationYear()+ NEW_LINE);
       result = result.concat("Item Status: " + this.isCheckedOut()+ NEW_LINE);
       result = result.concat("Patron ID: " + this.getPatronID()+ NEW_LINE);
       result = result.concat("Author: " + this.getAuthorInfo()+ NEW_LINE);
       result = result.concat("keys: " + this.print+ NEW_LINE);
    /*  for (String stringKeyWord : keyWords)
       {
           System.out.println();
          // result.concat("Key Word: " + this.getKeyWords()+ NEW_LINE);
       }
       return result.toString();*/
       
    }//end public string
}// end item class 

 /*
        
         String s = new String();
        s.format('ISBN: %.1f', getiSBN());
        s.concat(String.format('Title: %s', getTitle()));
        
        
        */ 