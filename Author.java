/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Idris Patan
 */
public class Author extends Person
{
    Item authorItem;
    private int publicationYear;
    private double isbnAuthor;
    
    // empty constructor 
    public Author ()
    {
        
    }
    
    public Author (Item authorItem, double isbnAuthor)
    {
        this.authorItem = authorItem;
        this.isbnAuthor = isbnAuthor;
    }

    public Item getAuthorItem() 
    {
        return authorItem;
    }

    public void setAuthorItem(Item authorItem) 
    {
        this.authorItem = authorItem;
    }

    public double getIsbnAuthor() 
    {
        return isbnAuthor;
    }

    public void setIsbnAuthor(double isbnAuthor) 
    {
        this.isbnAuthor = isbnAuthor;
    }
    
    @Override
    public String toString()
    {
        return String.format("Info of this Item: %s\nISBN: %.1f ",super.toString() ,getIsbnAuthor());
    }//end to string    
}//end author 
