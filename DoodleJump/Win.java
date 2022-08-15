import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends Actor
{
    /**
     * Act - do whatever the Win wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        getWorld().removeObjects(getWorld().getObjects(Surface.class));
        getWorld().removeObjects(getWorld().getObjects(TeddyBears.class));
        getWorld().removeObjects(getWorld().getObjects(Linux.class));
        getWorld().removeObjects(getWorld().getObjects(CocodrileBoss.class));
        getWorld().removeObjects(getWorld().getObjects(Spider.class));
    }
}
