// Assignment 2A

import java.util.Scanner;

public class Assignment2A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numInSeconds;

        print("How much time has passed (in seconds)?: ");
        numInSeconds = sc.nextInt();

        print("Now converting...");

        print("\n" + numInSeconds + " seconds is " + numInSeconds / 3600 + " hour(s), " + (numInSeconds / 60) % 60 + " minute(s), and " + numInSeconds % 60 + " second(s).");
    }

    public static void print(String s) {
        System.out.print(s);
    }
}
