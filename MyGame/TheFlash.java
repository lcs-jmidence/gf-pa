import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class TheFlash extends World
{

    /**
     * Constructor: Set up the starting objects.
     */
    public TheFlash()
    {    
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Create new floating objects at irregular intervals.
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(10) < 4)
        {
            addObject(new ground(), 799, 540);
        }
    }
    
    /**
     * Prepare the world for the start of the program. In this case: Create
     * a white blood cell and the lining at the edge of the blood stream.
     */
    private void prepare()
    {
        ground ground = new ground();
        addObject(ground,63,540);
        ground ground2 = new ground();
        addObject(ground2,188,540);
        ground ground3 = new ground();
        addObject(ground3,314,540);
        ground ground4 = new ground();
        addObject(ground4,438,540);
        ground ground5 = new ground();
        addObject(ground5,563,540);
        ground ground6 = new ground();
        addObject(ground6,690,540);
        ground ground7 = new ground();
        addObject(ground7,799,540);
    }
}
