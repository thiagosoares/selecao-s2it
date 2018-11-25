package com.numbercontat;

public class NumberContat {

	public static int buildTheThird(int firstNumber, int secondNumber) {
		
		// Check if booth are ZERO
		if (firstNumber == 0 && secondNumber == 0) {
			return 0;
		}
		
		String first =  String.valueOf(firstNumber);
		String second =  String.valueOf(secondNumber);
		
		// Check if exceeds 7 digits
		if ( (first.length() + second.length()) >=7) {
			return -1;
		}
		
		// Cast to Array
		char[] firstArr = first.toCharArray();
		char[] secondArr = second.toCharArray();
		
		//Concat Arrys
		char[] thirdArr = concatArry(firstArr, secondArr);
		
		return Integer.parseInt(String.valueOf(thirdArr));
	}
	
	private static char[] concatArry(char[] firstArr, char[] secondArr) {
		return null;
	}
}
