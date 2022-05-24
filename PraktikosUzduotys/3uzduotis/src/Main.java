import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>();
        List<Integer> frequencyList = new ArrayList<>();                                    //Elemento pasikartojimų dažnių masyvas
        List<Integer> frequencyNumberList = new ArrayList<>();                              //Pasikartojančių elementų masyvas
        for (int i = 0; i < 100; i++) {
            int min = 1;
            int max = 100;                                                                  //Atsitiktinai generuojamu skaičiu ribos
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);       //Skaičiu generavimas
            randomList.add(random_int);                                                     //Skaičiu pridęjimas į masyvą
        }
        Collections.sort(randomList);                                                       //Masyvo išrikiavimas didėjančia tvarka

        for (int i = 0; i < 100; i++){
            if(!frequencyNumberList.contains(randomList.get(i))){                           //Tikrina ar šis elementas jau nėra patikrintas
                Integer daznis = Collections.frequency(randomList,randomList.get(i));       //Tikrina elementą
                if(daznis>1){                                                               //Tikrina ar elemento pasikartojimų dažnis >1
                    frequencyList.add(daznis);                                              //Prideda dažnį į masyvą
                    frequencyNumberList.add(randomList.get(i));                             //Prideda pasikartojantį elementą į masyva
                }
            }
        }
        for (int i = 0; i < frequencyNumberList.size(); i++){
            System.out.println("Pasikartojantis skaičius : " + frequencyNumberList.get(i));
            System.out.println("Pasikartojimų dažnis: " + frequencyList.get(i) );
            System.out.println();

        }
    }
}
