package com.utkudogan.primitves;
/*
 * Short, 16 bit i�erir
 */
public class ShortType {

	public static void main(String[] args) {
		// short tipinin saklayabilece�i minimum ve maksimum de�erler vard�r
		short myValue = 3;
		
		//Short -> Wrapper class: t�m primitive t�rler i�in var. 
		//Wrapper class i�indeki MIN_VALUE ve MAX_VALUE sabitlerini kulland�k
		short myMinimumShortValue = Short.MIN_VALUE;
		short myMaximumShortValue = Short.MAX_VALUE;
		
		//A�a��da short de�eri t�r de�i�imine u�rad�. K�saca say�sal de�erini kaybetti, metin de�eri kazand�.
		//Veri t�rleri aras�ndaki de�i�im daha sonra a��klanacak.
		System.out.println("My minimum short value: " + myMinimumShortValue);
		System.out.println("My maximum short value: " + myMaximumShortValue);
		
		int overFlow = myMaximumShortValue + 1;
		int underFlow = myMinimumShortValue - 1;
		System.out.println(overFlow);
		System.out.println(underFlow);
		
		//Yaz�l�mc� olarak uygun veri t�r�n� kullanmak, bizim sorumlulu�umuzda

	}

}
