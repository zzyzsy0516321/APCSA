import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Warehouse extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Warehouse()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Robot cozmo = new Robot(4,100,270);
        addObject(cozmo,300,200);
        
    }
}
