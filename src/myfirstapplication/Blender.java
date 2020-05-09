/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapplication;
import static java.awt.PageAttributes.MediaType.C;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
/**
 *
 * @author Asus
 */
public class Blender implements Serializable{
 private  ArrayList<Ingredients> ing  = new ArrayList<Ingredients>();

    final double capacity=  1.5 ;
    private double volume=0;
    private double calories=0;
    private Color color;
    private String str;

    public String getStr() {
        return str;
    }
     
     
     

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Ingredients> getIng() {
        return ing;
    }

    public void setIng(ArrayList<Ingredients> ing) {
        this.ing = ing;
    }
        

    
    
 double tvolume =0;
    public void add(Ingredients ingredient) {
         for(int i=0;i<this.getIng().size();i++){
             tvolume+=this.getIng().get(i).getVolume();
         }
          tvolume+=ingredient.getVolume();
          
             try{
        test(tvolume,capacity);
       
        this.ing.add(ingredient);
        volume+=ingredient.getVolume();
        
      
      
             }
         catch(BlenderOverFlow e){
           JOptionPane.showMessageDialog(null,e.getMessage());
        }
     tvolume=0;
    }
     
    

    public void blend(Blender b) {
        volume=0;
          for(int i=0;i<ing.size() ; i++)
            volume+=ing.get(i).getVolume();
        try{
        test2(b.volume);
        
        int totR=0;
        int totB=0;
        int totG=0;
        volume=0;
       calories=0;
        
        for(int i=0;i<ing.size() ; i++){
            volume+=ing.get(i).getVolume();
            calories +=ing.get(i).getCalories();
            totR +=ing.get(i).getColor().getR();
            totB +=ing.get(i).getColor().getB();
            totG +=ing.get(i).getColor().getG();
        
        }
        
         /* try{
           
        
    String gongFile = "Blender.wav";
    InputStream in = new FileInputStream(gongFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
        }
        
        catch(Exception e){
            
        }*/
         
         InputStream music;
try{
      music=new FileInputStream(new File("src/MyFirstApplication/Blender.WAV"));
      AudioStream audios=new AudioStream(music);
           AudioPlayer.player.start(audios);
}
catch(Exception e){
JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
}    
        
        
        totR = totR/ing.size();
        totB = totB /ing.size();
        totG = totG/ing.size();
         b.setColor(new Color(totR,totG,totB));
        }
        catch(EmptyBlender e){
            JOptionPane.showMessageDialog(null, e.getMessage() +"" );
            
        }
        
        
    }
    
 
     public void pour(Cup cup,Blender b){
        
        try{
       double v1=b.volume;
        test2(v1);
        
        if(b.volume>=cup.getCapacity()){
            b.volume-=cup.getCapacity();
            cup.setVolume(cup.getCapacity());
        str="this cup is full ";}
            else{
    
            cup.setVolume(b.volume);
             b.volume =0;
             str="this cup is not full"; } 
        
             cup.setCalories(b.calories  *  cup.getVolume()/ v1);
            this.setCalories(calories - cup.getCalories());
       
        
        
        
        InputStream music;
        
        try{
      music=new FileInputStream(new File("src/MyFirstApplication/pour.WAV"));
      AudioStream audios=new AudioStream(music);
           AudioPlayer.player.start(audios);
   }
              catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getLocalizedMessage());
      }    }
        
        catch(EmptyBlender e){
            JOptionPane.showMessageDialog(null, e.getMessage() +"");
        }
            
    }
 public static void test(double vol,double capacity)throws BlenderOverFlow {
     if(vol>capacity){
         throw new BlenderOverFlow("Blender is Full you cant add!! ");
     }
 }
      public static void test2(double volume) throws EmptyBlender{
         if(volume==0)
             throw new EmptyBlender("Blender is Empty you cant  blind  or pour ");
     } 
 
}
