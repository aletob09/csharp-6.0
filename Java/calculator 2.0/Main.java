import java.util.*;

/**
 * Main
 */
public class Main{


    public static void main(String[] args) {
        String input;
        int num1 = 0;

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter calculation: ");
        input = scn.nextLine();
        String[] parts = input.split(" ");
        List<String> results = new ArrayList<String>();

        for (int i = 0; i < parts.length; i++){
            if (parts[i].equals("(")) {
                for (i += 1; i < parts.length; i++) {
                    if (isInteger(parts[i])){
                        num1 = foo(parts, num1, i);
                    }
                    if (parts[i].equals(")")){
                        results.add(Integer.toString(num1));
                        num1 = 0;
                        break;
                    }
                }
            }
            else if (parts[i].equals("+") || parts[i].equals("-") || parts[i].equals("*") || parts[i].equals("/") || isInteger(parts[i])){
                results.add(parts[i]);
            }
        }
        for (int i = 0; i < results.size(); i++){
            String[] resultArr = new String[results.size()];
            resultArr = results.toArray(resultArr);
            if (isInteger(resultArr[i])){
                num1 = foo(resultArr, num1, i);
            }
        }
        System.out.print(num1);


    }

    public static boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }

    public static int foo(String[] parts, int num1, int i) {
        int tmp;
        if (num1 == 0){
            num1 = Integer.parseInt(parts[i]);
            return num1;
        }
        else{
            tmp = Integer.parseInt(parts[i]);
            if (i > 0){
                switch(parts[i - 1]) {
                    case "+": num1 = num1 + tmp;
                        break;
                    case "-": num1 = num1 - tmp;
                        break;
                    case "*": num1 = num1 * tmp;
                        break;
                    case "/": num1 = num1 / tmp;
                        break;
                    default: num1 = num1 + tmp;
                }
            }

            return num1;
        }
    }
}


