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
public class Suger extends Ingredients implements Serializable{
   

   
    public final String str="Gaining too much weight by eating  sugary foods increases your risk of hypertension";
    public Suger(){
        super("Sugar", 200,0,new Color(255,255,255));
       
   
    }
}
