import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AlienShooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlienShooter extends Actor
{
    /**
     * Act - do whatever the AlienShooter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage gifImage = new GifImage("shootingalien.gif");

    int a = 0;
    int coolDown = 2000;
    int bulletSpeed = 5;
    MyWorld world = (MyWorld) getWorld();
    SimpleTimer shotTimer = new SimpleTimer();
    public void act() 
    {
        setImage(gifImage.getCurrentImage());

       a+=1;
        if(a < 100){
            move(1);
        }
        if(a >200){
            a = 0;
        }
        if(a > 100 ){
            move(-1);
        }
        
         if(shotTimer.millisElapsed() > coolDown){
           ShooterBullet bullet = new ShooterBullet(bulletSpeed);
           getWorld().addObject(bullet, getX(), getY());
           shotTimer.mark();

        
        }
        if(isTouching(Spaceship.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
            world.decreaseHealth();
        }
     }
       
}
