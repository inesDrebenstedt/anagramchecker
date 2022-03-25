package de.codekata.java.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import de.codekata.java.util.StringUtil;

public class TestCharOccurency {
	
	private static String testWord = "abba";
	public static  String[] wordPool1 = {"aabb", "abca", "baba", "adba"};
	
	@Test
	public void testOcurrencyOfLetterA() {
		boolean aIsThere = testWord.contains("a");
		assertEquals(aIsThere, true);
	}
	
	@Test
	public void testLetterAOccursTwice() {
		int assumedOcurrencyOfLetterA = 2;
		int realOcurrencyOfLetterA = StringUtil.getOcurrenyOfLetter('a', testWord);
		assertEquals(assumedOcurrencyOfLetterA, realOcurrencyOfLetterA);
	}
	
	@Test
	public void testTwoDifferentLettersOccurTwice() {
		int realOcurrencyOfLetterA = StringUtil.getOcurrenyOfLetter('a', testWord);
		int realOcurrencyOfLetterB = StringUtil.getOcurrenyOfLetter('b', testWord);
		assertEquals(realOcurrencyOfLetterA, realOcurrencyOfLetterB);
	}
	
	@Test
	public void testOccurenciesOfLettersInTwoWords() {
		String word1 = "abba";
		String word2 = "baab";
		HashMap<Character, Integer> word1Map = StringUtil.getOccurenciesOfLettersInWord(word1);
		HashMap<Character, Integer> word2Map = StringUtil.getOccurenciesOfLettersInWord(word2);
		assertEquals(word1Map, word2Map);
	}
	
	@Test
	public void testIfNoAnagram() {
		String word1 = "abba";
		String word2 = "abcd";
		HashMap<Character, Integer> word1Map = StringUtil.getOccurenciesOfLettersInWord(word1);
		HashMap<Character, Integer> word2Map = StringUtil.getOccurenciesOfLettersInWord(word2);
		assertNotEquals(word1Map, word2Map);
	}
	
	@Test
	public void testAnagramsInWordPool() {
		int assumedOccurency = 2;
		int realOccurency = StringUtil.countAnagramsInArrayOfWords(wordPool1, testWord);
		boolean compare = (realOccurency == assumedOccurency);
		assertEquals(compare, true);
	}

}
