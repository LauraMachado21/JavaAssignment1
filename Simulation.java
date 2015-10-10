import java.util.ArrayList;
import java.lang.String;

/**
 * Write a description of class Simulation here.
 * 
 * @author Laura Machado
 * @version 1.1
 */
public class Simulation
{
    // instance variables - replace the example below with your own
    private ArrayList<User> users;
    private ArrayList<Document> documents;

    /**
     * Constructor for objects of class Simulation
     */
    public Simulation()
    {
       users = new ArrayList<User>();
       documents= new ArrayList<Document>();
    }

    
    public void addUser(User u){
    
        users.add(u);
    }
    
    public void addDocument(Document d){
  
        documents.add(d);
    }
    
    public void run(){
        
         for( User user:users){
             user.act();
         }
        
    }
    
    public ArrayList<Document> search(String taste){
        
        ArrayList<Document> SameTaste;
        SameTaste = new ArrayList<Document>();
        
        for(Document d:documents){
            if(taste == d.getTag()){
                SameTaste.add(d);
            }
        }
        
        return SameTaste;
        
    }
}
