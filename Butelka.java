package butelka;

import java.util.Scanner;

public class Butelka {
    private double ileLitrow;
    private double pojemnosc;

    Butelka(double ileLitrow, double pojemnosc) {
        this.ileLitrow = ileLitrow;
        this.pojemnosc = pojemnosc;
    }

    double getPojemnosc() {
        return pojemnosc;
    }

    double getIleLitrow() {
        return ileLitrow;
    }

    boolean wlej(double ilosc) {

        double newWielkosc = this.ileLitrow + ilosc;
        if (pojemnosc < newWielkosc) {

            System.out.println("Za mała pojemność");
            newWielkosc = this.ileLitrow - ilosc;
        } else {
            this.ileLitrow = newWielkosc;
            return true;
        }
    }

    boolean wylej(double ilosc) {
        if (ilosc <= ileLitrow) {
            this.ileLitrow -= ilosc;
            return true;
        } else {
            return false;
        }
    }

    void przelej(double ilosc, Butelka gdzie) {
        if (this.wylej(ilosc)) {
            gdzie.wlej(ilosc);
        } else {
            System.out.println("Za mało wody w butelce");
        }

    }

    public static void main(String[] args) {
        Butelka[] butelka = new Butelka[3];
        butelka[0] = new Butelka(4, 6);
        butelka[1] = new Butelka(2, 10);
        butelka[2] = new Butelka(15, 25);
        System.out.println(butelka[0].getIleLitrow() + " Pojemnosc: " + butelka[0].getPojemnosc());
        System.out.println(butelka[1].getIleLitrow() + " Pojemnosc " + butelka[1].getPojemnosc());
        System.out.println(butelka[2].getIleLitrow() + " Pojemnosc " + butelka[2].getPojemnosc());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Z ktorej butelki chcesz przelać: ");
        int ktoraButelka = scanner.nextInt();

        System.out.println("Ile litrów chcesz przelać: ");
        double ilosc = scanner.nextDouble();
        System.out.println("Do której butelki chcesz przelać: ");
        int doKtorej = scanner.nextInt();

        butelka[ktoraButelka].przelej(ilosc, butelka[doKtorej]);

        System.out.println(butelka[0].getIleLitrow() + " Pojemnosc: " + butelka[0].getPojemnosc());
        System.out.println(butelka[1].getIleLitrow() + " Pojemnosc " + butelka[1].getPojemnosc());
        System.out.println(butelka[2].getIleLitrow() + " Pojemnosc " + butelka[2].getPojemnosc());

    }
}
