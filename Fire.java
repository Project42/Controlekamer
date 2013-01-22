import greenfoot.*; 

/**
 * Door kortsluiting ontstaat brand
 * 
 * Project 42
 */

public class Fire extends Calamities
{    
    private int expireTimer;
    public void addedToWorld(World world)
    {
        setImage("fire.gif");
    }
    
    public void act()
    {
        // Toont sprite, na een aantal seconden verdwijnt de class (en gaat er een leven weg)
        super.act();
        checkClicked(); 
        checkIfIExpire(300);
        expireTimer++;
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
    
    public void checkIfIExpire(int difficulty) 
    {
       ControlroomWorld world = (ControlroomWorld)getWorld();
       world.setCalamityTimer(expireTimer);

       if (world.getCalamityTimer() > difficulty) 
       {
           world.removeObject(this);
           world.loseLife();
       }
       
       

    }
}
   