import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starting menu
 * 
 * @Yueheng Fu 
 * @January 2024
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
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
            MyWorld gameWorld = new MyWorld(3);
            Greenfoot.setWorld(gameWorld);
            // enter game
        }
        if(Greenfoot.isKeyDown("down")){
            CopyOfTitleScreen gameWorld = new CopyOfTitleScreen();
            Greenfoot.setWorld(gameWorld);
            // switch mode selection
        }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    }
    
    private void prepare()
    {

        
    }
}

