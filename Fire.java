import greenfoot.*;
import java.util.Timer;
import java.util.TimerTask;
 

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
        checkClicked();
        spawnSomewhere(100);
        
    }
    
    public void checkClicked() {
        if (Greenfoot.mouseClicked(this)) {
            Controlroom world = (Controlroom)getWorld();
            if (world.getSelectedCharacter() == Controlroom.Character.FIREFIGHTER) {
                world.removeObject(this);
            }
        }
    }
     
    public void spawnSomewhere(int difficulty) {
        Controlroom world = (Controlroom)getWorld();
        if (getSpawnTimer()>difficulty) {
            spawnLocation((int)(Math.random()*((2-0)+1)));
            setSpawnTimer(0);
        }
                
        }
        
}
   