import greenfoot.*;

/**
 * Auto's botsen op elkaar bij straten waar teveel water is.
 * 
 * Project 42
 */
public class FloodStreet extends Calamities
{    
    public void addedToWorld(World world)
    {
        // Dit moet een werkende .GIF zijn
        setImage("flood.gif");
        setDifficultyScore();
    }
    
    public void act()
    {
        super.act();
        checkClicked(); 
        checkIfIExpire(checkDifficulty());
    }
    
    /** Check if object has been clicked
     * If true, it checks whether the last object clicked was a Firefighter
     * If true, it deletes the Fire object and adds 50 to score
     */
    
    public void checkClicked() {
        if (Greenfoot.mouseClicked(this)) 
        {
            ControlroomWorld world = (ControlroomWorld)getWorld();
            if (world.getSelectedCharacter() == ControlroomWorld.Character.POLICE_SHUTOFF)
            {
                world.removeObject(this);
                world.getScoreCounter().add(50);
            }
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
