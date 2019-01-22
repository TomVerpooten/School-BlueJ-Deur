
/**
 * Write a description of class Deur here.
 *
 * @author (Tom Verpooten)
 * @version (0.00.000.00.02)
 */
public class Deur
{
    private boolean blLocked;

    /**
     * Constructor for objects of class Deur
     */
    public Deur()
    {
        
    }
    
    public void Close()
    {
        blLocked = true;
    }
    
    public void Open()
    {
        blLocked = false;
    }
    
    public boolean getLocked()
    {
        return blLocked;
    }
        
    public void PrintStatus()
    {
        if (blLocked == false)
        {
            System.out.println("De deur staat open!");
        }
        
        else
        {
            System.out.println("De deur is gesloten!");
        }
    }
}