import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the final boss with a crown
 * 
 * @Yueheng Fu
 * @January 2024
 */
public class FinalBoss extends Actor
{
    int k = 2;
    // speed following main spaceship
    int h = 7;
    // health
    int coolDown = 1500;
    int bulletSpeed = 2;
    int i = 0;
    
    SimpleTimer shotTimer = new SimpleTimer();
    SimpleTimer specialTimer = new SimpleTimer();
    SimpleTimer specialTimerCD = new SimpleTimer();
    GifImage gifImage = new GifImage("AlienKing.gif");

    
    public void act() 
    {
        MyWorld world = (MyWorld) getWorld();
        setImage(gifImage.getCurrentImage());
        if(getX() > world.getWidth()){
            setLocation(world.getWidth(), getY());
       
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
           world.addObject(bullet, getX(), getY());
           shotTimer.mark();
           GreenfootSound bulletSound = new GreenfootSound("alienBossShot.mp3");
           bulletSound.play();

        
        }
        if(specialTimer.millisElapsed() > 3000){
            // shooting a special bullet in every direction
            for(int i = 0; i <=360; i +=45){
                FinalBossBullet bullet = new FinalBossBullet(i);
                getWorld().addObject(bullet, getX(), getY());
                specialTimer.mark();
            }
        }
        if(h == 0){
            GreenfootSound alienDeath = new GreenfootSound("alienDeath.mp3");
            alienDeath.play();
            getWorld().removeObject(this);
            world.increaseScore(3000);

        
        }
        
        
    }
    
}
