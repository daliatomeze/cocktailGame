/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package2;


import java.util.Scanner;
import myfirstapplication.Blender;
import myfirstapplication.Color;
import myfirstapplication.Cup;
import myfirstapplication.EmptyBlender;
import myfirstapplication.Fruits;
import myfirstapplication.Ingredients;
import myfirstapplication.Milk;
import myfirstapplication.Suger;


/**
 *
 * @author Asus
 */
public class Test {
     public static void main(String[] args) {
        Blender b1=new Blender();
         System.out.println("welome here you will get the best coctaill ever  .");
         Scanner input = new Scanner(System.in);
         System.out.println("chose waht you want to do : \n"); 
        String menu = "1. add to the blender\n"
                + "2. blend\n"
                + "3. pour into cub\n"
                + "4. exit\n";
        while(true){
            System.out.println(menu);
            switch(input.nextInt()){
                case 1:
                     Ingredients f ;
                {
                   String str = "1. Fruits\n"
                + "2. Milk\n"
                + "3. Suger\n";
                   
             
        
            System.out.println(str);
            switch(input.nextInt()){
                case 1:
            String str2 = "We have these types of fruits, please choose one of them\n"
                    + "1. Banana\n"
                + "2. Apple\n"
                + "3. Strawberries\n"
                + "4. kiwi\n"
                + "5. Pineapple\n"
                + "6. Orange\n";
                   
             
        
            System.out.println(str2);
           
            switch(input.nextInt()){
                case 1:
           f=new Fruits("Banana",110,0.125,new Color(255,255,0));
                   b1.add(f);   
                    break;
                case 2:
                    f=new Fruits("Apple",130,0.2,new Color(255,0,0));
                      b1.add(f);
                    break;
                case 3:
                    f=new Fruits("Strawberries",50,0.125,new Color(255,0,0));
                      b1.add(f);
                    break;
                    
                case 4:
                    f=new Fruits("kiwi",90,0.15,new Color(0,255,0));
                      b1.add(f);
                    break;
                case 5:
                    f=new Fruits("Pineapple",50,0.11,new Color(255,255,130));
                      b1.add(f);
                    break;
                    
                case 6:
                    f=new Fruits("Orange",80,0.15,new Color(255,140,60));
                      b1.add(f);
                    break;
                    
                  
            }
                    
                    break;
                case 2:
                    f=new Milk("milk",300,0.5, new Color(255,255,255));
                    b1.add(f);
                    break;
                case 3:
                    f=new Suger();
                    b1.add(f);
                    break;
            }
            }
        
                    break;
                case 2:
                b1.blend(b1);
                    System.out.println("the total calories :  "+ b1.getCalories() + "\n The total volume :" +b1.getVolume());
                    System.out.println("the final color in RGB : ("  + b1.getColor().getR()+ ","+b1.getColor().getG() + ","  + b1.getColor().getB() +")" );
                    
                        
                    break;
                case 3:
                    Cup cup1=new Cup();
                    
                      try{  test2(b1.getVolume());
                    
                        b1.pour(cup1, b1);
                        System.out.println( "the total calories in your cup : " +cup1.getCalories() );
                        System.out.println("the total volume in your cup : "+cup1.getVolume() +"  in letter");
                      }
                      catch(EmptyBlender e){
                          System.out.println(e.getMessage());
                      }
                    break;
                    
                    
                
                case 4:
                    System.exit(0);
                    break;
                default:
            }
        }
                
     } 
     
     public static void test2(double volume) throws EmptyBlender{
         if(volume==0)
             throw new EmptyBlender("Blender is Empty you cant pour ");
     }
}
