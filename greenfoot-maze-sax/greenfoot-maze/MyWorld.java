import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int movesNeeded;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        movesNeeded = 42;
        prepareMain();        
    }
    private void prepareMain() {
    player player = new player();
        addObject(player, 15, 585);
        level1 level1 = new level1();
        addObject(level1,150, 15);        
    }
    public void resetSteps() {
        movesNeeded = 42;
    }
    public void subtractStep(int amount) {
        movesNeeded = movesNeeded-amount;
        if(movesNeeded == 0){
            showText("You have no more moves idiot", 300, 300);
            Greenfoot.stop();        
        }
        showText("Moves left: " + movesNeeded, 65, 15);
    }
}