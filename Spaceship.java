import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main spaceship object
 * 
 * @author Yueheng Fu
 * @ december 2023 
 */
public class Spaceship extends Actor
{
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int k = 10; 
    int h = 3;
    SimpleTimer shotTimer = new SimpleTimer();
    // speed of spaceship
    public void act() 
    {
       
       if(Greenfoot.isKeyDown("a")){
            move(-k);
            
        }
        else if(Greenfoot.isKeyDown("d")){
            move(k);
        }
       if(Greenfoot.isKeyDown("space") && shotTimer.millisElapsed() > 500){
           Bullet bullet = new Bullet();
           MyWorld world = (MyWorld) getWorld();
           world.addObject(bullet, getX(), getY());
           shotTimer.mark();

        }    
       if(getX() > getWorld().getWidth()){
            setLocation(getWorld().getWidth(), 700);
       
        }
        if(getX() < 0){
            setLocation(0,700); 
        
       
        }
    }
}
