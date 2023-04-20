//Aplikacja jest grą w której komputer losuje liczbę z przedziału od 1 do 10, a naszym zadaniem jest odgadnięcie tej liczby. 
//Aplikacja po zgadnięciu informuje nas o ilości prób

import java.util.Random;
import java.util.Scanner;

public class Zgadywanka {
    public static void main(String[] args) {
        int i = 0;
        int los;
        int odp;
        Random random = new Random();
        los = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        do {
            i++;
            System.out.println("Podaj liczbę od 1 do 10:");
            odp = scanner.nextInt();
            if (odp > los) {
                System.out.println("Mniej");
            } else if (odp < los) {
                System.out.println("Więcej");
            }
        } while (los != odp);
        System.out.println("Brawo odgadłeś za " + i + " razem.");
        System.out.println("Koniec gry!");
    }
}
