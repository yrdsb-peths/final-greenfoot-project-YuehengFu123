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
    GifImage gifImage = new GifImage("bullet.gif");
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       int x = getX();
       int y = getY() - speed;
        setImage(gifImage.getCurrentImage());
        

       setLocation(x, y);
       MyWorld world = (MyWorld) getWorld();
        if(getY() < 0){
            world.removeObject(this);
            return;
 
        }
        if(isTouching(Aliens.class))
        {
            removeTouching(Aliens.class);
            GreenfootSound alienDeath = new GreenfootSound("alienDeath.mp3");
            alienDeath.setVolume(60);
            alienDeath.play();
            world.removeObject(this);
            world.increaseScore(500);
        }
        else if(isTouching(OrderedAlien.class))
        {
            removeTouching(OrderedAlien.class);
            GreenfootSound alienDeath = new GreenfootSound("alienDeath.mp3");
            alienDeath.setVolume(60);
            alienDeath.play();
            world.removeObject(this);
            world.increaseScore(100);
        }
        else if(isTouching(AlienShooter.class))
        {
            removeTouching(AlienShooter.class);
            GreenfootSound alienDeath = new GreenfootSound("alienDeath.mp3");
            alienDeath.setVolume(60);
            alienDeath.play();
            world.removeObject(this);
            world.increaseScore(300);
        }
    }   
}
