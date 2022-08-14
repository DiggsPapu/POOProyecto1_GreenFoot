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
    /**
     * Atributos del enemigo
     */
    Random rand = new Random();
    float velocity = 4;
    /**
     * Constructor de las aranias y la imagen gira 270 grados 
     */
    public Spider(){
        setRotation(-270);
    }
    /**
     * Caer por gravedad
     */
    public void fall(){
        setLocation( getX(), getY());
    }
    /**
     * Accion para lo que realiza la arania
     */
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
            if (isTouching(Linux.class)){
                removeTouching(Linux.class);
                getWorld().addObject(new Lose(), 500, 500);
            } else if (isTouching(Surface.class)){
                removeTouching(Surface.class);
            }
        }
    }
    
}
