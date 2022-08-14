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
    /**
     * Atributos de la superficie
     */
    Random rand = new Random();
    float velocity = -1;
    /**
     * El acto que realiza la superficie
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
