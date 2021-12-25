package com.utkudogan.primitves;
/*
 * char, haf�za 16 bitlik yer kaplar. Ama� sadece sadece unicode karakter saklamak de�ildir.
 * unicode, uluslararas� bir standart ve bir�eok dil taraf�ndan kullan�l�yor. harf, rakam, sembol i�in de�erler var.
 * unicode tablosunda 65535 adet de�er var. bu y�zden char 16 bit
 * unicode-table.com
 */
/*
 * Boolena iki adet de�er al�r: True ya da False, Yes or No, 1 ya da 0
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
		
		
		//char, string'ten farkl�d�r. Karakter saklanabilir ama sadece 1 tane karakter saklanabilir
		//char myChar2 = 'DE';
		
		//Oyunlarda bas�lan tu�u saklamak i�in kullan�labilir char t�r�
		//ama� yine haf�za korumakt� ama artk bilgisayarlar i�in b�y�k sorun de�il haf�za kontrol�
		
		//copywright karakterini yazd�r�n '\u00A9'
		
		boolean myTrue = true;
		boolean myFalse = false;
		
		

	}

}
