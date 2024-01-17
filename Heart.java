import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends Actor
{
     GifImage gifImage = new GifImage("heart.gif");
     GifImage gifImage2 = new GifImage("heart2.gif");
    GifImage gifImage3 = new GifImage("heart3.gif");
    int h = 3;
    /**
     * Act - do whatever the Heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Heart(int h){
        this.h = h;
    }
    public void act() 
    {
        if(h == 3){
        setImage(gifImage.getCurrentImage());
        }
        else if(h == 2){
            setImage(gifImage2.getCurrentImage());
        }
        else if(h == 1){
            setImage(gifImage3.getCurrentImage());
        }
    }    
    public void secondLife(){
        h= 2;
    }
    public void lastLife(){
        h =1;
    }
    
}
