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
        setBackground("cell.jpg");
        addObject(new MenuBar(), 39, 75);
        addObject(new Fire(), getWidth()/2, getHeight()/2);
        addObject(new Extinguish(), getWidth()/2+30, getHeight()/2);
        addObject(new Victims(), getWidth()/2+15, getHeight()/2);

        prepare();
        scoreCounter = new Score("Score: ");
        addObject(scoreCounter, 6, 74);
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
    }
    
    public Score getScoreCounter() {
        return scoreCounter;
    }
}
