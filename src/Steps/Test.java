import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
public class Test
{
  public static void main(String[] args)
  {
    // LocalDate presentDate = LocalDate.now();
    
    Scanner input = new Scanner(System.in);
    int mysteps;
    System.out.print("Enter mysteps ");
    mysteps = input.nextInt();
    
    LocalDateTime myDateObj = LocalDateTime.now(); 
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss"); 
    
    String formattedDate = myDateObj.format(myFormatObj);  
    
    
    System.out.println("\nTotal steps is: " + mysteps + " " + formattedDate);
    
    
    double kcal = 200;
    double point;
    point = kcal/10; // we take 10kcal = 1 point.
    System.out.println("\nTotal point is: " +  point);
  }
  
    
}





