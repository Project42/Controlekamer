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
        setImage("firefighter.gif");
    }
    
    public void act()
    {
        // Toont sprite, na een aantal seconden verdwijnt de class (en gaat er een leven weg)
        // Verwijdert brand en blijft aanwezig voor een aantal seconden
        checkClicked();
        super.act();
    }
    
    public void checkClicked() {
        if (Greenfoot.mouseClicked(this)) {
            ControlroomWorld world = (ControlroomWorld)getWorld();
            world.setSelectedCharacter(ControlroomWorld.Character.FIREFIGHTER);
        }
    }
}