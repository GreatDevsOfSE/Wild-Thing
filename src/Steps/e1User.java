import java.util.*;
public class e1User
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String user, pass;
        System.out.print("enter your username: ");
        user = input.nextLine();

        System.out.print("Enter you password: ");
        pass = input.nextLine();

        if(user.equals("user") && (pass.equals("password")))
        {
            System.out.println("greeting message");
        }
        else
        {
            System.out.println("invalid password");
        }


    }
}
