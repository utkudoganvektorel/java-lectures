package com.utkudogan.primitves;
/*
 * char, hafýza 16 bitlik yer kaplar. Amaç sadece sadece unicode karakter saklamak deðildir.
 * unicode, uluslararasý bir standart ve birçeok dil tarafýndan kullanýlýyor. harf, rakam, sembol için deðerler var.
 * unicode tablosunda 65535 adet deðer var. bu yüzden char 16 bit
 * unicode-table.com
 */
/*
 * Boolena iki adet deðer alýr: True ya da False, Yes or No, 1 ya da 0
 */
public class CharAndBoolean {

	public static void main(String[] args) {
		char myChar = 'D';
		System.out.println(myChar);
		
		//UNICODE table
		int testChar = (int)myChar;
		System.out.println(testChar);
		
		char myUnicode = '\u0044';
		System.out.println(myUnicode);
		
		
		//char, string'ten farklýdýr. Karakter saklanabilir ama sadece 1 tane karakter saklanabilir
		//char myChar2 = 'DE';
		
		//Oyunlarda basýlan tuþu saklamak için kullanýlabilir char türü
		//amaç yine hafýza korumaktý ama artk bilgisayarlar için büyük sorun deðil hafýza kontrolü
		
		//copywright karakterini yazdýrýn '\u00A9'
		
		boolean myTrue = true;
		boolean myFalse = false;
		
		

	}

}
