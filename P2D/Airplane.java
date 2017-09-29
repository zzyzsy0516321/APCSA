import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Airplane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Airplane extends Actor
{
    
    int altitude;
    String name;
    int speed;
    boolean nonStop;
    
    
    public Airplane () {
    
       speed = 10;

        
        
    }
    
    public Airplane (int alt, String nm, int sp, boolean nons) {
    
    name = nm;
    altitude = alt;
    speed = sp;
    nonStop = nons;
    
    }
    
    public void act() 
    
    {
        
        int degree = (int)(Math.random()*180) + 1;
        
        altitude = -1* getY() + 30000;
        getWorld().showText(toString(),150,50); 

        
        
        move(speed);   
        
        if (Math.random() < 0.05) {   //The airplane has 5% chance to turn after every move
        
        turn(degree);
        
        }
        
        if (isAtEdge()) {
        
            turn(degree);
        
        }
        
        System.out.println(degree);
          
          
          
          
    }    
    
    
    public String toString() {
    
        return "Name: " + name + "\n" + "Speed: " + speed + "\n" + "Altitude: " + altitude + " feet" + "\n" + "Non-Stop Flight: " + nonStop + "\n";
      
    }
    
    
}
