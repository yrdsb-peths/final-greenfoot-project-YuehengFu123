 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Main world
 * Yueheng Fu
 * January 2024
 */
public class MyWorld extends World
{
  int stage = 0;
  // stage/ level number
  int h = 3;
  // starting health amount
  public int score = 0;
  Label scoreLabel;
  // score label
  Label healthLabel;
  // health label
  Spaceship spaceship = new Spaceship();
  // main ship
  Heart heart = new Heart(3);
  // heart icon 
 
  GifImage gifImage = new GifImage("galaxyBackground.gif");
  // background initialization
  GreenfootSound backTrack = new GreenfootSound("backTrack.mp3");
  
    
          

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld(int h)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1, false);
        this.h = h;
        addObject(spaceship, 300, 700);
        
        healthLabel = new Label(0, 60);
        healthLabel.setValue(h);
        // adding health label
        scoreLabel = new Label(0, 40);
        scoreLabel.setValue(score);
        // adding score label
        addObject(healthLabel, 30, 30);
        addObject(scoreLabel, 40, 80);
        
        addObject(heart,88,30);
        //adding heart
        
        backTrack.setVolume(40);
        backTrack.play();
    }
    public void act()
    {
        setBackground(gifImage.getCurrentImage());
        // making background move
        if(h == 2){
            
            heart.secondLife();
        }
        if(h == 1){
            
            heart.lastLife();
        }
        if(h == 0){
            
            EndScreen gameWorld = new EndScreen(score, stage);
            backTrack.stop();
            Greenfoot.setWorld(gameWorld);
            
  
        }
        if(getObjects(Aliens.class).size() == 0 &&
        getObjects(AlienBoss.class).size() == 0 &&
        getObjects(OrderedAlien.class).size() ==0 && 
        getObjects(FinalBoss.class).size() ==0 && 
        getObjects(AlienShooter.class).size()
        == 0){
            stage+=1;
            if(stage == 1){
                
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
                spaceship.reset();
                Aliens aliens = new Aliens();
                addObject(aliens, 400, 400);
                Aliens aliens1 = new Aliens();
                addObject(aliens1,242,219);
                Aliens aliens2 = new Aliens();
                addObject(aliens2,295,218);
            }
            if(stage == 3){
                spaceship.reset();
                OrderedAlien orderedAlien = new OrderedAlien();
                addObject(orderedAlien,112,199);
                OrderedAlien orderedAlien2 = new OrderedAlien();
                addObject(orderedAlien2,107,255);
                OrderedAlien orderedAlien3 = new OrderedAlien();
                addObject(orderedAlien3,112,322);
                OrderedAlien orderedAlien4 = new OrderedAlien();
                addObject(orderedAlien4,205,380);
                OrderedAlien orderedAlien5 = new OrderedAlien();
                addObject(orderedAlien5,330,385);
                OrderedAlien orderedAlien6 = new OrderedAlien();
                addObject(orderedAlien6,459,384);
                OrderedAlien orderedAlien7 = new OrderedAlien();
                addObject(orderedAlien7,524,326);
                OrderedAlien orderedAlien8 = new OrderedAlien();
                addObject(orderedAlien8,522,264);
                OrderedAlien orderedAlien9 = new OrderedAlien();
                addObject(orderedAlien9,504,184);
                OrderedAlien orderedAlien10 = new OrderedAlien();
                addObject(orderedAlien10,52,540);
                OrderedAlien orderedAlien11 = new OrderedAlien();
                addObject(orderedAlien11,166,550);
                OrderedAlien orderedAlien12 = new OrderedAlien();
                addObject(orderedAlien12,281,553);
                OrderedAlien orderedAlien13 = new OrderedAlien();
                addObject(orderedAlien13,411,558);
                Aliens aliens = new Aliens();
                addObject(aliens,220,289);
                Aliens aliens2 = new Aliens();
                addObject(aliens2,311,298);
                Aliens aliens3 = new Aliens();
                addObject(aliens3,392,302);        
        
                Aliens aliens4 = new Aliens();
                addObject(aliens4,60,52);
                Aliens aliens5 = new Aliens();
                addObject(aliens5,294,51);
                Aliens aliens6 = new Aliens();
                addObject(aliens6,522,38);
                orderedAlien13.setLocation(487,550);
                orderedAlien12.setLocation(320,549);
                orderedAlien11.setLocation(201,556);
                orderedAlien10.setLocation(315,462);
            }
            if(stage == 4){
                spaceship.reset();
                OrderedAlien orderedAlien = new OrderedAlien();
                addObject(orderedAlien,55,471);
                OrderedAlien orderedAlien2 = new OrderedAlien();
                addObject(orderedAlien2,146,476);
                OrderedAlien orderedAlien3 = new OrderedAlien();
                addObject(orderedAlien3,228,481);
                OrderedAlien orderedAlien4 = new OrderedAlien();
                addObject(orderedAlien4,319,486);
                OrderedAlien orderedAlien5 = new OrderedAlien();
                addObject(orderedAlien5,408,480);
                OrderedAlien orderedAlien6 = new OrderedAlien();
                addObject(orderedAlien6,513,481);
                OrderedAlien orderedAlien7 = new OrderedAlien();
                addObject(orderedAlien7,71,98);
                OrderedAlien orderedAlien8 = new OrderedAlien();
                addObject(orderedAlien8,171,175);
                OrderedAlien orderedAlien9 = new OrderedAlien();
                addObject(orderedAlien9,281,398);
                OrderedAlien orderedAlien10 = new OrderedAlien();
                addObject(orderedAlien10,418,180);
                OrderedAlien orderedAlien11 = new OrderedAlien();
                addObject(orderedAlien11,547,82);
                OrderedAlien orderedAlien12 = new OrderedAlien();
                addObject(orderedAlien12,284,281);
                Aliens aliens = new Aliens();
                addObject(aliens,207,65);
                Aliens aliens2 = new Aliens();
                addObject(aliens2,386,74);
                Aliens aliens3 = new Aliens();
                addObject(aliens3,278,186);
                Aliens aliens4 = new Aliens();
                addObject(aliens4,45,283);
              
        
                orderedAlien4.setLocation(559,554);
                orderedAlien3.setLocation(23,559);
                AlienShooter alienShooter = new AlienShooter();
                addObject(alienShooter,132,371);
                AlienShooter alienShooter2 = new AlienShooter();
                addObject(alienShooter2,472,379);
                orderedAlien6.setLocation(554,480);
                orderedAlien5.setLocation(455,474);
            }
            if(stage == 5 ){
                spaceship.reset();
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
                AlienBoss alienBoss = new AlienBoss(5, 3, 1000, 2);
                addObject(alienBoss,316,184);
            }
            
            if(stage == 6){
                spaceship.reset();
                AlienShooter alienShooter = new AlienShooter();
                addObject(alienShooter,117,333);
                AlienShooter alienShooter2 = new AlienShooter();
                addObject(alienShooter2,472,329);
                OrderedAlien orderedAlien = new OrderedAlien();
                addObject(orderedAlien,284,509);
                OrderedAlien orderedAlien2 = new OrderedAlien();
                addObject(orderedAlien2,229,409);
                OrderedAlien orderedAlien3 = new OrderedAlien();
                addObject(orderedAlien3,374,408);
                OrderedAlien orderedAlien4 = new OrderedAlien();
                addObject(orderedAlien4,184,330);
                alienShooter2.setLocation(508,340);
                alienShooter.setLocation(56,323);
                OrderedAlien orderedAlien5 = new OrderedAlien();
                addObject(orderedAlien5,436,322);
                OrderedAlien orderedAlien6 = new OrderedAlien();
                addObject(orderedAlien6,89,412);
                OrderedAlien orderedAlien7 = new OrderedAlien();
                addObject(orderedAlien7,504,409);
                Aliens aliens = new Aliens();
                addObject(aliens,161,371);
                Aliens aliens2 = new Aliens();
                addObject(aliens2,439,369);
                Aliens aliens3 = new Aliens();
                addObject(aliens3,197,213);
                Aliens aliens4 = new Aliens();
                addObject(aliens4,322,212);
                Aliens aliens5 = new Aliens();
                addObject(aliens5,440,207);
                Aliens aliens6 = new Aliens();
                addObject(aliens6,303,316);
                OrderedAlien orderedAlien8 = new OrderedAlien();
                addObject(orderedAlien8,50,487);
                OrderedAlien orderedAlien9 = new OrderedAlien();
                addObject(orderedAlien9,564,510);
                AlienShooter alienShooter3 = new AlienShooter();
                addObject(alienShooter3,328,46);
                AlienShooter alienShooter4 = new AlienShooter();
                addObject(alienShooter4,206,128);
                AlienShooter alienShooter5 = new AlienShooter();
                addObject(alienShooter5,329,117);
                AlienShooter alienShooter6 = new AlienShooter();
                addObject(alienShooter6,418,116);
        
                alienShooter5.setLocation(41,54);
                alienShooter3.setLocation(571,19);
                alienShooter4.setLocation(119,125);
                alienShooter6.setLocation(506,94);
                alienShooter4.setLocation(127,121);
                alienShooter6.setLocation(509,91);
            }
            if(stage == 7){
                
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
            if(stage == 8){
                EndScreen gameWorld = new EndScreen(score, stage);
                backTrack.stop();
                Greenfoot.setWorld(gameWorld);
            }
        }
    }
    public void decreaseHealth(){
      h-=1;
      healthLabel.setValue(h);
      
    }
     public void increaseScore(int s)
    {
     score+=s;
     scoreLabel.setValue(score);
    }

} 
      
   

