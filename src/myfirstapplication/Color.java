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
public class Color implements Serializable{
    
       
    public Color(int r, int g, int b){
        this.r= r;
        this.g = g;
        this.b=  b;
    }

    private int r;

    private int g;

    private int b;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
 
}
