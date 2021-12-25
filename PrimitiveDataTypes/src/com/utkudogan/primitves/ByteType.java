package com.utkudogan.primitves;

/*
 * Byte, 8 bit içerir
 */
public class ByteType {

	public static void main(String[] args) {
		// byte tipinin saklayabileceði minimum ve maksimum deðerler vardýr
		byte myValue = 3;
		
		//Byte -> Wrapper class: tüm primitive türler için var. 
		//Wrapper class içindeki MIN_VALUE ve MAX_VALUE sabitlerini kullandýk
		byte myMinimumByteValue = Byte.MIN_VALUE;
		byte myMaximumByteValue = Byte.MAX_VALUE;
		
		//Aþaðýda byte deðeri tür deðiþimine uðradý. Kýsaca sayýsal deðerini kaybetti, metin deðeri kazandý.
		//Veri türleri arasýndaki deðiþim daha sonra açýklanacak.
		System.out.println("My minimum byte value: " + myMinimumByteValue);
		System.out.println("My maximum byte value: " + myMaximumByteValue);
		
		int overFlow = myMaximumByteValue + 1;
		int underFlow = myMinimumByteValue - 1;
		System.out.println(overFlow);
		System.out.println(underFlow);
		
		//Yazýlýmcý olarak uygun veri türünü kullanmak, bizim sorumluluðumuzda

	}

}
