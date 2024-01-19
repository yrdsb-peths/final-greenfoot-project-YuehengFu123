import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Alien that shoots bullets
 * 
 * @Yueheng Fu
 * @January 2024
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
           GreenfootSound bulletSound = new GreenfootSound("alienShot.mp3");
           bulletSound.setVolume(40);
           bulletSound.play();

        
        }
        if(isTouching(Spaceship.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
            world.decreaseHealth();
        }
     }
       
}
