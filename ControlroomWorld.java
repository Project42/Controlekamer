import greenfoot.*;

/**
 * Dit is de kamer waarin allerlei calamiteiten ontstaan en vervolgens 
 * geïnterveniëerd moeten worden door de speler.
 * 
 * Project 42 
 * 0.01
 */

public class ControlroomWorld extends World
{
    public Score scoreCounter;
    private int spawnTimer = 0; 
    public int calamityTimer = 0;
    private int spawnLocationX = 0;
    private int spawnLocationY = 0;
    public int countLifes = 4;
    
    private Life life1;
    private Life life2;
    private Life life3;
    
    public enum Character {
        FIREFIGHTER,
        POLICE_SHUTOFF,
        POLICE_CATCHTHIEF,
        POLICE_EVACUATE,
    }
    
    Character selectedCharacter;
    
    public void setSelectedCharacter(Character character) {
        selectedCharacter = character;
    }
    
    public Character getSelectedCharacter() {
        return selectedCharacter;
    }

    public ControlroomWorld()
    {    
        super(80,80,10); 
        setBackground("background.png");
        addObject(new MenuBar(), 39, 75);
        addObject(new Fire(), getWidth()/2, getHeight()/2);
        addObject(new Extinguish(), getWidth()/2+30, getHeight()/2);
        addObject(new Victims(), getWidth()/2+15, getHeight()/2);

        prepare();
        scoreCounter = new Score("Score: ");
        addObject(scoreCounter, 6, 74);
    }
    
    private void prepare()
    {
        addObject(life1 = new Life(), 77, 74);
        addObject(life2 = new Life(), 73, 74);
        addObject(life3 = new Life(), 69, 74);
    }
    
    public Score getScoreCounter() {
        return scoreCounter;
    }
    
    public void act() {
        spawnTimer++;
        spawnSomewhere(100);
    }
    
    public void spawnLocation() {
        spawnLocationX = (int)(Math.random()*((64-0)+12));
        spawnLocationY = (int)(Math.random()*((31-0)+12));
        
        if (getObjectsAt(spawnLocationX,spawnLocationY,Calamities.class).isEmpty()) 
        {
            if(spawnLocationX > 3 && spawnLocationY > 5) 
            {
                    chooseObject((int)(Math.random()*((2-0)+1)));
            }
         }
    }
        
    public void chooseObject (int x) {
        if (x==1) 
        {
            addObject(new Fire(), spawnLocationX, spawnLocationY);
        }
        
        else if (x==2) 
        {
            addObject(new Victims(),spawnLocationX, spawnLocationY);
        }
        setSpawnTimer(0);
    }
    
    public void setSpawnTimer(int newSpawnTimer) {
        spawnTimer = newSpawnTimer;
    }
    
    public int getSpawnTimer() {
       return spawnTimer;
    }
        
    public void spawnSomewhere(int difficulty) {
        if (getSpawnTimer()>difficulty) 
        {
            spawnLocation();
        }
    }

    public void setCalamityTimer(int newCalamityTimer) {
        calamityTimer = newCalamityTimer;
    }
    
    public int getCalamityTimer() {
        return calamityTimer;
    }
    
    public void loseLife() {
        countLifes--;
    if (countLifes == 3) {
           removeObject(life3);
        }
       
        else if (countLifes == 2) {
            removeObject(life2);
        }
        
        else if (countLifes == 1) {
            // Game Over
            System.out.println("WAAAAHHHH VERLOREN!");
            removeObject(life1);
        }
    }
}