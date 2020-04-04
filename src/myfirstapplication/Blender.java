/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapplication;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class Blender {
 private  ArrayList<Ingredients> ing  = new ArrayList<Ingredients>();

    final double capacity=  1.5 ;
    private double volume=0;
    private int calories=0;
    private Color color;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
 double tvolume =0;
    public void add(Ingredients ingredient) {
         
          tvolume+=ingredient.getVolume();
          System.out.println(tvolume);
             try{
        test(tvolume,capacity);
       
        this.ing.add(ingredient);
      
        for(int i=0;i<ing.size();i++){
            System.out.println(ing.get(i).getName());
        }
             }
         catch(BlenderOverFlow e){
            System.out.println(e.getMessage());
        }
     
        
     
    }

    public void blend(Blender b) {
        int totR=0;
        int totB=0;
        int totG=0;
        for(int i=0;i<ing.size() ; i++){
            volume+=ing.get(i).getVolume();
            calories +=ing.get(i).getCalories();
            totR +=ing.get(i).getColor().getR();
            totB +=ing.get(i).getColor().getB();
            totG +=ing.get(i).getColor().getG();
            
        }
         totR =totR/ing.size();
        totB= totB /ing.size();
         totG =totG/ing.size();
         b.setColor(new Color(totR,totG,totB));
    }

    public void pour(Cup cup,Blender b) {
       double v1=b.volume;
        
        String str;
        if(b.volume>=cup.getCapacity()){
            b.volume-=cup.getCapacity();
            cup.setVolume(cup.getCapacity());
        str="the cup is full ";}
            else{
    
            cup.setVolume(b.volume);
             b.volume =0;
             str="we dont have Enough coctail to full your cup"; } 
        
             cup.setCalories(b.calories  *  cup.getVolume()/ v1);
            
        
        System.out.println(str);
        
            
    }
 public static void test(double vol,double capacity)throws BlenderOverFlow {
     if(vol>capacity){
         throw new BlenderOverFlow("Blender is Full you cant add!! ");
     }
 }
    
 
}
