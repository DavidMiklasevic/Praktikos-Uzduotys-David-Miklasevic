import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite tekstą: ");
        String tekstas = scanner.nextLine();                        //Nuskaito vartotojo įvedimą
        StringBuilder atbulinisTekstas = new StringBuilder();       //StringBuilder sukuria tuščia String
        for(int i = tekstas.length()-1;i>=0;i--){                   //for ciklas pradeda nuo paskutinio teksto elemento ir baigia darbą pasiekes 0
            atbulinisTekstas.append(tekstas.charAt(i));             //append paima char elementą ir prideda jį prie String atbulinisTekstas
        }
        System.out.println("Pradinis tekstas: " + tekstas);
        System.out.println("Tekstas atbuline tvarka: " + atbulinisTekstas);
    }
}
