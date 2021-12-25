package com.utkudogan.primitves;

import java.math.BigDecimal;

public class FloatingPointPrecision {

	public static void main(String[] args) {
		int myIntValue = 5 / 2;
		float myFloatValue = 5f / 2;
		double myDoubleValue = 5d / 2;
		
		//ondalýklý iþlemlerde, int ondalýklý kýsmý atar ama float ve double ondalýklý kýsmý gösterir
		System.out.println("my int value: " + myIntValue);
		System.out.println("my float value: " + myFloatValue);
		System.out.println("my double value: " + myDoubleValue);
		
		myIntValue = 5 / 3;
		myFloatValue = 5f / 3;
		myDoubleValue = 5d / 3;
		
		System.out.println("my int value: " + myIntValue);
		System.out.println("my float value: " + myFloatValue);
		//double daha iyi precision'a sahiptir
		System.out.println("my double value: " + myDoubleValue);
		
		//default value of floating numbers is double
		//double daha fazla yer kaplmamasýna raðmen hafýzada, float'a göre daha daha hýzlý iþlem görür.
		//Çip seviyesinde double, bilgisayarlarda daha performanslý çalýþýr.
		//ileride kullanýcaðýmýz ondalikle sayýlarla iþlem yapan metotlar, double türünde bize dönüþ yapacak.
		double defaultValue = 5.00 / 3.00;
		
		/*Örnek: pound aðýrlýk birimini, kilo grama çevir
		 * bir deðiþken oluþtur ve uygun bir pound biriminde deðer ata
		 * deðiþkeni kilograma dönüþtür 
		 * deðiþkeni yazdýr
		 * 1 pound = 0.45359237 kg
		 */
		
		double numberPounds = 200d;
		double convertedKilogram = numberPounds * 0.45359237d;
		System.out.println("Converted kilograms= " + convertedKilogram);
		
		double pi = 3.1415927d;
		double anotherDouble = 3_000_000.4_546_647d;
		System.out.println(pi);
		System.out.println(anotherDouble);
		
		//double ve float, ondalýklý sayýlar için kullanýlýr ama precision'a yüksek olan iþlemlerde kullanýlmamalýdýr.
		//java'nýn primitive ytype'Leri oluþtururken göze aldýðý bnir sorun bu.
		//BigDecimal bu sorun için oluþturuldu ama daha sonra konuþacaðýz
		
	}
}
