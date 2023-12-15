import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bullet that shoots out from the spaceship
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private int speed = 5;
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       int x = getX();
       int y = getY() - speed;
       setLocation(x, y);
       MyWorld world = (MyWorld) getWorld();
        if(getY() < 0){
            world.removeObject(this);
 
        }
    }   
}
