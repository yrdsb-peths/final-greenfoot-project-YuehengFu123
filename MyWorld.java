import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main world
 * Yueheng Fu
 * December 2023
 */
public class MyWorld extends World
{
  int stage = 1;
  
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
    }
    public void act()
    {
        
    }    
}
