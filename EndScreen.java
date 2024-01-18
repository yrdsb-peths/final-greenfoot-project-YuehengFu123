import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreen extends World
{
    int score = 0;
    int stage = 0;
    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    
    public EndScreen(int score, int stage)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1); 
        this.score= score;
        this.stage = stage;

        Label scoreLabel = new Label(score, 70);
        addObject(scoreLabel, 100, getHeight()/2 - 60);
        
        Label stageLabel = new Label(stage, 70);
        addObject(stageLabel, 100, getHeight()/2 + 50);
    }
    public void act(){
        if(Greenfoot.isKeyDown("r"))
        {
            MyWorld gameWorld = new MyWorld(3);
            Greenfoot.setWorld(gameWorld);
        }
        if(Greenfoot.isKeyDown("m")){
            TitleScreen gameWorld = new TitleScreen();
            Greenfoot.setWorld(gameWorld);
        }
        
    }
}
