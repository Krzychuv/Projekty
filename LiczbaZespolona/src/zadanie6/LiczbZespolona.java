package zadanie6;

import java.util.*;

public class LiczbZespolona {
	
	Scanner kl = new Scanner(System.in);
	//Atrybuty
	private double x;
	private double y;
	
	//Metody
	public LiczbZespolona(double re, double im) {
		this.x = re;
		this.y = im;
	}
	public LiczbZespolona() {
		System.out.println("***TWORZENIE OBIEKTU!***");
		System.out.println("Podaj czesc rzeczywista liczby zespolonej: ");
		this.x = kl.nextDouble();
		System.out.println("Podaj czesc urojona liczby zespolonej: ");
		this.y = kl.nextDouble();
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public LiczbZespolona dodajLZ(LiczbZespolona a) {
		return new LiczbZespolona(this.x+a.getX(),this.y+a.getY());	
	}
	public LiczbZespolona odejmijLZ(LiczbZespolona a) {
		return new LiczbZespolona(this.x-a.getX(),this.y-a.getY());	
	}
	public LiczbZespolona pomnozLZ(LiczbZespolona a) {
		return new LiczbZespolona((this.x*a.getX()-this.y*a.getY()), (this.x*a.getY()+this.y*a.getX()));
	}
	public LiczbZespolona podzielLZ(LiczbZespolona a) {
		return new LiczbZespolona(((this.x*a.getX()+this.y*a.getY())/(Math.pow(a.getX(),2)+Math.pow(a.getY(),2))), (this.y*a.getX()-this.x*a.getY())/(Math.pow(a.getX(),2)+Math.pow(a.getY(),2)));
	}
	public LiczbZespolona obliczSprzezenie() {
		return new LiczbZespolona(this.x, -this.y);
	}
	public double obliczModul() {
		return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
	}
	public LiczbZespolona obliczPrzeciwienstwo() {
		return new LiczbZespolona(-this.x, -this.y);
	}
	public void wypisz() {
		if(this.x == 0) System.out.println(this.y+"i");
		else if(this.y == 0) System.out.println(this.x);
		else if(this.x == 0 && this.y == 0) System.out.println("0");
		else if(this.x !=0 && this.y < 0) System.out.println(this.x+" - "+(-this.y)+"i");
		else System.out.println(this.x+" + "+this.y+"i");
	}
	
	
	
	
}
