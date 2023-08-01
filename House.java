
/**
 * Write a description of class House here.
 *
 * @author (35029617)
 * @version (2021/08/13)
 */
public class House extends Property
{
    private int bathrooms;//number of bathrooms in the house
    private double size;// size of property in square meters
    
    public House()
    {
    }
    
    public House(int bathrooms, double size, int rooms, int parking)
    {
        super(rooms,parking);
        this.bathrooms=bathrooms;
        this.size=size;
    }
    
    public int getbathrooms()
    {
        return bathrooms;
    }
    
    public double getsize()
    {
        return size;
    }
    
    public void setbathrooms(int bathrooms)
    {
        this.bathrooms=bathrooms;
    }
    
    public void setsize(double size)
    {
        this.size=size;
    }
    
    public double getPrice()
    {
        return (super.getrooms()*1500)+(super.getparking()*1000)+(500*bathrooms)+(100*size);
    }
    
    public String toString()
    {
        String str = String.format("\n[House] Bathrooms: %2d%7s%2d%20s%7s%8.2fm%7sR%10.2f",bathrooms,"Rooms:",super.getrooms(),"Parking spaces:"+super.getparking(),"Size:",size,"Cost:",getPrice());
        return str;
    }
    
    public int compareTo(Property f)
    {
        if (this.getClass().equals(f.getClass()))
        {
            House h = (House)f;
        if (this.getPrice() == h.getPrice())
            return 0;
        else 
            if (this.getPrice()<h.getPrice())
            return-1;
            else
            return 1;
        } else
        return this.getClass().getName().compareTo(f.getClass().getName());
    }
}
