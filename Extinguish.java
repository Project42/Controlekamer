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
        super.act(); //You MUST keep this in your act method for your animation to work!
    }

}
