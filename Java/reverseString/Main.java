import java.util.*;

/**
 * Main
 */
public class Main{
    public static void main(String[] args) {
        String foo = "Test";
        String reverse;
        reverse = "";


        for (int i = foo.length() - 1; i >= 0; i--){

            reverse += foo.charAt(i);
        }
        System.out.print(reverse);
    }
}