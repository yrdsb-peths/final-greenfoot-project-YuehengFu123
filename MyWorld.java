import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main world
 * Yueheng Fu
 * December 2023
 */
public class MyWorld extends World
{
  int stage = 0;
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
        if(getObjects(Aliens.class).size() == 0 &&
        getObjects(AlienBoss.class).size() == 0 &&
        getObjects(OrderedAlien.class).size() ==0){
            stage+=1;
            if(stage == 1){
                Aliens aliens = new Aliens();
                addObject(aliens,242,219);
                Aliens aliens2 = new Aliens();
                addObject(aliens2,295,218);
                OrderedAlien orderedAlien = new OrderedAlien();
                addObject(orderedAlien,86,287);
                OrderedAlien orderedAlien2 = new OrderedAlien();
                addObject(orderedAlien2,175,287);
                OrderedAlien orderedAlien3 = new OrderedAlien();
                addObject(orderedAlien3,270,285);
                OrderedAlien orderedAlien4 = new OrderedAlien();
                addObject(orderedAlien4,361,281);
                OrderedAlien orderedAlien5 = new OrderedAlien();
                addObject(orderedAlien5,446,279);
                OrderedAlien orderedAlien6 = new OrderedAlien();
                addObject(orderedAlien6,82,146);
                OrderedAlien orderedAlien7 = new OrderedAlien();
                addObject(orderedAlien7,192,141);
                OrderedAlien orderedAlien8 = new OrderedAlien();
                addObject(orderedAlien8,297,141);
                OrderedAlien orderedAlien9 = new OrderedAlien();
                addObject(orderedAlien9,400,139);
                OrderedAlien orderedAlien10 = new OrderedAlien();
                addObject(orderedAlien10,488,140);
            }
            if(stage == 2){
                Aliens aliens = new Aliens();
                addObject(aliens, 400, 400);
            }
            if(stage == 3){
                
            }
            if(stage == 4){
                
            }
            if(stage == 5 ){
                OrderedAlien orderedAlien = new OrderedAlien();
                addObject(orderedAlien,107,194);
                OrderedAlien orderedAlien2 = new OrderedAlien();
                addObject(orderedAlien2,171,240);
                OrderedAlien orderedAlien3 = new OrderedAlien();
                addObject(orderedAlien3,239,281);
                OrderedAlien orderedAlien4 = new OrderedAlien();
                addObject(orderedAlien4,304,332);
                OrderedAlien orderedAlien5 = new OrderedAlien();
                addObject(orderedAlien5,392,277);
                OrderedAlien orderedAlien6 = new OrderedAlien();
                addObject(orderedAlien6,463,236);
                OrderedAlien orderedAlien7 = new OrderedAlien();
                addObject(orderedAlien7,524,181);
                Aliens aliens = new Aliens();
                addObject(aliens,243,191);
                Aliens aliens2 = new Aliens();
                addObject(aliens2,399,187);
                Aliens aliens3 = new Aliens();
                addObject(aliens3,77,431);
                Aliens aliens4 = new Aliens();
                addObject(aliens4,518,427);
                AlienBoss alienBoss = new AlienBoss(3, 3, 1000, 2);
                addObject(alienBoss,316,184);
            }
            if(stage == 6){
            
            }
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
      
   

