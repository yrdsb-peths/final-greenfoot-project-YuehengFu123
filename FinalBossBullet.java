import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalBossBullet here.
 * 
 * @Yueheng Fu
 * @ January 2024
 */
public class FinalBossBullet extends Actor
{
    /**
     * Act - do whatever the FinalBossBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dir = 0;
    GifImage gifImage = new GifImage("electricShuriken.gif");

    public FinalBossBullet(int dir){
        this.dir = dir;
        setRotation(dir);
        // starting direction of bullet
    }
    public void act()
    {
        
        move(1);
        MyWorld world = (MyWorld) getWorld();
        setImage(gifImage.getCurrentImage());

        
        
        if(getY() < 0){
            world.removeObject(this);
            return;
 
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
        if(getX() <0){
            world.removeObject(this);
            return;
        }
        if(isTouching(Spaceship.class))
        {
            removeTouching(Aliens.class);
            world.decreaseHealth();
            world.removeObject(this);
            
        }
    }
}
