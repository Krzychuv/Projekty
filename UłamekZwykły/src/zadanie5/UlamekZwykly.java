package zadanie5;

import java.util.*;

public class UlamekZwykly {
	Scanner kl = new Scanner(System.in);

	private int licznik;

	private int mianownik;

	public UlamekZwykly(int licznik, int mianownik)
	{
		this.licznik = licznik;
		this.mianownik = mianownik;
	}

	public UlamekZwykly(UlamekZwykly ulamekZwykly)
	{
		this.licznik = ulamekZwykly.getLicznik();
		this.mianownik = ulamekZwykly.getMianownik();
	}

	public UlamekZwykly()
	{
		System.out.println("***TWORZENIE ULAMKA!***");
		System.out.println("Podaj licznik: ");
		this.licznik = kl.nextInt();
		System.out.println("Podaj mianownik: ");
		this.mianownik = kl.nextInt();
	}

	public int getLicznik()
	{
		return licznik;
	}

	public void setLicznik(int licznik)
	{
		this.licznik = licznik;
	}

	public int getMianownik()
	{
		return mianownik;
	}

	public void setMianownik(int mianownik)
	{
		this.mianownik = mianownik;
	}

	public void pomnozPrzez(int licznik, int mianownik)
	{
		this.licznik = this.licznik * licznik;
		this.mianownik = this.mianownik * mianownik;
	}

	public void pomnozPrzez(UlamekZwykly ulamekZwykly)
	{
		this.licznik = this.licznik * ulamekZwykly.getLicznik();
		this.mianownik = this.mianownik * ulamekZwykly.getMianownik();
	}

	public void podzielPrzez(UlamekZwykly ulamekZwykly)
	{
		pomnozPrzez(ulamekZwykly.getMianownik(), ulamekZwykly.getLicznik());
	}

	public void dodaj(UlamekZwykly ulamekZwykly)
	{
		if (this.mianownik == ulamekZwykly.getMianownik())
		{
			this.licznik = this.licznik + ulamekZwykly.getLicznik();

			return;
		}

		wykonajDzialanieZeWspolnymMianownikiem(ulamekZwykly, true);
	}

	public void odejmij(UlamekZwykly ulamekZwykly)
	{
		if (this.mianownik == ulamekZwykly.getMianownik())
		{
			this.licznik = this.licznik - ulamekZwykly.getLicznik();

			return;
		}

		wykonajDzialanieZeWspolnymMianownikiem(ulamekZwykly, false);
	}

	public void uprosc()
	{
		int nwd = wyznaczNWD(this.licznik, this.mianownik);

		this.licznik = this.licznik / nwd;
		this.mianownik = this.mianownik / nwd;
	}

	public void wypisz()
	{
		if (this.licznik == 0)
		{
			System.out.println("0");

			return;
		}

		System.out.println(this.licznik + "/" + this.mianownik);
	}

	public void zamienNaDziesietny()
	{
		double licznik = this.licznik;
		double mianownik = this.mianownik;

		System.out.println(licznik / mianownik);
	}

	private int wyznaczNWD(int licznik, int mianownik)
	{
		if (mianownik == 0)
		{
			return licznik;
		}
		else
		{
			return wyznaczNWD(mianownik, licznik%mianownik);
		}
	}

	private void wykonajDzialanieZeWspolnymMianownikiem(UlamekZwykly ulamekZwykly, boolean dodawanie)
	{
		int wspMianownik = this.mianownik * ulamekZwykly.getMianownik();

		if (dodawanie)
		{
			this.licznik = (wspMianownik / this.mianownik * this.licznik) +
					(wspMianownik / ulamekZwykly.getMianownik() * ulamekZwykly.getLicznik());
		} else
		{
			this.licznik = (wspMianownik / this.mianownik * this.licznik) -
					(wspMianownik / ulamekZwykly.getMianownik() * ulamekZwykly.getLicznik());
		}

		this.mianownik = wspMianownik;

		uprosc();
	}
}
