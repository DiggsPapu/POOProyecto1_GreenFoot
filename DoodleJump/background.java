import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{
    public int enemyCount = 3;
    
    public Counter counter = new Counter();
    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        
    }
    public void act(){
        if (enemyCount<3){
            addEnemy();
        }
        if(Greenfoot.getRandomNumber(250)<1){
            addEnemy();
            enemyCount +=1;
        }
    }
    public void addEnemy(){
        addObject(new Spider(), Greenfoot.getRandomNumber(1100), -600);
    }
    public Counter returnCounter(){
        return counter;
    }
    public int getEnemyCount(){
        return enemyCount;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ant ant = new Ant();
        addObject(ant,137,115);
        Spider spider = new Spider();
        addObject(spider,492,110);
        Surface surface = new Surface();
        addObject(surface,419,298);
        Surface surface2 = new Surface();
        addObject(surface2,135,141);
        Surface surface3 = new Surface();
        addObject(surface3,244,207);
        Surface surface4 = new Surface();
        addObject(surface4,406,123);
        spider.setLocation(578,94);
        surface.setLocation(565,347);
        surface4.setLocation(569,37);
        surface3.setLocation(567,199);
        surface2.setLocation(569,280);
        surface3.setLocation(563,150);
        Spider spider2 = new Spider();
        addObject(spider2,587,237);
        surface.setLocation(589,554);
        surface2.setLocation(615,397);
        surface3.setLocation(683,156);
        surface2.setLocation(673,396);
        surface.setLocation(698,568);
        surface2.setLocation(679,390);
        surface3.setLocation(694,153);
        surface4.setLocation(670,36);
        spider.setLocation(687,96);
        spider2.setLocation(690,304);
        spider.setLocation(692,99);
        surface2.setLocation(1102,382);
        surface.setLocation(867,598);
        surface.setLocation(1085,561);
        spider2.setLocation(1091,467);
        surface3.setLocation(1087,211);
        spider.setLocation(1082,127);
        surface4.setLocation(1094,59);
        surface2.setLocation(759,568);
        surface3.setLocation(454,543);
        surface4.setLocation(50,567);
        surface3.setLocation(613,542);
        surface2.setLocation(811,556);
        Surface surface5 = new Surface();
        addObject(surface5,308,553);
        spider2.setLocation(314,33);
        spider.setLocation(621,14);
        Spider spider3 = new Spider();
        addObject(spider3,455,29);
        spider.setLocation(843,36);
        spider3.setLocation(528,43);
        spider2.setLocation(221,22);
        Surface surface6 = new Surface();
        addObject(surface6,115,564);
        Surface surface7 = new Surface();
        addObject(surface7,177,561);
        Surface surface8 = new Surface();
        addObject(surface8,234,559);
        surface5.setLocation(357,551);
        Surface surface9 = new Surface();
        addObject(surface9,357,551);
        Surface surface10 = new Surface();
        addObject(surface10,409,553);
        Surface surface11 = new Surface();
        addObject(surface11,485,552);
        Surface surface12 = new Surface();
        addObject(surface12,542,550);
        Surface surface13 = new Surface();
        addObject(surface13,682,550);
        Surface surface14 = new Surface();
        addObject(surface14,734,548);
        Surface surface15 = new Surface();
        addObject(surface15,877,553);
        Surface surface16 = new Surface();
        addObject(surface16,937,554);
        Surface surface17 = new Surface();
        addObject(surface17,289,552);
        spider2.setLocation(521,24);
        spider.setLocation(557,14);
        ant.setLocation(501,530);
        spider.setLocation(509,38);
        removeObject(surface4);
        removeObject(surface6);
        removeObject(surface7);
        removeObject(surface8);
        removeObject(surface17);
        surface5.setLocation(30,572);
        surface5.setLocation(145,554);
        surface10.setLocation(293,548);
        ant.setLocation(389,561);
        surface12.setLocation(510,555);
        surface3.setLocation(614,559);
        removeObject(surface13);
        removeObject(surface14);
        surface2.setLocation(709,563);
        surface15.setLocation(810,554);
        surface16.setLocation(925,559);
        removeObject(surface16);
        surface.setLocation(920,555);
        ant.setLocation(508,474);
        surface10.setLocation(252,550);
        surface11.setLocation(5,574);
        surface5.setLocation(150,551);
        surface9.setLocation(377,546);
        surface10.setLocation(286,545);
        surface3.setLocation(580,553);
        surface2.setLocation(702,545);
        surface.setLocation(931,557);

        addObject(counter,57,36);
        counter.setLocation(91,34);
        surface.setLocation(907,555);
        surface5.setLocation(194,550);
        surface11.setLocation(113,536);
        surface12.setLocation(458,541);
        surface3.setLocation(538,544);
        removeObject(surface11);
        removeObject(surface);
        surface2.setLocation(692,545);
        surface3.setLocation(577,548);
        surface15.setLocation(897,559);
        surface2.setLocation(717,553);
        surface3.setLocation(602,560);
        surface5.setLocation(141,550);
        surface10.setLocation(227,556);
        surface9.setLocation(369,569);
        surface12.setLocation(481,559);
    }
}
