
public class Main {
    public static void main(String[] args) {
        String tekstas = "Programuotojo ar tiesiog bet kokio IT specialisto profesija taps vis labiau įprasta.";
        String regexB = "[^AaĄąEeĘęĖėIiĮįYyOoUuŲųŪū]";                                                          //Regex išraiška viskam išskyrus balsėms surasti
        String regexPb = "[^BbCcČčDdFfGgHhJjKkLlMmNnPpRrSsŠšTtVvZzŽž]";                                         //Regex išraiška viskam išskyrus priebalsėms surasti
        System.out.println("Balsių skaičius: " + tekstas.replaceAll(regexB,"").length());            //Pašalina visus elementus išskyrus balses ir suskaiciuoja jų kiekį
        System.out.println("Priebalsių skaičius: " + tekstas.replaceAll(regexPb,"").length());       //Pašalina visus elementus išskyrus priebalses ir suskaiciuoja jų kiekį
    }

}
