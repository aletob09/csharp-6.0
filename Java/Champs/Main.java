import java.util.*;
import java.io.*;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        List<Champion> champs = new ArrayList<>();
        champs.add(new Tank("Galio", 50, 24, 32));
        champs.add(new ADC("Jinx", 50, 20, 40));
        System.out.print((champs.get(0)).name);
        System.out.print((champs.get(1)).name);
    }
}