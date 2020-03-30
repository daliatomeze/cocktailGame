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
 private ArrayList<Ingredients> ingredients;

    private int capacity;
    private int volume;
    private int calories;
    private Color color;

    public void add(Ingredients ingredient) {
        
        this.ingredients.add(ingredient);
    }

    public void blend() {
        
        
    }

    public void pour(Cup cup) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
  
}
