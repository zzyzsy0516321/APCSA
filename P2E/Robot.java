import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{

    int speed;
    int batteryLevel;
    int direction;

    public void act() 
    {

        getWorld().showText(toString(),150,50);

        // Add your action code here.

        System.out.println(getRotation());

        if (batteryLevel <= 0) {
            speed = 0;
        } else {
            if(isAtEdge()){
                
                turn((int)(Math.random()*180));

                
            }
            move(speed);
            batteryLevel -= 1;

        }

        
    }    
    public Robot (int sp, int battery, int dir) {
        speed = sp;
        batteryLevel = battery;
        direction = dir;
        setRotation(direction);

    }
    
    public String toString(){
        String whereToGo;
        if (getRotation() > 180 && getRotation()< 360 ){
            whereToGo = "Up";
        } else if (getRotation() == 180) {
            whereToGo = "left";
        } else if (getRotation() == 360){
            whereToGo = "right";
        } else {
            whereToGo = "down";
        }

        return "Speed: " + speed + "\n" + "Direction: " + whereToGo + "\n" + "Battery Level: " + batteryLevel;
    }
}
