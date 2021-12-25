package com.utkudogan.primitves;

public class Ornek {
/*
 * 1 byte tanýmla ve geçerlli bir deðer ata
 * 1 short tanýmla ve geçerli bir deðer ata
 * 1 int tanýmla ve geçerli deðer ata
 * 1 long tanýmla ve 50000 + 10 * (int + short + byte)
 */
	
	public static void main(String[] args) {
		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;
		
		long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
	}
}
