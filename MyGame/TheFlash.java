import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TheFlash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheFlash extends World
{

    /**
     * Constructor for objects of class TheFlash.
     * 
     */
    public TheFlash()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
     

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ground ground = new ground();
        addObject(ground,63,535);
        ground ground2 = new ground();
        addObject(ground2,188,535);
        ground ground3 = new ground();
        addObject(ground3,314,535);
        ground ground4 = new ground();
        addObject(ground4,438,535);
        ground ground5 = new ground();
        addObject(ground5,563,535);
        ground ground6 = new ground();
        addObject(ground6,690,535);
        ground ground7 = new ground();
        addObject(ground7,799,535);
    }
}
