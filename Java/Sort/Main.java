import java.util.*;

/**
 * Main
 */
public class Main{
    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[0] = "Brand";
        arr[1] = "Caitlyn";
        arr[2] = "Azir";
        arr[3] = "Fizz";
        arr[4] = "Draven";
        boolean sorted = false;
        String input;
        String input2;

        Scanner scn = new Scanner(System.in);
        System.out.print("B Bubble Sort, I Insertion Sort: ");
        input = scn.next();


        System.out.print("a ascending, d for descending: ");
        input2 = scn.next();

        switch(input) {
            case "B": bubbleSort(arr, sorted, input2);
                break;
            case "I": InsertionSort(arr, input2);
                break;
            default: System.out.print("Error");
        }










    }

    static void bubbleSort(String[] arr, boolean sorted, String input2){
        if (input2.equals("a")){
            do {
                sorted = true;
                String tmp;
                for (int i = 0; i < arr.length - 1; i++){
                    if (arr[i].compareTo(arr[i + 1]) > 0){
                        tmp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = tmp;
                        sorted = false;
                    }
                }
            }while (sorted == false);
        }else if (input2.equals("d")){
            do {
                sorted = true;
                String tmp;
                for (int i = 0; i < arr.length - 1; i++){
                    if (arr[i].compareTo(arr[i + 1]) < 0){
                        tmp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = tmp;
                        sorted = false;
                    }
                }
            }while (sorted == false);
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    static void InsertionSort(String[] arr, String input2){
        String key = arr[0];
        String tmp = "";

        if (input2.equals("a")){
            for (int i = 1; i < arr.length; i++){
                key = arr[i];
                int j = i-1;

                while (j >= 0 && arr[j].compareTo(key) > 0)
                {
                    arr[j+1] = arr[j];
                    j = j-1;
                }
                arr[j+1] = key;
            }
        }else if (input2.equals("d")){
            for (int i = 1; i < arr.length; i++){
                key = arr[i];
                int j = i-1;

                while (j >= 0 && arr[j].compareTo(key) < 0)
                {
                    arr[j+1] = arr[j];
                    j = j-1;
                }
                arr[j+1] = key;
            }
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}


