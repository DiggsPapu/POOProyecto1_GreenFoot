import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    /**
     * Atributos del background
     */
    public int enemyCount = 3;
    public CocodrileBoss boss;
    public Counter counter = new Counter();
    /**
     * Constructor for objects of class background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        
    }
    /**
     * Para realizar las acciones del background
     */
    public void act(){
        if (enemyCount<3){
            addEnemy();
        }
        
        if (Greenfoot.getRandomNumber(100)<1){
            addSurface();
        }
        if(Greenfoot.getRandomNumber(500)<1 && counter.score <111){
            addEnemy();
        }
        else if (counter.score  == 111 ){
            addBoss();
        }
        else if (counter.score >111 && Greenfoot.getRandomNumber(250)<1){
            addEnemy();
        }
    }
    /**
     * Aniadir enemigos
     */
    public void addEnemy(){
        addObject(new Spider(), Greenfoot.getRandomNumber(1100), -600);
        enemyCount +=1;
    }
    /**
     * Add Gefe
     */
    public void addBoss(){
        boss = new CocodrileBoss();
        addObject(boss, 500, -500);
        enemyCount +=1;
    }
    /**
     * Aniadir superficie
     */
    public void addSurface(){
        addObject(new Surface(), Greenfoot.getRandomNumber(500)+600, 550);
    }
    /**
     * getter del counter
     */
    public Counter returnCounter(){
        return counter;
    }
    /**
     * getter de la cantidad de enemigos
     */
    public int getEnemyCount(){
        return enemyCount;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Surface surface = new Surface();
        addObject(surface,75,555);
        Surface surface2 = new Surface();
        addObject(surface2,188,556);
        Surface surface3 = new Surface();
        addObject(surface3,308,556);
        Surface surface4 = new Surface();
        addObject(surface4,418,562);
        surface.setLocation(97,496);
        surface2.setLocation(191,486);
        surface3.setLocation(293,479);
        surface4.setLocation(422,487);
        Surface surface5 = new Surface();
        addObject(surface5,551,493);
        Surface surface6 = new Surface();
        addObject(surface6,678,498);
        Surface surface7 = new Surface();
        addObject(surface7,817,500);
        Surface surface8 = new Surface();
        addObject(surface8,944,490);
        Linux linux = new Linux();
        addObject(linux,447,450);
        Spider spider = new Spider();
        addObject(spider,426,29);
        Spider spider2 = new Spider();
        addObject(spider2,483,27);
        Spider spider3 = new Spider();
        addObject(spider3,461,51);
        addObject(counter,107,51);
    }
}
