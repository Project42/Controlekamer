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
            Controlroom world = (Controlroom)getWorld();
            world.setSelectedCharacter(Controlroom.Character.FIREFIGHTER);
        }
    }
}
