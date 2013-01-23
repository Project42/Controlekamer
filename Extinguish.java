import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Blust branden die zijn ontstaan door kortsluiting.
 * 
 * Project 42
 */

public class Extinguish extends Intervention
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
     * If true, sets the Character variable to FIREFIGHTER
     */
    
    public void checkClicked() 
    {
        ControlroomWorld world = (ControlroomWorld)getWorld();
        if (Greenfoot.mouseClicked(this)) 
        {
            world.setSelectedCharacter(ControlroomWorld.Character.FIREFIGHTER);
        }
    }
}
