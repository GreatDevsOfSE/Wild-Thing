package Steps;

import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main
    {

        public static void main(String[] args)
            {
                Scanner scan = new Scanner (System.in);
                Scanner sc = new Scanner(System.in);
                Step cal = new Step();

                int age;
                double weight;
                double lenght;
                String female;
                String ali;
                String outsider;
                double steps;

                User user = new User(32, 150, 190, "female", "ali", "outsider");
                System.out.print("Please enter your Steps: ");
                steps = scan.nextInt();


                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");

                        String formattedDate = myDateObj.format(myFormatObj);

                        System.out.println("\nStepsCount at this time: " + formattedDate);

                        cal.calculateCaloriesBurned(steps, 150, 190);
                        cal.geReport();



            }
    }