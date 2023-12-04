/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagui;

/**
 * Authors/Contributors in alphabetical order.
 * @author Arpita Sakshee
 * @author Christian Villanueva
 * @author Katrina Mai
 * @author Maya Louise Dagdag
 */
public class Item {
    private final String name;
    private final int cost;
    private final int boost_1;
    private final int boost_2;
    
    public Item(String name, int cost, int boost_1, int boost_2){
        this.name = name;
        this.cost = cost;
        this.boost_1 = boost_1;
        this.boost_2 = boost_2;
    }
    
    public String getName(){
        return this.name;
    }
     
    public int getCost(){
        return this.cost;
    }
      
    public int getBoost_1(){
        return this.boost_1;
    }
      
    public int getBoost_2(){
        return this.boost_2;
    }
}
