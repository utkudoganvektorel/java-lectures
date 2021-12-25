package com.utkudogan.primitves;

public class Casting {
	public static void main(String[] args) {
		
		int minInt = Integer.MIN_VALUE;
		byte minByte = Byte.MIN_VALUE;
		short minShort = Short.MIN_VALUE;
		
		//java'da yazýlan tam sayýlar int tipinde kabul edilir.
		
		int controlIntDivision = minInt / 2;
		byte controlByteDivision = (byte)(minByte / 2);
		short controlShortDivision = (short)(minShort / 2);
	}
}
