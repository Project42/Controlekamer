import greenfoot.*; 

/**
 * Shows instructions, then starts game
 *
 **/
public class ControlroomMenu extends World
{

    public ControlroomMenu() {
        super(80, 80, 10);
        setBackground("controlroom_instructions.png");
    }

    @Override
    public void act() {
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new ControlroomWorld());
            return;
        }
    }
}

