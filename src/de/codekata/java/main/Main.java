package de.codekata.java.main;

import de.codekata.java.util.StringUtil;

public class Main {

	public static void main(String[] args) {
		
		String[] wordPool1 = {"aabb", "abca", "baba", "adba"};

		System.out.println(StringUtil.countAnagramsInArrayOfWords(wordPool1, "abba"));

	}

}
