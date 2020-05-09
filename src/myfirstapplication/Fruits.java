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
public class Fruits extends Ingredients implements Serializable{
   
 private final  String tips="Be a good role model\n" +
"Set a good example for children by eating fruit every day with meals or as snacks.";   

    

    public Fruits(String name, int calories, double volume, Color color) {
        super(name, calories,volume,color);}
     


}
