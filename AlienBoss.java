import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Alien Boss with helmet
 * 
 * @Yueheng Fu
 * @ January 2024
 */
public class AlienBoss extends Actor
{
    /**
     * Act - do whatever the AlienBoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int k = 3;
    //speed that the alien boss follows the player
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
        
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            move(-k);
            
        }
        else if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            move(k);
        }
        if(shotTimer.millisElapsed() > coolDown){
           BossBullet bullet = new BossBullet(bulletSpeed);
           getWorld().addObject(bullet, getX(), getY());
           shotTimer.mark();
           GreenfootSound bulletSound = new GreenfootSound("alienBossShot.mp3");
            bulletSound.setVolume(40);

           bulletSound.play();

        
        }
        if(h == 0){
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
            world.increaseScore(1500);
        
        }
        
    }
    
     
}
