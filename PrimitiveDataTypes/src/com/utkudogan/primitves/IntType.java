package com.utkudogan.primitves;

/*
 * Int, 32 bit i�erir
 */
public class IntType {

	public static void main(String[] args) {
		
		//int tipinin saklayabilece�i minimum ve maksimum de�erler vard�r
		int myValue = 10000;
		
		//Integer -> Wrapper class: t�m primitive t�rler i�in var. 
		//Wrapper class i�indeki MIN_VALUE ve MAX_VALUE sabitlerini kulland�k
		int myMinimumIntValue = Integer.MIN_VALUE;
		int myMaximumIntValue = Integer.MAX_VALUE;
		
		//A�a��da int de�eri t�r de�i�imine u�rad�. K�saca say�sal de�erini kaybetti, metin de�eri kazand�.
		//Veri t�rleri aras�ndaki de�i�im daha sonra a��klanacak.
		System.out.println("My minimum int value: " + myMinimumIntValue);
		System.out.println("My maximum int value: " + myMaximumIntValue);
		
		
		int overFlow = myMaximumIntValue + 1;
		int underFlow = myMinimumIntValue - 1;
		System.out.println(overFlow);
		System.out.println(underFlow);
		
		//Yaz�l�mc� olarak uygun veri t�r�n� kullanmak, bizim sorumlulu�umuzda
		
		//int maximumKontrol = 2147483648;
		
		//java 7 ve �zeri i�in ge�erli
		int easyToRead = 2_147_483_647;
	}
}
