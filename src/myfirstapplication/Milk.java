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
public class Milk extends Ingredients{
      private int volume;

    private Color color;

    public Milk(String name, int calories, int volume, Color colro) {
        super(name, calories);
        this.volume = volume;
        this.color = color;
    }

    public int getVolume() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int setVolume(int volume) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Color getColor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Color setColor(Color colro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
