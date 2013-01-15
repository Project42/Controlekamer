import greenfoot.*;

/**
 * Door kortsluiting ontstaat brand
 * 
 * Project 42
 */

public class Fire extends Calamities
{
    
    /**
     * When the object is added to the world, set it's image to the animation.
     */
    public void addedToWorld(World world)
    {
        setImage("fire.gif");
    }
    
    public void act()
    {
        // Toont sprite, na een aantal seconden verdwijnt de class (en gaat er een leven weg)
        super.act(); //You MUST keep this in your act method for your animation to work!
    }
}
