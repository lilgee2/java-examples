package examples;

public class PalindromeWord {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str + " is a palindrome word.");
        } else {
            System.out.println(str + " is not a palindrome word.");
        }

        StringBuffer sb = new StringBuffer(str);
        StringBuffer rev1 = sb.reverse();

        if (str.equals(rev1.toString())) {
            System.out.println(str + " is a palindrome word.");
        } else {
            System.out.println(str + " is not a palindrome word.");
        }
    }
}
