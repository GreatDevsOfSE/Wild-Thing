public class Step
{
    // instance variables - replace the example below with your own
    private String date;
    private int steps;
    private int points;
    
    public Step(int steps, int points)
    {
        this.steps = steps;
        this. points = points;
    }
    
    public Step (String date)
    
    {
      this.date= date;
    } 
   
       
    
    public int getTheSteps()
    {
      return steps;
    }
    
     public int getThePoint()
    {
      return points;
    }

  
}
