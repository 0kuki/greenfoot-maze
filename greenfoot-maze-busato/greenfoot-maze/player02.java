
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The player that can be moved around and needs to go to the goal in order to win
 * 
 * @author GCS
 * @version 1.0
 */
public class player02 extends Actor
{
    /**
     * The actor Method checks for a key being pressed and if the
     * player is touching the goal for Level 1
     */
    public void act() 
    {
        //Checking for key pressing
        checkKeyPress();
        //Check if the player is touching Level 1
        win();
    }
    //Method to check if any key is being pressed
    private void checkKeyPress()
    {
        //If Key "d" is pressed, move towards that direction
        if (Greenfoot.isKeyDown("d")) 
        {
            if(getX()+30 < 600){
            setLocation(getX()+30, getY());
            level2 level = (level2)getWorld();
            level.subtractStep(1);
            } 
            touchingWall();
            Greenfoot.delay(10);
        }
        //If Key "w" is pressed, move towards that direction
        if (Greenfoot.isKeyDown("w")) 
        {
           if(getY()-30 > 0){
               setLocation(getX(), getY()-30);
               level2 level = (level2)getWorld();
               level.subtractStep(1);
            }
            touchingWall();
            Greenfoot.delay(10);
        }
        //If Key "a" is pressed, move towards that direction
        if (Greenfoot.isKeyDown("a")) 
        {
            if(getX()-30 > 0){
            setLocation(getX()-30, getY());
            level2 level = (level2)getWorld();
            level.subtractStep(1);
            } 
            touchingWall();
            Greenfoot.delay(10);
        }
        //If Key "s" is pressed, move towards that direction
        if (Greenfoot.isKeyDown("s")) 
        {
            if(getY()+30 < 600){
            setLocation(getX(), getY()+30);
            level2 level = (level2)getWorld();
            level.subtractStep(1);
            }
            touchingWall();
            Greenfoot.delay(10);
        }
    }
    //Method to check if player is touching the wall
    public void touchingWall() 
    {
      //If either touching a horizontal or vertical wall
      if(isTouching(shortWallH.class) || isTouching(shortWallV.class)){            
          setLocation(15, 585);
          level2 level = (level2)getWorld();
          level.resetSteps();
      } 
    }
    //Method to check if player has entered the goal
    public void win()
    {
      //If the goal is being touched by the player
      if(isTouching(goal.class)){
            //Show the winners text
            level2 level = (level2)getWorld();
            level.showText("Good Job, you cleared the level",300, 300);
            Greenfoot.stop();
        }
    }   
}
