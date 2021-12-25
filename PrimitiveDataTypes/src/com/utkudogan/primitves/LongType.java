package com.utkudogan.primitves;

public class LongType {

	public static void main(String[] args) {
		// long tipinin saklayabileceði minimum ve maksimum deðerler vardýr
		// deðerinin sonuna l ya da L konularak kullanýlýr ama L tercih edilmeli 1 ile karýþmamasý için
		//L konulmazsa, deðer integer olarak algýlanýr java tarafýndan.
		long myValue = 23424424432L;
		
		long controlWithIntRange = 100;
		
		//Long -> Wrapper class: tüm primitive türler için var. 
		//Wrapper class içindeki MIN_VALUE ve MAX_VALUE sabitlerini kullandýk
		long myMinimumLongValue = Long.MIN_VALUE;
		long myMaximumLongValue = Long.MAX_VALUE;
		
		//Aþaðýda long deðeri tür deðiþimine uðradý. Kýsaca sayýsal deðerini kaybetti, metin deðeri kazandý.
		//Veri türleri arasýndaki deðiþim daha sonra açýklanacak.
		System.out.println("My minimum long value: " + myMinimumLongValue);
		System.out.println("My maximum long value: " + myMaximumLongValue);
	
		
		//Yazýlýmcý olarak uygun veri türünü kullanmak, bizim sorumluluðumuzda

	}

}
