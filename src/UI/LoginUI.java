package UI;
import Login.LoginHandler;
import User.Password;

import java.util.Scanner;

public class LoginUI
    {
        Scanner input = new Scanner(System.in);
        private String myUserName;
        private Password myPassword;
        LoginHandler myLogHandler = new LoginHandler();

        boolean isRunning = true;

        public void run()
            {
                do
                    {
                        System.out.println("/n==== LOGIN PAGE ====/n");
                        System.out.print("Enter your username");
                        myUserName = input.nextLine();

                        System.out.print("Enter you password: ");
                        myPassword = new Password (input.nextLine());

                        if (myLogHandler.checkLogin(myUserName, myPassword))
                            {
                                UserUI persPage = new UserUI(myUserName);
                                isRunning = false;
                            }
                        else
                            {
                                System.out.println("Login unsuccessful, try again!");
                                System.out.print("\033[H\033[2J");
                            }
                    }
                while (isRunning);
            }
    }
