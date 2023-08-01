
/**
 * Write a description of class Flat here.
 *
 * @author (35029617)
 * @version (2021/08/13)
 */
public class Flat extends Property
{
    private boolean petfriendly;
    
    public Flat()
    {
    }
    
    public Flat(int rooms, int parking, boolean petfriendly)
    {
        super(rooms,parking);
        this.petfriendly=petfriendly;
    }
    
    public boolean getpetfriendly()
    {
        return petfriendly;
    }
    
    public double getPrice()
    {
        if (petfriendly==false)
        {
            return (1000*super.getrooms())+(500*super.getparking());
        } else
        {
            return ((1000*super.getrooms())+(500*super.getparking()))*1.1;
        }
    }
    
    public String toString()
    {
        String str="";
        if (petfriendly==false)
        {
            str=String.format("\n[Flat] Not pet friendly %5s%2d%10s%2d%10sR%9.2f","Rooms:",super.getrooms(),"Parking:",super.getparking(),"Cost:",getPrice());
        } else
        {
            str=String.format("\n[Flat] Pet friendly %10s%2d%10s%2d%10sR%9.2f","Rooms:",super.getrooms(),"Parking:",super.getparking(),"Cost:",getPrice());
        }
        return str;
    }
   
    public int compareTo(Property f)
    {
        if (this.getClass().equals(f.getClass()))
        {
            Flat h = (Flat)f;
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
