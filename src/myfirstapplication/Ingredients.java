/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapplication;

/**
 *
 * @author Asus
 */
public class Ingredients {
    
     private int Calories;
     private double Volume;
     private String name;
     private Color  color;


    

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
     
      public Ingredients(String name, int calories,double volume, Color color) {
        this.name = name;
        this.Calories = calories;
        this.Volume=volume;
        this.color=color;
        
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return this.Calories;
    }

    public void setCalories(int calories) {
        this.Calories = calories;
    }

    public double getVolume() {
        return Volume;
    }

    public void setVolume(double Volume) {
        this.Volume = Volume;
    }

    @Override
    public String toString() {
        return  "  name=" + name  + " has a Calories=" + Calories + ",  and its Volume=" + Volume ;
    }
    
    
    
}
