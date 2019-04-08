import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Death here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Death extends Actor
{
    /**
     * Act - do whatever the Death wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        KillRunner();
        setLocation(getX()-5, getY());
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }
    public void KillRunner()
    {
        if ( isTouching(runner.class) ) 
        {
          Greenfoot.stop();
        }
    }
}
