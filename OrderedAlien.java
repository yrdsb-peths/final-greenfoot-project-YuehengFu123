import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Alien that moves left and right across the screen
 * 
 * @ Yueheng Fu
 * @ January 2024
 */
public class OrderedAlien extends Actor
{
    /**
     * Act - do whatever the OrderedAlien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int a = 0;
    GifImage gifImage = new GifImage("orderedAlien.gif");
    public OrderedAlien(){
        
    }

    public void act()
    {
        setImage(gifImage.getCurrentImage());
        a+=1;
        if(a < 200){
            move(1);
        }
        if(a >400){
            a = 0;
        }
        if(a > 200 ){
            move(-1);
        }
        if(isTouching(Spaceship.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
            world.decreaseHealth();
        }
     }
}
