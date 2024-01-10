import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossBullet extends Actor
{
    /**
     * Act - do whatever the BossBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 2;
    public BossBullet(int speed){
        this.speed = speed;
    }
        
    public void act() 
    {
            

       int x = getX();
       int y = getY() + speed;
       setLocation(x, y);
       MyWorld world = (MyWorld) getWorld();
        if(getY() < 0){
            world.removeObject(this);
            return;
 
        }
        if(isTouching(Spaceship.class))
        {
            removeTouching(Aliens.class);
            world.removeObject(this);
            world.decreaseHealth();
        }
       
    }    
}
