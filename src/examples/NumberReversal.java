package examples;

import java.util.Scanner;

public class NumberReversal {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = sc.nextInt();
        int rev = 0;
        while(n != 0) {

            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(rev);

        
        StringBuffer sb = new StringBuffer(String.valueOf(rev));
        System.out.println(sb.reverse());
    }
}
