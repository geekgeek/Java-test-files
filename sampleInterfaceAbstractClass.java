public abstract class Car 
{

    public int maxSpeed;
    public int cost;
    public String comment;
    
}


public interface CarInterface
{
    int returnSpeed();
    int returnCost();
}

public interface CarSafetyInterface
{

    int setSafetyRanking(int setRanking);
    int getSafetyRanking();
}


/**
 * class Volvo here.
 */
public class Volvo extends Car implements CarInterface, CarSafetyInterface
{
    // instance variables - replace the example below with your own
    final String carName = "Volvo";
    int safetyRanking;

    /**
     * Constructor for objects of class Volvo
     */
    public Volvo()
    {
        // initialise instance variables
        System.out.println(carName);
    }

    
    public int setSpeed(int speed)
    {
         maxSpeed = speed;
         return speed;
    }
    
    public int returnSpeed()
    {
        // put your code here
        return maxSpeed;
    }
    
    public int setCost(int costusd)
    {
         cost = costusd;
         return costusd;
    }
  
    
    public int returnCost()
    {
        // put your code here
        return cost;
    }
    
    public String setComment(String setComment)
    {
         comment = setComment;
         return setComment;
    }
  
    
      public String returnComment()
    {
        // put your code here
        return comment;
    }
    
    public int setSafetyRanking(int setRanking)
    {
        safetyRanking = setRanking;
        return setRanking;
    }
    
    public int getSafetyRanking()
    {
        return safetyRanking;
    }
}
