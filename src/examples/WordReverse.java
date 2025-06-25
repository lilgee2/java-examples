package examples;

public class WordReverse {

    public static void main(String[] args){

        String str = "Hello world";
      
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

    }
}