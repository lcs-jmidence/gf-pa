import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TheFlash extends World
{
    private boolean FirstTimeRun;
    public boolean GameOn;

    /**
     * Constructor: Set up the starting objects.
     */
    public TheFlash()
    {    
        super(800, 600, 1); 
        prepare();
        setPaintOrder(runner.class, ground.class);
        FirstTimeRun = true;
        GameOn = false;
    }

    /**
     * Create new floating objects at irregular intervals.
     */
    public void act()
    {
        LookForGameStart();
        if (FirstTimeRun)
        {
            HowToPlay();
        }
        else if (GameOn)
        {
            TrackScore();
            AddObjects();
        }
    }

    public boolean isGameOn()
    {
        return GameOn;
    }

    private void AddObjects()
    {
        if (Greenfoot.getRandomNumber(10) < 5)
        {
            addObject(new ground(), 799, 540);
        }
        if (Greenfoot.getRandomNumber(100) < 0.95)
        {
            addObject(new Death(), 799, Greenfoot.getRandomNumber(180)+270);
        }
    }

    private void LookForGameStart()
    {
        if (Greenfoot.isKeyDown("up") && !GameOn)
        {
            StartGame();
        }
    }

    private void StartGame()
    {
        FirstTimeRun = false;
        GameOn = true;
        HideHowToPlay();
    }

    private void TrackScore()
    {

    }

    private void HowToPlay()
    {
        showText("Welcome to Koala Jump", 400, 100);
        showText("Use arrows for movement and space to jump", 400, 200);
        showText("Don't touch the red diamonds", 400, 300);
        showText("Press Up Arrow to begin.", 400, 400);
    }
    
    private void HideHowToPlay()
    {
        showText("", 400, 100);
        showText("", 400, 200);
        showText("", 400, 300);
        showText("", 400, 400);
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
        runner runner = new runner();
        addObject(runner,50,430);
    }
}
