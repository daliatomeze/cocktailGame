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
     private String name;
      public Ingredients(String name, int calories) {
        this.name = name;
        this.Calories = calories;
        
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
    
    
    
}
