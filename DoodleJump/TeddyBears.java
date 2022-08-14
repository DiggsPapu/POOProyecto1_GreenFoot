import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TeddyBears here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeddyBears extends Actor
{
    /**
     * Constructor de las balas de peluche
     */
    public TeddyBears(){
        setRotation(270);
        
    }
    /**
     * Actuacion de los teddybears
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
