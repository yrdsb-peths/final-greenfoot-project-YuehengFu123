import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aliens here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aliens extends Actor
{
    /**
     * Act - do whatever the Aliens wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int count = 0;
    int angle = 0;
    int n = 0;

    public void act() 
    {
       if(n % 20 == 0)
       {
           angle = Greenfoot.getRandomNumber(359);
           setRotation(angle);
        }
       n+=1;
       move(5);
       if(getY() > 400)
       {
           setLocation(getX(), 400);
        }
       if(getY() < 0){
           setLocation(getX(), 0);
        }
       if(getX() > getWorld().getWidth()){
            setLocation(getWorld().getWidth(), getY());
       
        }
        if(getX() < 0){
            setLocation(0,getY()); 
        
       
        } 
       
    }    
}
