import java.util.*;

/**
 * Main
 */
public class Main{
    public static void main(String[] args) {

        HashMap<String, String> hmap = new HashMap<String, String>();
        hmap.put("Hello", "Hallo");
        hmap.put("wonderful", "wundervoll");
        hmap.put("World", "Welt");

        int equal = 0;
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        String input;
        boolean match = false;
        int i = 0;


        Scanner scn = new Scanner(System.in);
        System.out.print("Enter English Word: ");
        input = scn.nextLine();
        for (String key : hmap.keySet()){
            if (key.equals(input)){
                match = true;
                equal = 100;
            }
            else if (equal < 100){
                int tmp = 0;
                for (int y = 0;y < input.length(); y++){
                    for (int j = 0;j < key.length(); j++){
                        if(key.charAt(j) == input.charAt(y)){
                            tmp++;
                            break;
                        }
                    }
                }
                tmp = (100 / key.length()) * tmp;
                if (tmp > equal) {
                    equal = tmp;
                    index.clear();
                    index.add(i);
                    words.add(key);
                    i++;
                } else if (tmp == equal) {
                    index.add(i);
                    words.add(key);
                    i++;
                }
            }
        }

        System.out.print("Possible Translations: ");
        if (index.size() >= 1) {
            for (int x = 0; x < index.size(); x++){
                System.out.print(hmap.get(words.get(index.get(0))) + ", ");
            }
        }
        else if(match == true){
            System.out.print(hmap.get(input));
        }
        System.out.print(" (possibility: " + equal + "%)");

    }
}


