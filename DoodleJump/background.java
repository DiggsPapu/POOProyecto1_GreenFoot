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
        //llama al metodo para preparar el mundo
        prepare();
        
    }
    /**
     * Para realizar las acciones del background
     */
    public void act(){
        // En el caso de que la cantidad de enemigos activos sea menor que 3, se add un enemigo
        if (enemyCount<3){
            addEnemy();
        }
        //En el caso de que suceda se add una superficie.
        if (Greenfoot.getRandomNumber(100)<1){
            addSurface1();
        }
        //En el caso de que sea menor puntaje que 111 entonces se agregan enemigos cada vez que de 0
        if(Greenfoot.getRandomNumber(500)<1 && counter.score <111){
            addEnemy();
        }
        //En el casso de que el puntaje sea 111 se add el gefe
        else if (counter.score  == 111 ){
            addBoss();
        }
        //Si se ha add el gefe se incrementa la velocidad con que se add enemigos.
        else if (counter.score >111 && Greenfoot.getRandomNumber(250)<1){
            addEnemy();
        }
        //Si pasa de los 500 entonces se incrementara la cantidad de superficies en las que puede estar
        else if (counter.score>500 && Greenfoot.getRandomNumber(50)<1){
            addSurface2();
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
     * Aniadir superficie1
     */
    public void addSurface1(){
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
     * Aniadir superficie2
     */
    public void addSurface2(){
        addObject(new Surface(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(550));
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
