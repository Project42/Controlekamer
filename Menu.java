import greenfoot.*;

/**
 * Bevat alle menuitems
 * 
 */
public class Menu extends Actor
{
   /** Checks whether object has been clicked
     * If true, sets the Character variable to POLICE_SHUTOFF
     */
    
    public void checkClicked(int character) 
    {
        if (Greenfoot.mouseClicked(this)) 
        {
            ControlroomWorld world = (ControlroomWorld)getWorld();
            if (character == 1) {
                 world.setSelectedCharacter(ControlroomWorld.Character.FIREFIGHTER);
            }
            
            else if (character == 2) {
                world.setSelectedCharacter(ControlroomWorld.Character.POLICE_SHUTOFF);
            }
            
            else if (character == 3) {
                world.setSelectedCharacter(ControlroomWorld.Character.POLICE_EVACUATE);
            }
            
            else if (character == 4) {
                world.setSelectedCharacter(ControlroomWorld.Character.POLICE_CATCHTHIEF);
             }
        }
    }
}