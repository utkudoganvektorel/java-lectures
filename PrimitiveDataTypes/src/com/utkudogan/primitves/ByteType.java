package com.utkudogan.primitves;

/*
 * Byte, 8 bit i�erir
 */
public class ByteType {

	public static void main(String[] args) {
		// byte tipinin saklayabilece�i minimum ve maksimum de�erler vard�r
		byte myValue = 3;
		
		//Byte -> Wrapper class: t�m primitive t�rler i�in var. 
		//Wrapper class i�indeki MIN_VALUE ve MAX_VALUE sabitlerini kulland�k
		byte myMinimumByteValue = Byte.MIN_VALUE;
		byte myMaximumByteValue = Byte.MAX_VALUE;
		
		//A�a��da byte de�eri t�r de�i�imine u�rad�. K�saca say�sal de�erini kaybetti, metin de�eri kazand�.
		//Veri t�rleri aras�ndaki de�i�im daha sonra a��klanacak.
		System.out.println("My minimum byte value: " + myMinimumByteValue);
		System.out.println("My maximum byte value: " + myMaximumByteValue);
		
		int overFlow = myMaximumByteValue + 1;
		int underFlow = myMinimumByteValue - 1;
		System.out.println(overFlow);
		System.out.println(underFlow);
		
		//Yaz�l�mc� olarak uygun veri t�r�n� kullanmak, bizim sorumlulu�umuzda

	}

}
