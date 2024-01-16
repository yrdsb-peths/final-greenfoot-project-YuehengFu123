import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        if(Greenfoot.isKeyDown("down")){
            CopyOfTitleScreen gameWorld = new CopyOfTitleScreen();
            Greenfoot.setWorld(gameWorld);
        }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    }
    
    private void prepare()
    {

        AlienBoss alienBoss = new AlienBoss(4, 3, 1500, 6);
        addObject(alienBoss,192,88);
        AlienBoss alienBoss2 = new AlienBoss(6, 3, 1500, 5);
        addObject(alienBoss2,396,92);
        FinalBoss finalBoss = new FinalBoss();
        addObject(finalBoss,289,199);
        Aliens aliens = new Aliens();
        addObject(aliens,114,217);
        Aliens aliens2 = new Aliens();
        addObject(aliens2,496,200);
        OrderedAlien orderedAlien = new OrderedAlien();
        addObject(orderedAlien,191,311);
        OrderedAlien orderedAlien2 = new OrderedAlien();
        addObject(orderedAlien2,266,350);
        OrderedAlien orderedAlien3 = new OrderedAlien();
        addObject(orderedAlien3,364,345);
        OrderedAlien orderedAlien4 = new OrderedAlien();
        addObject(orderedAlien4,446,305);
        OrderedAlien orderedAlien5 = new OrderedAlien();
        addObject(orderedAlien5,514,343);
        OrderedAlien orderedAlien6 = new OrderedAlien();
        addObject(orderedAlien6,576,300);
        OrderedAlien orderedAlien7 = new OrderedAlien();
        addObject(orderedAlien7,104,348);
        OrderedAlien orderedAlien8 = new OrderedAlien();
        addObject(orderedAlien8,32,313);
        AlienShooter alienShooter = new AlienShooter();
        addObject(alienShooter,553,36);
        AlienShooter alienShooter2 = new AlienShooter();
        addObject(alienShooter2,53,43);
        AlienShooter alienShooter3 = new AlienShooter();
        addObject(alienShooter3,296,42);
    }
}

