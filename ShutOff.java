import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Politie zet straten af die onder water staan.
 * 
 * Project 42
 */
public class ShutOff extends Intervention
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
     * If true, sets the Character variable to POLICE_SHUTOFF
     */
    
    public void checkClicked() 
    {
        if (Greenfoot.mouseClicked(this)) 
        {
            ControlroomWorld world = (ControlroomWorld)getWorld();
            world.setSelectedCharacter(ControlroomWorld.Character.POLICE_SHUTOFF);
        }
    }
}