package zadanie4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<P造ta> listaPlyt = new ArrayList<>();

        System.out.println("Podaj liczbe plyt");
        int liczbaPlyt = scanner.nextInt();
        for (int i = 0; i < liczbaPlyt; i++) {
            dodajPlyte(scanner, listaPlyt);
        }
        int opcja;
        do {
            System.out.println("1. Wypisz plyty\n2. Wyszukaj plyte po cenie\n3. Wyszukaj plyte po tytule\n4. Dodaj plyte\n5. Zamknij");
            opcja = scanner.nextInt();

            switch (opcja) {
                case 1 -> {
                    for (P造ta plyta : listaPlyt) {
                        System.out.println(plyta.toString());
                    }
                }
                case 2 -> {
                    System.out.println("Podaj cene");
                    float szukanaCena = scanner.nextFloat();
                    for (P造ta plyta: listaPlyt){
                        if (plyta.getCena() == szukanaCena){
                            System.out.println(plyta);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Podaj nazwe");
                    String szukanaNazwa = scanner.next();
                    for (P造ta plyta: listaPlyt){
                        if (plyta.getTytul().equals(szukanaNazwa)){
                            System.out.println(plyta);
                        }
                    }
                }
                case 4 -> dodajPlyte(scanner, listaPlyt);
            }
        }
        while (opcja != 5);
    }

    public static void dodajPlyte(Scanner scanner, List<P造ta> listaPlyt) {
        System.out.println("Podaj id plyty");
        int id = scanner.nextInt();
        System.out.println("Podaj tytul plyty");
        String tytul = scanner.next();
        System.out.println("Podaj cene plyty");
        float cena = scanner.nextFloat();
        P造ta plyta = new P造ta(id, tytul, cena);
        listaPlyt.add(plyta);
    }
}
