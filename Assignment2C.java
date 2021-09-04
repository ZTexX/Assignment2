// Assignment 2C

import java.util.Scanner;

public class Assignment2C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double dollars;

        print("Welcome to Bisonica!");
        print("\nHow many US Dollars do you have? ");
        dollars = sc.nextDouble();

        print(dollars + " US Dollar(s) is " + dollars * 0.73 + " British Pound(s),\nwhich is " + (dollars * 0.73) / 5 + " Bison Dollar(s)!");
    }

    public static void print(String s) {
        System.out.print(s);
    }
}
