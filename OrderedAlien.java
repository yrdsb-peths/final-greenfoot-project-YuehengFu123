import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OrderedAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrderedAlien extends Actor
{
    /**
     * Act - do whatever the OrderedAlien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int a = 0;
    
    public OrderedAlien(){
        
    }

    public void act()
    {
        a+=1;
        if(a < 200){
            move(1);
        }
        if(a >400){
            a = 0;
        }
        if(a > 200 ){
            move(-1);
        }
     }
}
