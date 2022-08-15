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
        //Se castea o se utiliza un surname para llamar al world.
        World w = getWorld();
        int casting = (int) velocity;
        // se castea y se mueve a cierta velocidad
        move(casting);
        //Se pone de nuevo en el inicio en caso de que este en el borde.
        if (isAtEdge()){
            
            setLocation(rand.nextInt(1100), -600);
        }
        else if (isTouching(TeddyBears.class)){
            removeTouching(TeddyBears.class);
        }
        // En el caso de que toque al jugador o la superficie se elimina.
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
