/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagui;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author katrinamai
 */
public class Item {
    private String name;
    private int price;
    private String foodIconPath = "Images/Food/" + name + ".png";
    private ImageIcon foodIcon = new ImageIcon(
            new ImageIcon(foodIconPath).getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
    
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public String getName() {return name;}
    public int getPrice() {return price;}
    public String getFoodIconPath() {return foodIconPath;}
    public ImageIcon getFoodIcon() {return foodIcon;}
    
}
