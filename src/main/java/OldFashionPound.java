import dataobjects.Pound;

import java.util.Scanner;

public class OldFashionPound {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("\nPlease enter first operand: ");
            System.out.println("\nPlease enter the pounds: ");
            boolean isAnInt = scanner.hasNextInt();
            int pounds = 0;
            if (isAnInt) {
                pounds = scanner.nextInt();
            }
            System.out.println("\nPlease enter the shillings: ");
            isAnInt = scanner.hasNextInt();
            int shillings = 0;
            if (isAnInt) {
                shillings = scanner.nextInt();
            }
            System.out.println("\nPlease enter the pence: ");
            isAnInt = scanner.hasNextInt();
            int pence = 0;
            if (isAnInt) {
                pence = scanner.nextInt();
            }

            Pound userFirstPound = new Pound(pounds, shillings, pence);

            System.out.println("\nPlease enter second operand: ");
            System.out.println("\nPlease enter the pounds: ");
            isAnInt = scanner.hasNextInt();
            pounds = 0;
            if (isAnInt) {
                pounds = scanner.nextInt();
            }
            System.out.println("\nPlease enter the shillings: ");
            isAnInt = scanner.hasNextInt();
            shillings = 0;
            if (isAnInt) {
                shillings = scanner.nextInt();
            }
            System.out.println("\nPlease enter the pence: ");
            isAnInt = scanner.hasNextInt();
            pence = 0;
            if (isAnInt) {
                pence = scanner.nextInt();
            }
            Pound userSecondPound = new Pound(pounds, shillings, pence);

            System.out.println("\nPlease choice an operation: ");
            System.out.println("\nPress 1 to calculate sum\n" +
                    "\nPress 2 to calculate difference \n" +
                    "\nPress 3 to multiply \n" +
                    "\nPress 4 to divide \n");
            isAnInt = scanner.hasNextInt();
            int userChoice = 0;
            if (isAnInt) {
                userChoice = scanner.nextInt();
            }
           // switch (userChoice) {
                // STILL TO BE IMPLEMENTED
          //  }
            quit = true;
        }

        Pound myFirstPound = new Pound(5, 17, 8);
        Pound secondPound = new Pound(3, 4, 10);
        Pound myThirdPound = new Pound(5, 18, 8);

        Pound mySumResult = makeSum(myFirstPound, secondPound);
        System.out.println("Sum = " + mySumResult);

        Pound myDiffResult = makeDiff(myFirstPound, secondPound);
        System.out.println("Diff1 = " + myDiffResult);
        Pound mySecondDiffResult = makeDiff(myFirstPound, myThirdPound);
        System.out.println("Diff2 = " + mySecondDiffResult);

        Pound myMultiplyResult = multiply(myFirstPound, 2);
        System.out.println("Mult = " + myMultiplyResult);

        Pound myDivisionResult = divide(myFirstPound, 3);
        System.out.println("Div = " + myDivisionResult);

    }

    public static Pound makeSum(Pound firstPound, Pound secondPound) {

        int myTotal = firstPound.getTotalValue() + secondPound.getTotalValue();
        return new Pound(myTotal);

    }

    public static Pound makeDiff(Pound firstPound, Pound secondPound) {

        int myTotal = firstPound.getTotalValue() - secondPound.getTotalValue();
        return new Pound(myTotal);

    }

    public static Pound multiply(Pound firstPound, int value) {

        int myTotal = firstPound.getTotalValue() * value;
        return new Pound(myTotal);

    }

    public static Pound divide(Pound firstPound, int value) {

        int myTotal = firstPound.getTotalValue() / value;
        return new Pound(myTotal);

    }

}