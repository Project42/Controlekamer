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
    public void addedToWorld(World world)
    {
        setImage("fire.gif");
    }
    
    public void act()
    {
        // Toont sprite, na een aantal seconden verdwijnt de class (en gaat er een leven weg)
        super.act();
        checkClicked();  
    }
    
    public void checkClicked() {
        if (Greenfoot.mouseClicked(this)) {
            ControlroomWorld world = (ControlroomWorld)getWorld();
            if (world.getSelectedCharacter() == ControlroomWorld.Character.FIREFIGHTER) {
                world.removeObject(this);
                world.getScoreCounter().add(50);
            }
        }
    }      
}
   