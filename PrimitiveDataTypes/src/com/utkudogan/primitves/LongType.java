package com.utkudogan.primitves;

public class LongType {

	public static void main(String[] args) {
		// long tipinin saklayabilece�i minimum ve maksimum de�erler vard�r
		// de�erinin sonuna l ya da L konularak kullan�l�r ama L tercih edilmeli 1 ile kar��mamas� i�in
		//L konulmazsa, de�er integer olarak alg�lan�r java taraf�ndan.
		long myValue = 23424424432L;
		
		long controlWithIntRange = 100;
		
		//Long -> Wrapper class: t�m primitive t�rler i�in var. 
		//Wrapper class i�indeki MIN_VALUE ve MAX_VALUE sabitlerini kulland�k
		long myMinimumLongValue = Long.MIN_VALUE;
		long myMaximumLongValue = Long.MAX_VALUE;
		
		//A�a��da long de�eri t�r de�i�imine u�rad�. K�saca say�sal de�erini kaybetti, metin de�eri kazand�.
		//Veri t�rleri aras�ndaki de�i�im daha sonra a��klanacak.
		System.out.println("My minimum long value: " + myMinimumLongValue);
		System.out.println("My maximum long value: " + myMaximumLongValue);
	
		
		//Yaz�l�mc� olarak uygun veri t�r�n� kullanmak, bizim sorumlulu�umuzda

	}

}
