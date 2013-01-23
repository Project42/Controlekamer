import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Toont sprite in het menu en is klikbaar
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Extinguish_Menu extends Actor
{
    public void addedToWorld(World world)
    {
        setImage("firefighter.png");
    }
    
    public void act() 
    {
        checkClicked();
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
