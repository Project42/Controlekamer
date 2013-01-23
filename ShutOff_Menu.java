import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShutOff_Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShutOff_Menu extends Actor
{
    public void addedToWorld(World world)
    {
        setImage("shut_off_street.png");
    }
    
    public void act() 
    {
        checkClicked();
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
