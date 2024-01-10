import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalBoss extends Actor
{
    int k = 7;
    int h = 3;
    int coolDown = 1000;
    int bulletSpeed = 2;
    int i = 0;
    SimpleTimer shotTimer = new SimpleTimer();
    SimpleTimer specialTimer = new SimpleTimer();
    SimpleTimer specialTimerCD = new SimpleTimer();
    
    
    public void act() 
    {
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
        if(specialTimer.millisElapsed() > 2000){
            for(int i = 0; i <=360; i +=45){
                FinalBossBullet bullet = new FinalBossBullet(i);
                getWorld().addObject(bullet, getX(), getY());
                specialTimer.mark();
            }
        }
        if(h == 0){
            getWorld().removeObject(this);
        
        }
        
    }
    
}
