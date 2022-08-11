import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Surface here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Surface extends Actor
{
    Random rand = new Random();
    float velocity = -1;
    /**
     * Act - do whatever the Surface wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        World w = getWorld();
        int casting = (int) velocity;
        // Add your action code here.
        move(casting);
        if (isAtEdge()){
            setLocation(1000, getY());
        }
    }
}
