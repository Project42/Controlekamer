import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CatchThief_Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CatchThief_Menu extends Actor
{
    public void addedToWorld(World world)
    {
        setImage("arrest.png");
    }
    
    public void act() 
    {
        checkClicked();
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
