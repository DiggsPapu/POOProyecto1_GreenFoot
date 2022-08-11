import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TeddyBears here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeddyBears extends Actor
{
    public TeddyBears(){
        setRotation(270);
        
    }
    /**
     * Act - do whatever the TeddyBears wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        if(isTouching(Spider.class)){
            removeTouching(Spider.class);
            World world = getWorld();
            background wrld = (background) world;
            Counter counter = wrld.returnCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
