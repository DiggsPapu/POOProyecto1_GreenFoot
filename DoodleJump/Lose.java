import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lose extends Actor
{
    /**
     * No realiza ningun acto y solo se muestra la pantalla de perdida.
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
