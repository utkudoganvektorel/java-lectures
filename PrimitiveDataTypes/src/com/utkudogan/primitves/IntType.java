package com.utkudogan.primitves;

/*
 * Int, 32 bit içerir
 */
public class IntType {

	public static void main(String[] args) {
		
		//int tipinin saklayabileceði minimum ve maksimum deðerler vardýr
		int myValue = 10000;
		
		//Integer -> Wrapper class: tüm primitive türler için var. 
		//Wrapper class içindeki MIN_VALUE ve MAX_VALUE sabitlerini kullandýk
		int myMinimumIntValue = Integer.MIN_VALUE;
		int myMaximumIntValue = Integer.MAX_VALUE;
		
		//Aþaðýda int deðeri tür deðiþimine uðradý. Kýsaca sayýsal deðerini kaybetti, metin deðeri kazandý.
		//Veri türleri arasýndaki deðiþim daha sonra açýklanacak.
		System.out.println("My minimum int value: " + myMinimumIntValue);
		System.out.println("My maximum int value: " + myMaximumIntValue);
		
		
		int overFlow = myMaximumIntValue + 1;
		int underFlow = myMinimumIntValue - 1;
		System.out.println(overFlow);
		System.out.println(underFlow);
		
		//Yazýlýmcý olarak uygun veri türünü kullanmak, bizim sorumluluðumuzda
		
		//int maximumKontrol = 2147483648;
		
		//java 7 ve üzeri için geçerli
		int easyToRead = 2_147_483_647;
	}
}
