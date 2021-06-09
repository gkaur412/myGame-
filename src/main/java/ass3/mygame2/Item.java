
package ass3.mygame2;
/**
 * @author Gursharandeep Kaur
 * @version 07/06/2021
 */
public class Item
{
    private String description;
    private String name;
    private int destructivePower;
    
    
    public Item(String name, String description, int destructivePower)
    //write mutators
    {
        this.name = name;
        this.description = description;
        this.destructivePower = destructivePower;
        
    }

   
    
   
    
    //write accessors for items name, 
    // description and destructive power
    //function return the string object, and integer object
    //
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return description;
    }
    
    
    public int getPower(){
        return destructivePower;
    }
}
