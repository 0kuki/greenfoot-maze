import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The first Level. A Maze which is pretty easy.
 * 
 * @author GCS 
 * @version 1.0
 */
public class lvl1 extends World
{
    //How many moves are needed to get to the goal, here the goal is a Level
    private int movesNeeded;
    /**
     * Constructor for objects of class lvl1.
     * 
     */
    public lvl1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        // Set the moves needed to 42
        movesNeeded = 42;
        prepare();
        
    }
    //Preparing the first Level
    public void prepare()
    { 
        //Adding all the needed Actors
        shortWallH sWH = new shortWallH();
        addObject(sWH, 15, 45);
        shortWallH shortWallH2 = new shortWallH();
        addObject(shortWallH2,165,135);
        shortWallH shortWallH3 = new shortWallH();
        addObject(shortWallH3,165,225);
        shortWallH shortWallH4 = new shortWallH();
        addObject(shortWallH4,105,225);
        shortWallH shortWallH5 = new shortWallH();
        addObject(shortWallH5,465,225);
        shortWallH shortWallH6 = new shortWallH();
        addObject(shortWallH6,375,165);
        shortWallH shortWallH7 = new shortWallH();
        addObject(shortWallH7,285,345);
        shortWallH shortWallH8 = new shortWallH();
        addObject(shortWallH8,165,435);
        shortWallH shortWallH9 = new shortWallH();
        addObject(shortWallH9,195,375);
        shortWallH shortWallH10 = new shortWallH();
        addObject(shortWallH10,225,225);
        shortWallH shortWallH11 = new shortWallH();
        addObject(shortWallH11,225,105);
        shortWallH shortWallH12 = new shortWallH();
        addObject(shortWallH12,45,345);
        shortWallH shortWallH13 = new shortWallH();
        addObject(shortWallH13,135,375);
        shortWallH shortWallH14 = new shortWallH();
        addObject(shortWallH14,465,525);
        shortWallH shortWallH15 = new shortWallH();
        addObject(shortWallH15,435,495);
        shortWallH shortWallH16 = new shortWallH();
        addObject(shortWallH16,465,405);
        shortWallH shortWallH17 = new shortWallH();
        addObject(shortWallH17,555,525);
        shortWallH shortWallH18 = new shortWallH();
        addObject(shortWallH18,555,135);
        shortWallH shortWallH19 = new shortWallH();
        addObject(shortWallH19,315,105);
        shortWallH shortWallH20 = new shortWallH();
        addObject(shortWallH20,375,345);
        shortWallH shortWallH21 = new shortWallH();
        addObject(shortWallH21,285,495);
        shortWallV shortWallV = new shortWallV();
        addObject(shortWallV,255,465);
        shortWallV shortWallV2 = new shortWallV();
        addObject(shortWallV2,75,405);
        shortWallV shortWallV3 = new shortWallV();
        addObject(shortWallV3,75,255);
        shortWallV shortWallV4 = new shortWallV();
        addObject(shortWallV4,130,105);
        shortWallV shortWallV5 = new shortWallV();
        addObject(shortWallV5,345,405);
        shortWallV shortWallV6 = new shortWallV();
        addObject(shortWallV6,315,165);
        shortWallV shortWallV7 = new shortWallV();
        addObject(shortWallV7,75,45);
        shortWallV shortWallV8 = new shortWallV();
        addObject(shortWallV8,45,195);
        shortWallV shortWallV9 = new shortWallV();
        addObject(shortWallV9,75,135);
        shortWallV shortWallV10 = new shortWallV();
        addObject(shortWallV10,120,465);
        shortWallV shortWallV11 = new shortWallV();
        addObject(shortWallV11,45,465);
        shortWallV shortWallV12 = new shortWallV();
        addObject(shortWallV12,80,525);
        shortWallV shortWallV13 = new shortWallV();
        addObject(shortWallV13,135,555);
        shortWallV shortWallV14 = new shortWallV();
        addObject(shortWallV14,255,285);
        shortWallV shortWallV15 = new shortWallV();
        addObject(shortWallV15,225,315);
        shortWallV shortWallV16 = new shortWallV();
        addObject(shortWallV16,495,285);
        shortWallV shortWallV17 = new shortWallV();
        addObject(shortWallV17,405,285);
        shortWallV shortWallV18 = new shortWallV();
        addObject(shortWallV18,415,375);
        shortWallV shortWallV19 = new shortWallV();
        addObject(shortWallV19,435,135);
        shortWallV shortWallV20 = new shortWallV();
        addObject(shortWallV20,345,75);
        shortWallV shortWallV21 = new shortWallV();
        addObject(shortWallV21,195,45);
        shortWallV shortWallV22 = new shortWallV();
        addObject(shortWallV22,315,555);
        shortWallV shortWallV23 = new shortWallV();
        addObject(shortWallV23,375,495);
        shortWallV shortWallV24 = new shortWallV();
        addObject(shortWallV24,525,375);
        shortWallV shortWallV25 = new shortWallV();
        addObject(shortWallV25,195,525);
        //Adding one goal and one player
        goal goal = new goal();
        addObject(goal,585, 15);
        playerlvl1 playerlvl1 = new playerlvl1();
        addObject(playerlvl1, 15, 585);
        showText("Moves left: " + movesNeeded, 65, 15);
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
