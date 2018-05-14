import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        List<Champion> champs = new ArrayList<>();
        champs.add(new Tank("Galio", 500, 50, 24, 32));
        champs.add(new ADC("Jinx", 100, 50, 20, 40));
        //System.out.print((champs.get(0)).name);
        //System.out.print((champs.get(1)).name);
        champs.get(0).levelUp(2);
        

        
        
        ADC Jhin = new ADC("Jhin", 150, 80, 80, 1);
        //Jhin.levelUp(3);
        

        Tank Nasus = new Tank("Nasus", 800, 50, 50, 20);
        //Nasus.levelUp(2);

        System.out.print((battle(Jhin, Nasus)));
        
        
    }


    public static String battle(ADC adc, Tank tank){
        double tmp = tank.health / (adc.calcDPS() - tank.armor);
        String foo = tank.name + " will be dead after " + tmp + " seconds if fighting against " + adc.name;
        return foo;
    }
}