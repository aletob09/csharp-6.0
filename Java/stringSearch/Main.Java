import java.util.*;

/**
 * Main
 */
public class Main{
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "Hello";
        arr[1] = "wonderful";
        arr[2] = "World";
        int equal = 0;
        int maxCount = 0;
        int checkCount = maxCount;
        ArrayList<Integer> index = new ArrayList<>();
        String input;


        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Word: ");
        input = scn.nextLine();
        for (int i = 0; i < arr.length; i++){
           if (arr[i].equals(input)){
               maxCount++;
               equal = 100;
           }
           else if (equal < 100){
               int tmp = 0;
               for (int y = 0;y < input.length(); y++){
                   for (int j = 0;j < arr[i].length(); j++){
                       if(arr[i].charAt(j) == input.charAt(y)){
                           tmp++;
                           break;
                       }
                   }
               }
               tmp = (100 / arr[i].length()) * tmp;
               if (tmp > equal) {
                   equal = tmp;
                   index.clear();
                   index.add(i);
               } else if (tmp == equal) {
                   index.add(i);
               }
           }
           if (maxCount > checkCount){
               checkCount = maxCount;
               if (maxCount < 2){
                   index.clear();
               }
               index.add(i);
           }
        }

        System.out.print("Your string matches the Word(s) ");
        if (index.size() > 1) {
            for (int x = 0; x < index.size(); x++){
                System.out.print(arr[index.get(x)] + ", ");
            }
        }
        else{
            System.out.print(arr[index.get(0)]);
        }
        System.out.print(" for " + equal + "%.");

    }
}


