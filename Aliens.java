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
    int angle = 0;
    int n = 0;
    GifImage gifImage = new GifImage("Alien.gif");

    public void act() 
    {
       if(n % 30 == 0)
       {
           angle = Greenfoot.getRandomNumber(359);
           setRotation(angle);
        }
       n+=1;
       move(5);
       
       setImage(gifImage.getCurrentImage());
       if(getY() > 750)
       {
           turnTowards(getX(), 0);
           move(10);
        }
       if(getY() < 0){
           turnTowards(getX(), 800);
           move(10);
           
        }
       if(getX() > getWorld().getWidth()){
            turnTowards(0, getY());
            move(10);
       
        }
        if(getX() < 0){
            turnTowards(600, getY());
            move(10); 
            
       
        } 
       
    }    
}
