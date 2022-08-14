import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Atributo de score
     */
    public int score = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(new GreenfootImage("Score: " + score, 50, Color.BLACK, Color.WHITE));
    }
    /**
     * Sumarle puntos al score
     */
    public void addScore(){
        score +=10;
    }
}
