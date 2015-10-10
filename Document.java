import java.util.ArrayList;
import java.lang.String;

/**
 * Write a description of class Document here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Document
{
    // instance variables - replace the example below with your own
    private static int ID_COUNT=0;
    private int id;
    private String tag;

    /**
     * Constructor for objects of class Document
     */
    public Document(String t)
    {
        id = ID_COUNT;
        tag = t;
        ID_COUNT+=1;
        
    }

   
    public int getID ()
    {
        return id;
    }
    
    public String getTag(){
        return tag;
    }
}
