package com.utkudogan.string;

public class StringType {
	/*
	 * String bir primitive tip de�ildir. String bir class't�r Di�er class'lardan
	 * fark�, di�er s�n�flara nazaran �ok fazla, kullan�ma sahip oldu�u i�in, java
	 * string s�n�f�n�n kullan�m�n� kolayla�t�rm��t�r. String, bir karakter(char)
	 * dizisidir. String'in alabilece�i maksimum karakter say�s� 2.14 milyard�r.
	 */
	public static void main(String[] args) {

		String stringValue = "Bu bir string tipinde de�erdir.";
		System.out.println("String de�er: " + stringValue);

		// �ki string ifadeyi birle�tirme
		String isim = "Utku";
		String Soyisim = "Do�an";
		String tamIsim = isim + " " + Soyisim;
		System.out.println(tamIsim);

		// �rnek:
		String birinciSayi = "12.34";
		String ikinciSayi = "54.98";
		String toplam = birinciSayi + ikinciSayi;
		System.out.println(toplam); // Sonu� ne olur?

		String stringDeger = "10";
		int integerDeger = 20;
		String sonucStringOnce = stringDeger + integerDeger;
		System.out.println(sonucStringOnce);

		String sonucStringSonra = integerDeger + stringDeger;
		System.out.println(sonucStringSonra);

		// java, string de�erin int de�erle toplanmas�n�, string bir i�lem olarak
		// ger�ekle�tiriyor fakat
		// bu i�lem �ncesinde int tipindeki de�i�ken, string s�n�f�na d�nd�r�l�yor.

		String stringText = "10";
		double doubleDeger = 12.45D;
		String SonucStrinDouble = stringText + doubleDeger;
		System.out.println(SonucStrinDouble);

		int sonucInteger = integerDeger + Integer.parseInt(stringDeger);
		System.out.println(sonucInteger);

		/*
		 * String de�erler de�i�tirilemez. (immutable) String ifadeler yeniden
		 * olu�turulurlar. �leride bununla ilgili detayl� konu�aca��z. Bu konu ile
		 * ilgili StringBuffer ile de�eri de�i�tirilebilir string ifadeler hakk�nda da
		 * konu�aca��z.
		 */

	}

}