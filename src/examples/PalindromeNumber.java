package examples;

import java.util.Scanner;
public class PalindromeNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int b = n;
        int rev = 0;
        while(n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        if (rev == b) {
            System.out.println(b + " is a palindrome number.");
        } else {
            System.out.println(b + " is not a palindrome number.");
        }
        
    }
    
}
