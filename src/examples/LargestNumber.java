package examples;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        System.out.println("Enter a number: ");
        int c = sc.nextInt();
        /* if (a > b && a > c) {
            System.out.println(a + " is the largest number.");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }*/

        int largest = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(largest + " is the largest number.");
    }

    
}
