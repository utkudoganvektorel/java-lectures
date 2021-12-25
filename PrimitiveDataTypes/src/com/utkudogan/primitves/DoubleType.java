package com.utkudogan.primitves;
/*
 * double precision number
 * 64 bit
 */
public class DoubleType {

	public static void main(String[] args) {
		// double tipinin saklayabilece�i minimum ve maksimum de�erler vard�r
		double myValue = 3;
		
		//Double -> Wrapper class: t�m primitive t�rler i�in var. 
		//Wrapper class i�indeki MIN_VALUE ve MAX_VALUE sabitlerini kulland�k
		double myMinimumDoubleValue = Double.MIN_VALUE;
		double myMaximumDoubleValue = Double.MAX_VALUE;
		
		//A�a��da double de�eri t�r de�i�imine u�rad�. K�saca say�sal de�erini kaybetti, metin de�eri kazand�.
		//Veri t�rleri aras�ndaki de�i�im daha sonra a��klanacak.
		System.out.println("My minimum double value: " + myMinimumDoubleValue);
		System.out.println("My maximum double value: " + myMaximumDoubleValue);
		

		//Yaz�l�mc� olarak uygun veri t�r�n� kullanmak, bizim sorumlulu�umuzda

	}

}
