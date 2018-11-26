package com.numbercontat;

public class NumberContat {

	public static int buildTheThird(final int firstNumber, final int secondNumber) {

		// Check if booth are ZERO
		if (firstNumber == 0 && secondNumber == 0) {
			return 0;
		}

		String first = String.valueOf(firstNumber);
		String second = String.valueOf(secondNumber);

		// Check if exceeds 7 digits
		if ((first.length() + second.length()) >= 7) {
			return -1;
		}

		// Cast to Array
		char[] firstArr = first.toCharArray();
		char[] secondArr = second.toCharArray();

		// Concat Arrys
		char[] thirdArr = concatArry(firstArr, secondArr);

		return Integer.parseInt(String.valueOf(thirdArr));
	}

	private static char[] concatArry(char[] firstArr, char[] secondArr) {

		// Define the size for the third array
		int thirdArrSize = firstArr.length + secondArr.length;
		char[] thirdArr = new char[thirdArrSize];

		int firstCt = 0;
		int secondCt = 0;

		Boolean thirdTime = true;

		for (int i = 0; i < thirdArrSize; i++) {

			// Get in the first Array
			if (thirdTime) {

				if (firstArr.length - 1 >= firstCt && firstArr[firstCt] != Character.MIN_VALUE) {
					thirdArr[i] = firstArr[firstCt];
					firstCt++;
					thirdTime = false;
				} else if (secondArr.length - 1 >= secondCt && secondArr[secondCt] != Character.MIN_VALUE) {
					thirdArr[i] = secondArr[secondCt];
					secondCt++;
					thirdTime = false;
				}

			}
			// Get in the second Array
			else {

				if (secondArr.length - 1 >= secondCt && secondArr[secondCt] != Character.MIN_VALUE) {
					thirdArr[i] = secondArr[secondCt];
					secondCt++;
					thirdTime = true;
				} else if (firstArr.length - 1 >= firstCt && firstArr[firstCt] != Character.MIN_VALUE) {
					thirdArr[i] = firstArr[firstCt];
					firstCt++;
					thirdTime = true;
				}
			}

		}

		return thirdArr;
	}
}
