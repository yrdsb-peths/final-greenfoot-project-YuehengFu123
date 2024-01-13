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
    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    
    public EndScreen(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1); 
        this.score= score;
        Label gameOverLabel = new Label(score, 70);
        addObject(gameOverLabel, 100, getHeight()/2);
    }
}
