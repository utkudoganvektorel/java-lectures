package com.utkudogan.primitves;

public class Ornek {
/*
 * 1 byte tan�mla ve ge�erlli bir de�er ata
 * 1 short tan�mla ve ge�erli bir de�er ata
 * 1 int tan�mla ve ge�erli de�er ata
 * 1 long tan�mla ve 50000 + 10 * (int + short + byte)
 */
	
	public static void main(String[] args) {
		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;
		
		long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
	}
}
