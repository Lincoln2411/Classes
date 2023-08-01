
/**
 * Write a description of class TestClass here.
 *
 * @author (35029617)
 * @version (2021/10/12)
 */
public class TestClass
{
    public static void main (String[] args)
    {  
        MyLinkedList<Property> list = new MyLinkedList<Property>();
        Flat f1= new Flat(5,2,true);
        Flat f2 = new Flat(4,2,false);
        House h1 = new House(2,100,4,4);
        House h2 = new House (3,120,1, 2);
        System.out.println("Test 1: Empty list");
        System.out.println(list);
        System.out.println(list.returnLargest());
        list.clear();
        System.out.println("Test 2: One item in the list");
        list.append(f1);
        System.out.println(list);
        System.out.println(list.returnLargest());
        list.clear();
        System.out.println("Test 3: Multiple of the same item in the list");
        list.append(f1);
        list.append(h2);
        list.append(f1);
        System.out.println(list);
        System.out.println(list.returnLargest());
        list.clear();
        System.out.println("Test 4: General case");
        list.append(f1);
        list.append(f2);
        list.append(h1);
        list.append(h2);
        System.out.println(list);
        System.out.println(list.returnLargest());
        
    }
}
