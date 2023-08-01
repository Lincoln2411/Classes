
/**
 * Write a description of class Property here.
 *
 * @author (35029617)
 * @version (2021/08/13)
 */
public abstract class Property implements Comparable<Property>
{
    private int rooms;//number of rooms
    private int parking;//number of parking spaces
    protected Property()
    {
    }
    
    protected Property(int rooms, int parking)
    {
        this.rooms=rooms;
        this.parking=parking;
    }
    
    public int getrooms()
    {
        return rooms;
    }
    
    public void setrooms(int rooms)
    {
        this.rooms=rooms;
    }
    
    public int getparking()
    {
        return parking;
    }
    
    public void setparking(int parking)
    {
        this.parking=parking;
    }
    
    public abstract double getPrice();
    
}
