import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Linux extends Actor
{
    /**
     * Son atributos del ant.
     */
        private int speed=7;
        private int vSpeed = 0;
        private int acceleration = 2;
        public boolean canFire = true;
        
   
    /**
     * Act - do whatever the Ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Se chequean los botones horizontales
        checkHorizontalKeys();
        if (isTouching(Surface.class)){
                checkAllKeys();
            }
            //Si esta en algun borde entonces pierde la partida
        else if (isAtEdge()){
            getWorld().addObject(new Lose(), 500, 250);
        }
            //Gravedad
        else{
           fall(); 
        }
        
        
    }
    /**
     * revisar todos los botones de movimiento
     */
    private void checkAllKeys(){
        if (Greenfoot.isKeyDown("left")){
            setLocation( getX()-6, getY());
            
        }else if (Greenfoot.isKeyDown("right")){
            setLocation( getX()+6, getY());
            
        }else if (Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+500); 
            
        }else if (Greenfoot.isKeyDown("Up")){
            
            setLocation( getX(), getY()-200);
        }else if (isAtEdge()){
             getWorld().addObject(new Lose(), 500, 250);
             
        }
        fire();
    }
    /**
     * Chequear las teclas horizontales
     */
    private void checkHorizontalKeys(){
        if (Greenfoot.isKeyDown("right")){
            setLocation( getX()+4, getY());
            
        }else if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-4, getY()); 
    }else if (Greenfoot.isKeyDown("down")){
        setLocation(getX(), getY()+4);
    }else if (isAtEdge()){
        getWorld().addObject(new Lose(), 500, 250);
    }
    
    fire();
}    
    /**
     * Caer como en gravedad
     */
    public void fall(){
        setLocation( getX(), getY()+2);
        vSpeed = vSpeed+acceleration;
    }
    /**
     * Disparar, sirve para disparar osos de peluche
     */
    public void fire(){
        if (Greenfoot.isKeyDown("space") && canFire==true){
            getWorld().addObject(new TeddyBears(), getX(), getY());
            canFire = false;
        }
        else if (!Greenfoot.isKeyDown("space") ){
            canFire = true;
        }
    }
}
