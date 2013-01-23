import greenfoot.*;

/**
 * Deze mensen moeten geëvacueerd worden door de politie.
 * 
 * Project 42
 */

public class Victims extends Calamities
{    
    Evacuate police_evacuate;
    public void addedToWorld(World world)
    {
        // Dit moet een werkende .GIF zijn
        setImage("peoplethatneedtobeevacuated.gif");
        setDifficultyScore();
    }
    
    public void act()
    {
        super.act();
        checkClicked(); 
        checkIfIExpire(checkDifficulty());
        
        if (police_evacuate != null) {
            interventionTimer++;
            if (interventionTimer > 300) 
            {
                ControlroomWorld world = (ControlroomWorld)getWorld();
                world.removeObject(this);
                world.removeObject(police_evacuate);
                world.getScoreCounter().add(50);
            }
        } else {
            interventionTimer = 0;
        }
    }
    
    /** Check if object has been clicked
     * If true, it checks whether the last object clicked was a Firefighter
     * If true, it deletes the Fire object and adds 50 to score
     */
    
    public void checkClicked() {
        if (Greenfoot.mouseClicked(this)) 
        {
            ControlroomWorld world = (ControlroomWorld)getWorld();
            int objectLocationX = getX()+2;
            int objectLocationY = getY();
            world.addObject(police_evacuate = new Evacuate(), objectLocationX, objectLocationY);
        }
    }
    
    /** Check whether object has been in the world for too long
     * If true, removes the Fire object and sets the timer back to 0
     * Difficulty argument decreases when progressing in the game, making objects expire faster
     */
    
    public void checkIfIExpire(int difficulty) {
       ControlroomWorld world = (ControlroomWorld)getWorld();

       if (getExpireTimer() > difficulty)
       {
           world.removeObject(this);
           world.loseLife();
           setExpireTimer(0);
       }
    }
}