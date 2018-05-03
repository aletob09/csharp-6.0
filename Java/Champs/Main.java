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
        
        getChampFile("test.txt");
                
    }

    public static void getChampFile(String path){
        String line = null;
        String[] values = new String[6];
        char[] chara = 'a';
        
        
        try {
           
            FileReader fileReader = new FileReader(path);    
            BufferedReader bufferedReader = new BufferedReader(fileReader);
    
            while((line = bufferedReader.readLine()) != null) {
                while((chara = bufferedReader.read()) != '='){
                    System.out.println(1);
                }
                
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(
                "Unable to open file '" + path + "'");         
        }
        catch(IOException e) {
            System.out.println("Error reading file '" + path + "'");                  
           
        }
        
    }
}