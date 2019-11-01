import Login.*;
import User.*;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class TestRegisteration
    {

        public static void main(String[] args)
            {
                Registerator myReg = new Registerator();
                PassValidator myValidator = new PassValidator();

                Scanner scnr = new Scanner(System.in);
                        System.out.println("= Create USER =");
                        System.out.println("Enter Age: ");
                        int anAge = scnr.nextInt();

                        System.out.println("Enter Weight: ");
                        double aWeight = scnr.nextDouble();

                        System.out.println("Enter Lenght: ");
                        double aLenght = scnr.nextDouble();
                        scnr.nextLine();

                        System.out.println("Enter Gender: ");
                        String aGender = scnr.nextLine();

                        System.out.println("Enter Name: ");
                        String aName = scnr.nextLine();

                        System.out.println("Enter Username: ");
                        String aUsername = scnr.nextLine();


                        System.out.println("Enter Password: ");
                        String aPassword = scnr.nextLine();

                        if (myValidator.valPassword(aPassword))
                            {
                                System.out.println("Password Accepted!");
                                myReg.createPass(aPassword);
                            } else
                            {
                                System.out.println("Your password should have at least 1 lowercase, 1 uppercase, 1 number being at least 7 characters.");
                            }

                        System.out.println("\n Creating User.... \n\n");

                        System.out.println(myReg.createUser(anAge, aWeight, aLenght, aGender, aName, aUsername).getName() + " has been registered.");

                    }



    }
