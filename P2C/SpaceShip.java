import greenfoot.*; 
public class SpaceShip extends Actor
{
    String name;
    int speed;
    public void act() 
    {
        move(5);
        if (isAtEdge()){
                int turnDegree = (int)(Math.random()*90);
                turn(turnDegree);
        }
        getWorld().showText(toStirng(),getWorld().getWidth()/2,getWorld().getHeight()/2);
    }    
    public SpaceShip() {
        name = "default ship";
        speed = 10;
    }
     public SpaceShip( String shipName, int shipSpeed) {
    
         name = shipName;
         speed = shipSpeed;
    }
    public String toStirng(){
    return "Name of the ship is " + name + "\nSpeed is: " + speed + "\n" + "X-coordinate: " + getX()+ "\n" + "Y-coordinate: " + getY()  ;
    }
}