import greenfoot.*;

/**
 * Dief die probeert te plunderen.
 * 
 * Project 42
 */
public class Thief extends Calamities
{
    public void addedToWorld(World world)
    {
        setImage("flood.gif");
    }
    
    public void act()
    {
        // Toont sprite, na een aantal seconden verdwijnt de class (en gaat er een leven weg)
        super.act();
        checkClicked(); 
        checkIfIExpire(300);
    }
    
    public void checkClicked() {
        if (Greenfoot.mouseClicked(this)) 
        {
            ControlroomWorld world = (ControlroomWorld)getWorld();
            if (world.getSelectedCharacter() == ControlroomWorld.Character.FIREFIGHTER)
            {
                world.removeObject(this);
                world.getScoreCounter().add(50);
            }
        }
    }
    
    public void checkIfIExpire(int difficulty) {
       ControlroomWorld world = (ControlroomWorld)getWorld();

       if (getExpireTimer() > difficulty) 
       {
           world.removeObject(this);
           world.loseLife();
           setExpireTimer(0);
       }
    }
}

