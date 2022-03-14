package zadanie6;


public class Program {

	public static void main(String[] args) {
		
		//Tworzenie obiektów klasy LiczbZespolona
		LiczbZespolona l1 = new LiczbZespolona(3,4);
		LiczbZespolona l2 = new LiczbZespolona(8,-6);
		
		//Testowanie stworzonych metod
		LiczbZespolona l3 = l2.obliczSprzezenie();
		l1.wypisz();
		l2.wypisz();
		l3.wypisz();
		System.out.println("Modul liczby zespolonej l1 jest rowny "+l1.obliczModul());
		l3 = l3.dodajLZ(l1);
		System.out.println("Nowa wartosc l3, po dodaniu do niej l1 to: "); 
		l3.wypisz();
		l3 = l3.pomnozLZ(l2);
		System.out.println("Nowa wartosc l3, po pomno¿eniu jej przez l1 to: ");
		l3.wypisz();
		System.out.println("Jesli podzielimy teraz l3 przez l1 to powinna ona przyjac wartosc 11 + 10i. Sprawdzmy...");
		l3 = l3.podzielLZ(l2);
		l3.wypisz();
		
	
	
	}

}
