import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CocodrileBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CocodrileBoss extends Actor
{
    public int health = 100;
    /**
     * Act - do whatever the CocodrileBoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(1000)<1) {
            shooter();
        }
        if (isTouching(TeddyBears.class) && this.health>0){
            this.health = this.health - 1;
            removeTouching(TeddyBears.class);
            
        }
        else if (this.health<=0){
             getWorld().addObject(new Win(), 500,500);
        }
    }
    /**
     * El gefe dispara aranias
     */
    public void shooter(){
        getWorld().addObject(new Spider(), getX(), getY());
    }
}
