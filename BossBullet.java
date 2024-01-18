import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * bullet that shoots from both final boss and normal boss
 * 
 * @ Yueheng Fu
 * @ January 2024
 */
public class BossBullet extends Actor
{
    /**
     * Act - do whatever the BossBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage gifImage = new GifImage("alienBossBullet.gif");

    private int speed = 2;
    public BossBullet(int speed){
        this.speed = speed;
    }
        
    public void act() 
    {
            
       setImage(gifImage.getCurrentImage());
       int x = getX();
       int y = getY() + speed;
       setLocation(x, y);
       MyWorld world = (MyWorld) getWorld();
        if(getY() < 0){
            world.removeObject(this);
            return;
            // removes the bullet if it goes past world bounderies
 
        }
        if(isTouching(Spaceship.class))
        {
            world.removeObject(this);
            world.decreaseHealth();
        }
       
    }    
}
