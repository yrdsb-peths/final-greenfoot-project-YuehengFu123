import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AlienBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlienBoss extends Actor
{
    /**
     * Act - do whatever the AlienBoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int k = 3;
    int h = 3;
    int coolDown = 500;
    int bulletSpeed = 5;
    SimpleTimer shotTimer = new SimpleTimer();
    GifImage gifImage = new GifImage("AlienGeneral.gif");

    
    public AlienBoss(int h, int k, int coolDown, int bulletSpeed){
        this.k = k;
        this.h = h;
        this.coolDown = coolDown;
    }
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
        if(getX() > getWorld().getWidth()){
            setLocation(getWorld().getWidth(), getY());
       
        }
        if(getX() < 0){
            setLocation(0,getY()); 
        
       
        }
        if(isTouching(Bullet.class))
        {
            removeTouching(Bullet.class);
            h-=1;
       
        }   
        
        if(Greenfoot.isKeyDown("a")){
            move(-k);
            
        }
        else if(Greenfoot.isKeyDown("d")){
            move(k);
        }
        if(shotTimer.millisElapsed() > coolDown){
           BossBullet bullet = new BossBullet(bulletSpeed);
           getWorld().addObject(bullet, getX(), getY());
           shotTimer.mark();

        
        }
        if(h == 0){
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
            world.increaseScore(1500);
        
        }
        
    }
    
     
}
