import java.util.*;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        List<Champion> champs = new ArrayList<>();
        champs.add(new Tank("Galio", 24, 32, 50));
        System.out.print((champs.get(0)).name);
        

        System.out.print((champs.get(0)).armor);
        System.out.print((champs.get(0)).resistance);
    }
    
}