import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkKeyPress();
        touchingWall();
        win();
    }
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("d")) 
        {
            if(getX()+30 < 600){
            setLocation(getX()+30, getY());
            }
            MyWorld level = (MyWorld)getWorld();
            level.subtractStep();
            Greenfoot.delay(10);
        }
        
        if (Greenfoot.isKeyDown("w")) 
        {
            if(getY()-30 > 0){
            setLocation(getX(), getY()-30);
            }
            MyWorld level = (MyWorld)getWorld();
            level.subtractStep();
            Greenfoot.delay(10);
        }
        if (Greenfoot.isKeyDown("a")) 
        {
            if(getX()-30 > 0){
            setLocation(getX()-30, getY());
            }
            MyWorld level = (MyWorld)getWorld();
            level.subtractStep();
            Greenfoot.delay(10);
        }
        
        if (Greenfoot.isKeyDown("s")) 
        {
            if(getY()+30 < 600){
            setLocation(getX(), getY()+30);
            }
            MyWorld level = (MyWorld)getWorld();
            level.subtractStep();
            Greenfoot.delay(10);
        }
    }   
    public void touchingWall() 
    {
      if(isTouching(shortWallH.class) || isTouching(shortWallV.class)){            
            setLocation(15, 585);
        } 
    }
    public void win()
    {
      if(isTouching(goal.class)){
            Greenfoot.stop();
        }
    }
}
