package com.utkudogan.primitves;
/*
 * double precision number
 * 64 bit
 */
public class DoubleType {

	public static void main(String[] args) {
		// double tipinin saklayabileceði minimum ve maksimum deðerler vardýr
		double myValue = 3;
		
		//Double -> Wrapper class: tüm primitive türler için var. 
		//Wrapper class içindeki MIN_VALUE ve MAX_VALUE sabitlerini kullandýk
		double myMinimumDoubleValue = Double.MIN_VALUE;
		double myMaximumDoubleValue = Double.MAX_VALUE;
		
		//Aþaðýda double deðeri tür deðiþimine uðradý. Kýsaca sayýsal deðerini kaybetti, metin deðeri kazandý.
		//Veri türleri arasýndaki deðiþim daha sonra açýklanacak.
		System.out.println("My minimum double value: " + myMinimumDoubleValue);
		System.out.println("My maximum double value: " + myMaximumDoubleValue);
		

		//Yazýlýmcý olarak uygun veri türünü kullanmak, bizim sorumluluðumuzda

	}

}
