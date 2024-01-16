import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main spaceship object
 * 
 * @author Yueheng Fu
 * @ december 2023 
 */
public class Spaceship extends Actor
{
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int k = 5; 
    GreenfootImage[] idle = new GreenfootImage[10];
    SimpleTimer animationTimer = new SimpleTimer();
    SimpleTimer shotTimer = new SimpleTimer();
    

    public Spaceship(){
        for(int i = 0; i<idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/Spaceship_idle/spaceshipIdle0" + i + ".png");
            idle[i].scale(80, 80);
        }
    }
    // speed of spaceship
    int imageIndex = 0;
     public void animateSpaceship()
    {
        if(animationTimer.millisElapsed() < 50)
        {
            return;
        }
        animationTimer.mark();
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex +1 ) %idle.length;
       
    }
    public void act() 
    {
       MyWorld world = (MyWorld) getWorld();
       if(Greenfoot.isKeyDown("a")){
            move(-k);
            
        }
        else if(Greenfoot.isKeyDown("d")){
            move(k);
        }
       if(Greenfoot.isKeyDown("w")){
           setLocation(getX(), getY()-k);
       }
       if(Greenfoot.isKeyDown("s")){
           setLocation(getX(), getY()+k);
       }
       if(Greenfoot.isKeyDown("space") && shotTimer.millisElapsed() > 500){
           Bullet bullet = new Bullet();
           world.addObject(bullet, getX(), getY());
           GreenfootSound bulletSound = new GreenfootSound("mainBullet.mp3");
           bulletSound.play();
           shotTimer.mark();

        }    
       if(getX() > getWorld().getWidth()){
            setLocation(world.getWidth(), getY());
       
        }
        if(getX() < 0){
            setLocation(0,getY()); 
        
       
        }
        if(getY() > 800){
            setLocation(getX(), 800);
        }
        if(getY() < 0){
            setLocation(getX(), 0);
        }
        if(isTouching(Aliens.class))
        {
            world.decreaseHealth();
            removeTouching(Aliens.class);
        }
        animateSpaceship();
    }
    
    public void reset(){
        setLocation(300, 700);
    }
}
