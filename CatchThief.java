import greenfoot.*;

/**
 * Politie vangt boeven die aan het plunderen zijn.
 * 
 * Project 42
 */
public class CatchThief extends Intervention
{
    public void addedToWorld(World world)
    {
        // Dit moet een werkende .GIF zijn
        setImage("firefighter.gif");
    }
    
    public void act()
    {
        checkClicked();
        super.act();
    }
    
    /** Checks whether object has been clicked
     * If true, sets the Character variable to POLICE_CATCHTHIEF
     */
    
    public void checkClicked() 
    {
        if (Greenfoot.mouseClicked(this)) {
            ControlroomWorld world = (ControlroomWorld)getWorld();
            world.setSelectedCharacter(ControlroomWorld.Character.POLICE_CATCHTHIEF);
        }
    }
}