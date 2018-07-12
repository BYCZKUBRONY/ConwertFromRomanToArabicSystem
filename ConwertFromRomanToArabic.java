package de.ConwertFromRomanToArabic;

import java.util.Scanner;


public class ConwertFromRomanToArabic {
	public static int ConvertRomanToArabic(String romanNumber,int arabicNumber) {
		String temporaryRomanNumber;
		if(romanNumber.startsWith("M")) {
			temporaryRomanNumber=romanNumber.substring(1);
			return ConvertRomanToArabic(temporaryRomanNumber, arabicNumber+1000);
		}
		if(romanNumber.startsWith("CM")) {
			temporaryRomanNumber=romanNumber.substring(2);
			return ConvertRomanToArabic(temporaryRomanNumber, arabicNumber+900);
		}
		if(romanNumber.startsWith("D")) {
			temporaryRomanNumber=romanNumber.substring(1);
			return ConvertRomanToArabic(temporaryRomanNumber, arabicNumber+500);
		}
		if(romanNumber.startsWith("CD")) {
			temporaryRomanNumber=romanNumber.substring(2);
			return ConvertRomanToArabic(temporaryRomanNumber, arabicNumber+400);
		}		
		if(romanNumber.startsWith("C")) {
			temporaryRomanNumber=romanNumber.substring(1);
			return ConvertRomanToArabic(temporaryRomanNumber, arabicNumber+100);
		}
		if(romanNumber.startsWith("XC")) {
			temporaryRomanNumber=romanNumber.substring(2);
			return ConvertRomanToArabic(temporaryRomanNumber, arabicNumber+90);
		}
		if(romanNumber.startsWith("L")) {
			temporaryRomanNumber=romanNumber.substring(1);
			return ConvertRomanToArabic(temporaryRomanNumber, arabicNumber+50);
		}
		if(romanNumber.startsWith("XL")) {
			temporaryRomanNumber=romanNumber.substring(2);
			return ConvertRomanToArabic(temporaryRomanNumber, arabicNumber+40);
		}
		if(romanNumber.startsWith("X")) {
			temporaryRomanNumber=romanNumber.substring(1);
			return ConvertRomanToArabic(temporaryRomanNumber, arabicNumber+10);
		}
		if(romanNumber.startsWith("IX")) {
			temporaryRomanNumber=romanNumber.substring(2);
			return ConvertRomanToArabic(temporaryRomanNumber, arabicNumber+9);
		}
		if(romanNumber.startsWith("V")) {
			temporaryRomanNumber=romanNumber.substring(1);
			return ConvertRomanToArabic(temporaryRomanNumber, arabicNumber+5);
		}
		if(romanNumber.startsWith("IV")) {
			temporaryRomanNumber=romanNumber.substring(2);
			return ConvertRomanToArabic(temporaryRomanNumber, arabicNumber+4);
		}
		if(romanNumber.startsWith("I")) {
			temporaryRomanNumber=romanNumber.substring(1);
			return ConvertRomanToArabic(temporaryRomanNumber, arabicNumber+1);
		}
		return arabicNumber;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String romanNumber=scan.nextLine();
		System.out.println(ConvertRomanToArabic(romanNumber, 0));

	}

}
