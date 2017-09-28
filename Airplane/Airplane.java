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
    double speed;
    boolean nonStop;
    
    
    public Airplane () {
    
            
        
        
        
    }
    
    public Airplane (int alt, String nm, double sp, boolean nons) {
    
    name = nm;
    altitude = alt;
    speed = sp;
    nonStop = nons;
    
    }
    
    public void act() 
    {
          move(20);   
    }    
    
    
    public String toString() {
    
        return "";
      
    }
    
    
}
