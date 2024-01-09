import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main world
 * Yueheng Fu
 * December 2023
 */
public class MyWorld extends World
{
  int stage = 1;
  int h = 3;
  public int score = 0;
  Label scoreLabel;
  Label healthLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1, false);
        Spaceship spaceship = new Spaceship();
        addObject(spaceship, 300, 700);
        healthLabel = new Label(0, 60);
        healthLabel.setValue(h);
        addObject(healthLabel, 30, 30);
    }
    public void act()
    {
        if(h == 0){
            Label gameOverLabel = new Label("Game Over!", 70);
       addObject(gameOverLabel, getWidth()/2, getHeight()/2);

  
        }
    }
    public void decreaseHealth(){
      h-=1;
      healthLabel.setValue(h);
      
    }
     public void increaseScore()
    {
     score++;
    }

} 
      
   

