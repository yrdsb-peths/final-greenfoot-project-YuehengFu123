import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bullet that shoots out from the spaceship
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private int speed = 10;
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
            return;
 
        }
        if(isTouching(Aliens.class))
        {
            removeTouching(Aliens.class);
            world.removeObject(this);
            world.increaseScore();
        }
        else if(isTouching(OrderedAlien.class))
        {
            removeTouching(OrderedAlien.class);
            world.removeObject(this);
        }
        else if(isTouching(AlienShooter.class))
        {
            removeTouching(AlienShooter.class);
            world.removeObject(this);
        }
    }   
}
