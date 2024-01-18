import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen with the cheat mode selected.
 * 
 * @Yueheng Fu
 * @January 2024
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
            MyWorld gameWorld = new MyWorld(999);
            Greenfoot.setWorld(gameWorld);
            // enter game
        }
        if(Greenfoot.isKeyDown("up")){
            TitleScreen gameWorld = new TitleScreen();
            Greenfoot.setWorld(gameWorld);
            // switch selection
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
