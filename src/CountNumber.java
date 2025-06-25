public class CountNumber {
    public static void main(String[] args) {
  
        int num = 12345;
        int count = 0;
        int even_count = 0;
        int odd_count = 0;
        int sum = 0;
        while (num > 0) {
            

            if (num%2 == 0) {
                even_count++;
            }
            else {
                odd_count++;
            }

            sum = sum + num % 10;

            num = num / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
        System.out.println("Number of even digits: " + even_count);
        System.out.println("Number of odd digits: " + odd_count);
        System.out.println("Sum of digits: " + sum);
    }
}
