/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapplication;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class Cup implements Serializable{
   private   final  double capacity =0.25;
   private double  calories=0;
   private double volume=0;

    public Cup() {
        
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    

    public double getCapacity() {
        return capacity;
    }


    

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Cup{" + "calories=" + calories + ", volume=" + volume + '}';
    }

  
    
   
}
