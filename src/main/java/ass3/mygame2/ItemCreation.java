package ass3.mygame2;

import java.util.ArrayList;


/**
 * Write a description of class ItemCreation here.
 *There are four items such as ExcaliburSword, key,
 * frontGateKey, and gun.
 * these items can be used by the player to run the game.
 * @author Gursharandeep Kaur
 * @version 07/06/2021
 */
public final class ItemCreation
{
    
    private ArrayList<Item> allItemsInGame;
    
    public ItemCreation()
    {       
        allItemsInGame = new ArrayList();
        createItems();
    }
    
    public void createItems(){
        
        Item excaliburSword, key, frontGateKey, gun;
        
        
        excaliburSword = new Item("excaliburSword", "The legendary Excalibur", 100);
        key = new Item("key", "It has a shape of a heart", 100);
        frontGateKey = new Item("frontGateKey", "To open the front gate door", 100);
        gun = new Item("gun", "to kill the giant ogre", 100);
        
        allItemsInGame.add(excaliburSword);
        allItemsInGame.add(key);
        allItemsInGame.add(frontGateKey);
        allItemsInGame.add(gun);
    }
   
    public Item getItem(String stringItem){
        Item itemToReturn = null;
        for(Item item: allItemsInGame){
            if(item.getName().contains(stringItem)){
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }
  
    
}
