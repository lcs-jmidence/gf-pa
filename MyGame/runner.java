import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class runner extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;

    public runner()
    {
        image1 = new GreenfootImage("koala_walk02.png");
        image2 = new GreenfootImage("koala_walk01.png");
        setImage(image1);

    }

    /**
     * Act - do whatever the runner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Movement();
        if (getImage()==image1)
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
        //gravity--;
        //setLocation(getX(), getY() - gravity);
        //CheckForJump();
    }    

    // instance field
    private int gravity;
    public void Movement()
    {
        if (Greenfoot.isKeyDown("left")) 
        {
            move(-6);
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            move(6);
        }
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+6);
        }
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-6);
        }
    }
    //public void CheckForJump()
    {
        //if ( isTouching(ground.class) )
        {
            //if (Greenfoot.isKeyDown("space"))
            {
                //gravity = -20;
            }
        }
    }
}
