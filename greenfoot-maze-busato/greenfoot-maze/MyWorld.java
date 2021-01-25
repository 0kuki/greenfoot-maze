import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starting World, here the Levels are chosen
 * 
 * @author GCS 
 * @version 1.0
 */
public class MyWorld extends World
{
    //How many moves are allowed to get to the goal, here the goal is a portal
    private int movesNeeded;
    //Constructor for objects of class level1
    public MyWorld()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        // Set the moves allowed to 42
        movesNeeded = 42;
        prepareMain();        
    }
    //Preparing the Main World
    private void prepareMain() {
        //Preparing Actors
        
        //player
        player player = new player();
        addObject(player, 15, 585);
        
        //Portal 1
        portal1 portal1 = new portal1();
        addObject(portal1,286, 197);
        showText("Level 1", 286, 225);
        
        //Portal 2
        portal2 portal2 = new portal2();
        addObject(portal2,495, 108);
        showText("Level 2", 495, 135);
    }
    //"Counting steps" backwards until left with Zero
    public void subtractStep(int amount) {
        movesNeeded = movesNeeded-amount;
        //If there are no moves left, the game stops
        if(movesNeeded == 0){
            showText("You have no more moves idiot", 300, 300);
            Greenfoot.stop();        
        }
        //Displaying moves left in top left corner
        showText("Moves left: " + movesNeeded, 65, 15);
    }
    //reset the moves left back to 42
    public void resetSteps() {
        movesNeeded = 42;
    }
}