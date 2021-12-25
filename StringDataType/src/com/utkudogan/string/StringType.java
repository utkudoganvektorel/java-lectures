package com.utkudogan.string;

public class StringType {
	/*
	 * String bir primitive tip deðildir. String bir class'týr Diðer class'lardan
	 * farký, diðer sýnýflara nazaran çok fazla, kullanýma sahip olduðu için, java
	 * string sýnýfýnýn kullanýmýný kolaylaþtýrmýþtýr. String, bir karakter(char)
	 * dizisidir. String'in alabileceði maksimum karakter sayýsý 2.14 milyardýr.
	 */
	public static void main(String[] args) {

		String stringValue = "Bu bir string tipinde deðerdir.";
		System.out.println("String deðer: " + stringValue);

		// Ýki string ifadeyi birleþtirme
		String isim = "Utku";
		String Soyisim = "Doðan";
		String tamIsim = isim + " " + Soyisim;
		System.out.println(tamIsim);

		// Örnek:
		String birinciSayi = "12.34";
		String ikinciSayi = "54.98";
		String toplam = birinciSayi + ikinciSayi;
		System.out.println(toplam); // Sonuç ne olur?

		String stringDeger = "10";
		int integerDeger = 20;
		String sonucStringOnce = stringDeger + integerDeger;
		System.out.println(sonucStringOnce);

		String sonucStringSonra = integerDeger + stringDeger;
		System.out.println(sonucStringSonra);

		// java, string deðerin int deðerle toplanmasýný, string bir iþlem olarak
		// gerçekleþtiriyor fakat
		// bu iþlem öncesinde int tipindeki deðiþken, string sýnýfýna döndürülüyor.

		String stringText = "10";
		double doubleDeger = 12.45D;
		String SonucStrinDouble = stringText + doubleDeger;
		System.out.println(SonucStrinDouble);

		int sonucInteger = integerDeger + Integer.parseInt(stringDeger);
		System.out.println(sonucInteger);

		/*
		 * String deðerler deðiþtirilemez. (immutable) String ifadeler yeniden
		 * oluþturulurlar. Ýleride bununla ilgili detaylý konuþacaðýz. Bu konu ile
		 * ilgili StringBuffer ile deðeri deðiþtirilebilir string ifadeler hakkýnda da
		 * konuþacaðýz.
		 */

	}

}