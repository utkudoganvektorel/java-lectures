package com.utkudogan.primitves;
/*
 * Short, 16 bit içerir
 */
public class ShortType {

	public static void main(String[] args) {
		// short tipinin saklayabileceði minimum ve maksimum deðerler vardýr
		short myValue = 3;
		
		//Short -> Wrapper class: tüm primitive türler için var. 
		//Wrapper class içindeki MIN_VALUE ve MAX_VALUE sabitlerini kullandýk
		short myMinimumShortValue = Short.MIN_VALUE;
		short myMaximumShortValue = Short.MAX_VALUE;
		
		//Aþaðýda short deðeri tür deðiþimine uðradý. Kýsaca sayýsal deðerini kaybetti, metin deðeri kazandý.
		//Veri türleri arasýndaki deðiþim daha sonra açýklanacak.
		System.out.println("My minimum short value: " + myMinimumShortValue);
		System.out.println("My maximum short value: " + myMaximumShortValue);
		
		int overFlow = myMaximumShortValue + 1;
		int underFlow = myMinimumShortValue - 1;
		System.out.println(overFlow);
		System.out.println(underFlow);
		
		//Yazýlýmcý olarak uygun veri türünü kullanmak, bizim sorumluluðumuzda

	}

}
