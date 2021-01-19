import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starting World, here the Levels are chosen
 * 
 * @author GCS 
 * @version 1.0
 */
public class MyWorld extends World
{
    //How many moves are needed to get to the goal, here the goal is a Level
    private int movesNeeded;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        // Set the moves needed to 42
        movesNeeded = 42;
        prepareMain();        
    }
    //Preparing the Main World
    private void prepareMain() {
        //Adding all the needed Actors
        player player = new player();
        addObject(player, 15, 585);
        level1 level1 = new level1();
        addObject(level1,150, 15);
        showText("Level 1", 150, 45);
    }
    //Method to Subtract a Step every time the Player moves
    public void subtractStep(int amount) {
        movesNeeded = movesNeeded-amount;
        //If theres no moves left, the game stops
        if(movesNeeded == 0){
            showText("You have no more moves idiot", 300, 300);
            Greenfoot.stop();        
        }
        //Showing the moves the player has left in the top left corner
        showText("Moves left: " + movesNeeded, 65, 15);
    }
    //Method to reset the moves left back to 42
    public void resetSteps() {
        movesNeeded = 42;
    }
}