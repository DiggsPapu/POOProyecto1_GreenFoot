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
        //Mantiene una velocidad constante 
        move(7);
        // Destruye las clases arania y a si mismo.
        if(isTouching(Spider.class)){
            removeTouching(Spider.class);
            World world = getWorld();
            Background wrld = (Background) world;
            Counter counter = wrld.returnCounter();
            wrld.enemyCount = wrld.enemyCount -1;
            counter.addScore();
        }
        // Si toca al cocodrilo solo aumenta el score.
        else if (isTouching(CocodrileBoss.class)){
            World world = getWorld();
            Background wrld = (Background) world;
            Counter counter = wrld.returnCounter();
            counter.addScore();
        }
        //Se elimina el objeto si esta en el borde
        else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
