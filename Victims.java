import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * DEZE MENSEN GAAN DOOD EN ALS JE ZE NIET RED DAN IS DAT PECH VOOR ZE.
 * 
 * Project 42
 */
public class Victims extends Calamities
{    
    public void addedToWorld(World world)
    {
        setImage("peoplethatneedtobeevacuated.gif");
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
            if (world.getSelectedCharacter() == ControlroomWorld.Character.POLICE_EVACUATE)
            {
                world.removeObject(this);
                world.getScoreCounter().add(50);
            }
        }
    }
    
    public void checkIfIExpire(int difficulty) {
       ControlroomWorld world = (ControlroomWorld)getWorld();
       world.setCalamityTimer(getExpireTimer());

       if (getExpireTimer() > difficulty) 
       {
           world.removeObject(this);
           world.loseLife();
           setExpireTimer(0);
       }
    }
}
