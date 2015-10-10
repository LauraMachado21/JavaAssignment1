import java.util.ArrayList;
import java.lang.String;
/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User
{
    // instance variables - replace the example below with your own
    private static int ID_COUNT=0;
    private int id;
    private String taste;
    private Simulation sim;
    private ArrayList<Document> likes;

    /**
     * Constructor for objects of class User
     */
    public User(Simulation s, String t)
    {
        sim = new Simulation();
        sim = s;
        likes = new ArrayList<Document>();
        taste = t;
        id = ID_COUNT;
        ID_COUNT+=1;
        
    }

    
    public int getID()
    {
        return id;
    }
    
    public String getTaste()
    {
        return taste;
    }
    
    public void like (Document d)
    {
       if(d!=null){
        likes.add(d);
       }   
    }
    
    public boolean likes (Document d)
    {
        for(Document document:likes){
            if (document == d){
                return true;
            }
        }
        
        return false;
    }
    
    public void act()
    {
        ArrayList<Document> TasteMatch;
        TasteMatch= new ArrayList<Document>();
        TasteMatch = sim.search(taste);
        
            for(Document match:TasteMatch){
                like(match);
            }
        
    }
        
}
