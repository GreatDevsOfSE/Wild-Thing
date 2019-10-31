public class UnitConverter {

    public static void main(String[] args)
    {
        // 1 inches = 2.54 centimeters
        float inches = 5.82f;
        float cms = inches * 2.54f;

        System.out.println(inches + " inches is " + String.format("%.2f", cms) + " centimeters.");


    }
}
