import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfTitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopyOfTitleScreen extends World
{

    /**
     * Constructor for objects of class CopyOfTitleScreen.
     * 
     */
    public CopyOfTitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1); 
        prepare();
    }

    public void act()
    {
        // starts the game if the user presses space
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        if(Greenfoot.isKeyDown("up")){
            TitleScreen gameWorld = new TitleScreen();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }
}