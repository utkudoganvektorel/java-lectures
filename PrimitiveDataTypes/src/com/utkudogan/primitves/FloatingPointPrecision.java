package com.utkudogan.primitves;

import java.math.BigDecimal;

public class FloatingPointPrecision {

	public static void main(String[] args) {
		int myIntValue = 5 / 2;
		float myFloatValue = 5f / 2;
		double myDoubleValue = 5d / 2;
		
		//ondal�kl� i�lemlerde, int ondal�kl� k�sm� atar ama float ve double ondal�kl� k�sm� g�sterir
		System.out.println("my int value: " + myIntValue);
		System.out.println("my float value: " + myFloatValue);
		System.out.println("my double value: " + myDoubleValue);
		
		myIntValue = 5 / 3;
		myFloatValue = 5f / 3;
		myDoubleValue = 5d / 3;
		
		System.out.println("my int value: " + myIntValue);
		System.out.println("my float value: " + myFloatValue);
		//double daha iyi precision'a sahiptir
		System.out.println("my double value: " + myDoubleValue);
		
		//default value of floating numbers is double
		//double daha fazla yer kaplmamas�na ra�men haf�zada, float'a g�re daha daha h�zl� i�lem g�r�r.
		//�ip seviyesinde double, bilgisayarlarda daha performansl� �al���r.
		//ileride kullan�ca��m�z ondalikle say�larla i�lem yapan metotlar, double t�r�nde bize d�n�� yapacak.
		double defaultValue = 5.00 / 3.00;
		
		/*�rnek: pound a��rl�k birimini, kilo grama �evir
		 * bir de�i�ken olu�tur ve uygun bir pound biriminde de�er ata
		 * de�i�keni kilograma d�n��t�r 
		 * de�i�keni yazd�r
		 * 1 pound = 0.45359237 kg
		 */
		
		double numberPounds = 200d;
		double convertedKilogram = numberPounds * 0.45359237d;
		System.out.println("Converted kilograms= " + convertedKilogram);
		
		double pi = 3.1415927d;
		double anotherDouble = 3_000_000.4_546_647d;
		System.out.println(pi);
		System.out.println(anotherDouble);
		
		//double ve float, ondal�kl� say�lar i�in kullan�l�r ama precision'a y�ksek olan i�lemlerde kullan�lmamal�d�r.
		//java'n�n primitive ytype'Leri olu�tururken g�ze ald��� bnir sorun bu.
		//BigDecimal bu sorun i�in olu�turuldu ama daha sonra konu�aca��z
		
	}
}
