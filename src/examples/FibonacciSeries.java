package examples;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= n; i++) {

            c = a + b;
            System.out.print(a + " ");
            
            a = b;
            b = c;
        }
    }
    
}
