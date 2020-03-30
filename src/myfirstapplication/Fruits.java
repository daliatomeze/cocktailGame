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
public class Fruits extends Ingredients{
   
       private int volume;

    private Color color;

    public Fruits(String name, int calories, int volume, Color color) {
        super(name, calories);
        this.volume = volume;
        this.color = color;
    }

    public int setVolume(int volume) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getVolume() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Color getColor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Color setColor(Color color) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
