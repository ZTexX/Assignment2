// Assignment 2B

import java.util.Scanner;

public class Assignment2B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int x, y, width, height;

        print("Enter the hit box top-left X coordinate: ");
        x = sc.nextInt();

        print("Enter the hit box top-left Y coordinate: ");
        y = sc.nextInt();

        print("Enter the width of the hit box: ");
        width = sc.nextInt();

        print("Enter the height of the hit box: ");
        height = sc.nextInt();

        print("[Hit Box Coordinates]");

        print("\nTop-Left: " + x + ", " + y);
        print("\nBottom-Left: " + x + ", " + x);
        print("\nTop-Right: " + width + ", " + height);
        print("\nBottom-Right: " + width + ", " + x);
    }

    public static void print(String s) {
        System.out.print(s);
    }
}
