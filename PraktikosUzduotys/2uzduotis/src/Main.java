import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int min = 1;
            int max = 1000;                                                                 //Atsitiktinai generuojamu skaičiu ribos
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);       //Skaičiu generavimas
            randomList.add(random_int);                                                     //Skaičiu pridęjimas į masyvą
        }
        Integer max = Collections.max(randomList);                                          //Maksimumo suradimas
        Integer min = Collections.min(randomList);                                          //Minimumo suradimas
        System.out.println("Didžiausia masyvo reikšmė: " + max);
        System.out.println("Mažiausia masyvo reikšmė: " + min);
    }
}
