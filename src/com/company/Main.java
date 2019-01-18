package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);
        System.out.println("Please enter the number 0.");

        int userNumber = userinput.nextInt();

        int numberOfTimesZeroNotEntered = 0;

        while (userNumber != 0)
        {
            System.out.println("Please enter a number again.");
            userNumber = userinput.nextInt();
            numberOfTimesZeroNotEntered ++;
        }
        System.out.println("You entered a number other than zero " + numberOfTimesZeroNotEntered + " Times.");
    }
}
