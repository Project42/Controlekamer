import greenfoot.*;

/**
 * Dit is de kamer waarin allerlei calamiteiten ontstaan en vervolgens 
 * geïnterveniëerd moeten worden door de speler.
 * 
 * Project 42 
 * 0.01
 */

public class Controlroom extends World
{

    public Controlroom()
    {    
        super(80,80,10); 
        setBackground("cell.jpg");
        addObject(new MenuBar(), 39, 75);
    }
}
