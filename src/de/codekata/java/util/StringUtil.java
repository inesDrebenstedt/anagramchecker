package de.codekata.java.util;

import java.util.HashMap;

public class StringUtil {

	public static int getOcurrenyOfLetter(char c, String testWord) {
		char[] wordAsCharArr = testWord.toCharArray();
		int ocurrencyOfLetter = 0;

		for (char singleChar : wordAsCharArr) {
			ocurrencyOfLetter = checkIfLetterEqualsGivenChar(singleChar, c, ocurrencyOfLetter);
		}

		return ocurrencyOfLetter;
	}

	private static int checkIfLetterEqualsGivenChar(char singleChar, char givenChar, int occurency) {

		if (singleChar == givenChar) {
			occurency++;
		}
		return occurency;
	}

	public static HashMap<Character, Integer> getOccurenciesOfLettersInWord(String testWord) {
		HashMap<Character, Integer> occurenciesAsList = new HashMap<Character, Integer>();
		char[] testWordAsArr = testWord.toCharArray();

		for (int i = 0; i < testWord.length(); i++) {
			if (!isAlreadyChecked(testWord.charAt(i), occurenciesAsList)) {
				int occurency = getOcurrenyOfLetter(testWordAsArr[i], testWord);
				occurenciesAsList.put(testWord.charAt(i), occurency);
			}
		}
		return occurenciesAsList;
	}

	private static boolean isAlreadyChecked(char c, HashMap<Character, Integer> occurenciesAsList) {
		boolean result = false;
		if (occurenciesAsList.containsKey(c)) {
			result = true;
		}
		return result;
	}

	public static boolean checkIfAnagram(String word1, String word2) {
		boolean hasSameLetterOccurency = false;
		if (getOccurenciesOfLettersInWord(word1).equals(getOccurenciesOfLettersInWord(word2))) {
			hasSameLetterOccurency = true;
		}
		return hasSameLetterOccurency;
	}

	public static int countAnagramsInArrayOfWords(String[] wordPool, String givenWord) {
		int countHits = 0;

		for (String word : wordPool) {
			boolean isAnagram = checkIfAnagram(word, givenWord);

			if (isAnagram) {
				countHits++;
			}
		}

		return countHits;
	}

}
