import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Evacuate_Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Evacuate_Menu extends Actor
{
    public void addedToWorld(World world)
    {
        setImage("evac_vehicle.png");
    }
    
    public void act() 
    {
        checkClicked();
    }
    
    /** Checks whether object has been clicked
     * If true, sets the Character variable to POLICE_EVACUATE
     */
    
    public void checkClicked() 
    {
        if (Greenfoot.mouseClicked(this)) {
            ControlroomWorld world = (ControlroomWorld)getWorld();
            world.setSelectedCharacter(ControlroomWorld.Character.POLICE_EVACUATE);
        }
    }
}
