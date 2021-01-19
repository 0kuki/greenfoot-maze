import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The player that can be moved around and needs to go to the goal in order to win
 * 
 * @author GCS 
 * @version 1.0
 */
public class player extends Actor
{
    /**
     * The actor Method checks for a key being pressed and if the
     * player is touching the goal to load Level 1
     */
    public void act() 
    {
        //Checking for key pressing
        checkKeyPress();
        //Check if the player is touching Level 1
        touchingLvl1();
    }
    //Method to check if any key is being pressed
    private void checkKeyPress()
    {
        //If the Key is pressed, set the new Location in the direction pressed
        if (Greenfoot.isKeyDown("d")) 
        {
            if(getX()+30 < 600){
            setLocation(getX()+30, getY());
            MyWorld level = (MyWorld)getWorld();
            level.subtractStep(1);
            } 
            touchingWall();
            Greenfoot.delay(10);
        }
        //If the Key is pressed, set the new Location in the direction pressed
        if (Greenfoot.isKeyDown("w")) 
        {
            if(getY()-30 > 0){
            setLocation(getX(), getY()-30);
            MyWorld level = (MyWorld)getWorld();
            level.subtractStep(1);
            }
            touchingWall();
            Greenfoot.delay(10);
        }
        //If the Key is pressed, set the new Location in the direction pressed
        if (Greenfoot.isKeyDown("a")) 
        {
            if(getX()-30 > 0){
            setLocation(getX()-30, getY());
            MyWorld level = (MyWorld)getWorld();
            level.subtractStep(1);
            } 
            touchingWall();
            Greenfoot.delay(10);
        }
        //If the Key is pressed, set the new Location in the direction pressed
        if (Greenfoot.isKeyDown("s")) 
        {
            if(getY()+30 < 600){
            setLocation(getX(), getY()+30);
            MyWorld level = (MyWorld)getWorld();
            level.subtractStep(1);
            }
            touchingWall();
            Greenfoot.delay(10);
        }
    }   
    //Method to check if player is touching the wall
    public void touchingWall() 
    {
      //If its either touching a horizontal or vertial wall
      if(isTouching(shortWallH.class) || isTouching(shortWallV.class)){
            //Reset player back to start
            setLocation(15, 585);
            lvl1 level = (lvl1)getWorld();
            level.resetSteps();
        } 
    }
    //Method to check if player is touching the first level
    public void touchingLvl1() 
    {
      //If player touches first level, load the new world and start the level
      if(isTouching(level1.class)){ 
            Greenfoot.setWorld(new lvl1());
        } 
    }
}
