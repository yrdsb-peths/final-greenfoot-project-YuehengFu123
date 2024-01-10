import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalBossBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalBossBullet extends Actor
{
    /**
     * Act - do whatever the FinalBossBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dir = 0;
    public FinalBossBullet(int dir){
        this.dir = dir;
        setRotation(dir);
    }
    public void act()
    {
        
        move(1);
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
        if(getY() < 0){
            world.removeObject(this);
            return;
 
        }
        if(getY() >800){
            world.removeObject(this);
            return;
        }
        if(getX() >600){
            world.removeObject(this);
            return;
        }
        if(getX() <800){
            world.removeObject(this);
            return;
        }
    }
}
