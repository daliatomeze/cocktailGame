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
public class Suger extends Ingredients{
    private int volume;

    private Color color;
    
    public Suger(){
        super("Sugar", 200);
        this.volume = 0;
        this.color = new Color(255,255,255);
    }
}
