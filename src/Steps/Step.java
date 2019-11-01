package Steps;

import java.text.*;
import java.util.*;
import java.text.DecimalFormat;

public class Step {

    private double walkingFactor = 0.57;
    private double CaloriesBurnedPerKm;
    private double strip;
    private double stepCountKm;
    private double conversationFactor;
    private double CaloriesBurned;
    private NumberFormat formatter = new DecimalFormat("#0.00");
    private double distance;
    private double stepsCount;
    private int point;
    private double mySteps;
    private int CaloriesBurnedinInt;

    public Step()
        {
        }

    public void calculateCaloriesBurned(double stepsCount, double weight, double height)
        {
            mySteps = stepsCount;
            CaloriesBurnedPerKm = walkingFactor * (weight * 2.2);
            strip = height * 0.415;
            stepCountKm = 160934.4 / strip;
            conversationFactor = CaloriesBurnedPerKm / stepCountKm;
            CaloriesBurned = stepsCount * conversationFactor;
            CaloriesBurnedinInt = (int)CaloriesBurned;
            point = (int)CaloriesBurned/10; // we take 10kcal = 1 point.
        }

    public double getPoint()               {   return this.point;   }
    public double getStepsCount()               {   return this.mySteps;   }

    public void geReport()
        {
            System.out.print("\nTotal Steps: " + (int)mySteps + "\n\nTotal CaloriesBurned is: " + CaloriesBurnedinInt + "\nThe related Point is: " + point);
            if (getStepsCount() >= 8000)  { System.out.print("\n\nDagliga målet är 8000" + "\nBra jobbat man!: "); } else { System.out.print("\n\nDagliga målet är 8000" + "\nNot good man! "); }

        }

}

