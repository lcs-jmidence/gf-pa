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
    private final int gravity = 1;
    private int velocity;
    public runner()
    {
        image1 = new GreenfootImage("koala_walk02.png");
        image2 = new GreenfootImage("koala_walk01.png");
        setImage(image1);
        velocity = 0;

    }

    /**
     * Act - do whatever the runner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Movement();
        fall();
        if (getImage()==image1)
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }

        if (Greenfoot.isKeyDown("down")) 
        {
            getImage().scale(72, 42);
        } else {
            getImage().scale(72, 102);
        }

        if (isTouching(ground.class))
        {
            setLocation(getX(),  getY() - 6);
        }
        if (Greenfoot.isKeyDown("space") && getY() > getWorld().getHeight() - 180) jump();
    }

    public void fall() 
    {
        setLocation(getX(), getY() + velocity);
        if(getY() > getWorld().getHeight() - 160) velocity = 0;
        else velocity += gravity;
    }

    public void jump()
    {
        velocity = -20;   
    }

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
    }
}
