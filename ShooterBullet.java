import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShooterBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShooterBullet extends Actor
{
    /**
     * Act - do whatever the ShooterBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 2;
    public ShooterBullet(int speed){
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
            world.removeObject(this);
            world.decreaseHealth();
        }
    }    
}
