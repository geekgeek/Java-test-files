
import java.util.ArrayList;

public class DataBaseArray
{

    private String ordliste;
    
    public ArrayList<String> arrList1;
    
    /**
     * Constructor
     */
    public DataBaseArray()
    {
        // initialise instance variables
        arrList1 = new ArrayList<>();
    }
    
    /**
     * @param ordliste1 ord legge til array
     */
    public void leggTilOrd(String ordliste1)
    {
        ordliste = ordliste1;
        arrList1.add(ordliste);
    }
    
    
    /**
     * 
     */
    public void showAllWords()
    {
        for(int i = 0; i < arrList1.size(); i++)
        {
            System.out.println(arrList1.get(i));
        }
    }
    
    /**
     * @param ordSlette ord som skal slettes
     */
    public void slettOrd(String ordSlette)
    {
        boolean found = false;

        for(int i = 0; i < arrList1.size() && !found; i++) // !found = found = false;
        {
            System.out.println(arrList1.get(i));
            
            if(ordSlette.equals(arrList1.get(i)))
            {
                System.out.println("deleted word: ");
                System.out.println(arrList1.get(i));
                
                arrList1.remove(i); //remove element in arraylist
                found = true;
            }
        }
    }
    
    

}
