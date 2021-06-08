
package ass3.mygame2;
/**
 * 
 *
 * @author Gursharandeep Kaur
 * @version 07/06/2021
 */
public class Item
{
    private String description;
    private String name;
    private int destructivePower;
    
    
    public Item(String name, String description, int destructivePower)
    {
        this.name = name;
        this.description = description;
        this.destructivePower = destructivePower;
        
    }

   
    
   
    
    //write accessors and mutators
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return description;
    }
    
    /**
     * 
     *  
     */
    public int getPower(){
        return destructivePower;
    }
}
