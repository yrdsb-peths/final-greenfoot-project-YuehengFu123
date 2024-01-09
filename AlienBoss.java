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
    public void act() 
    {
        if(isTouching(Bullet.class))
        {
            removeTouching(Bullet.class);
            h-=1;
       
        }   
        if(h == 0){
            getWorld().removeObject(this);
        
        }
        if(Greenfoot.isKeyDown("a")){
            move(-k);
            
        }
        else if(Greenfoot.isKeyDown("d")){
            move(k);
        }
}
}
