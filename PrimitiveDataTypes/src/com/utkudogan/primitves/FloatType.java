package com.utkudogan.primitves;
/*
 * Single precision number
 * 32 bit
 */
public class FloatType {

	
	public static void main(String[] args) {
		// float tipinin saklayabileceði minimum ve maksimum deðerler vardýr
		float myValue = 3;
		
		//Float -> Wrapper class: tüm primitive türler için var. 
		//Wrapper class içindeki MIN_VALUE ve MAX_VALUE sabitlerini kullandýk
		float myMinimumFloatValue = Float.MIN_VALUE;
		float myMaximumFloatValue = Float.MAX_VALUE;
		
		//Aþaðýda float deðeri tür deðiþimine uðradý. Kýsaca sayýsal deðerini kaybetti, metin deðeri kazandý.
		//Veri türleri arasýndaki deðiþim daha sonra açýklanacak.
		System.out.println("My minimum float value: " + myMinimumFloatValue);
		System.out.println("My maximum float value: " + myMaximumFloatValue);

		int myIntValue = 5;
		//f konulmazsa hata alýnýr. default double javada ondalýklý sayýlar için
		float myfloatValue = 5.7F;
		double myDoubleValue = 5D;
		
		//Yazýlýmcý olarak uygun veri türünü kullanmak, bizim sorumluluðumuzda


	}

}
