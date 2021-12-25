package com.utkudogan.primitves;
/*
 * Single precision number
 * 32 bit
 */
public class FloatType {

	
	public static void main(String[] args) {
		// float tipinin saklayabilece�i minimum ve maksimum de�erler vard�r
		float myValue = 3;
		
		//Float -> Wrapper class: t�m primitive t�rler i�in var. 
		//Wrapper class i�indeki MIN_VALUE ve MAX_VALUE sabitlerini kulland�k
		float myMinimumFloatValue = Float.MIN_VALUE;
		float myMaximumFloatValue = Float.MAX_VALUE;
		
		//A�a��da float de�eri t�r de�i�imine u�rad�. K�saca say�sal de�erini kaybetti, metin de�eri kazand�.
		//Veri t�rleri aras�ndaki de�i�im daha sonra a��klanacak.
		System.out.println("My minimum float value: " + myMinimumFloatValue);
		System.out.println("My maximum float value: " + myMaximumFloatValue);

		int myIntValue = 5;
		//f konulmazsa hata al�n�r. default double javada ondal�kl� say�lar i�in
		float myfloatValue = 5.7F;
		double myDoubleValue = 5D;
		
		//Yaz�l�mc� olarak uygun veri t�r�n� kullanmak, bizim sorumlulu�umuzda


	}

}
