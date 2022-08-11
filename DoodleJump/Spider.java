import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Actor
{
    Random rand = new Random();
    float velocity = 4;
    public Spider(){
        setRotation(-270);
    }
    /**
     * Act - do whatever the Spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void fall(){
        setLocation( getX(), getY());
    }
    public void act()
    {
        World w = getWorld();
        int casting = (int) velocity;
        // Add your action code here.
        move(casting);
        if (isAtEdge()){
            //w.removeObject(this);
            setLocation(rand.nextInt(1100), -600);
        }
        else{
            if (isTouching(Ant.class)){
                removeTouching(Ant.class);
                getWorld().addObject(new Lose(), 500, 500);
            } else if (isTouching(Surface.class)){
                removeTouching(Surface.class);
            }
        }
    }
    
}
