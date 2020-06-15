/*
Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.

Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.

Example:

Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"

Note that the Java version expects a return value of null for an empty string or null.
 */
package Kata;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;


public class JadenCastingStrings {
	
	public String toJadenCase(String phrase) {
		
		if (phrase == null || phrase.equals("")) return null;
		
		char[] array = phrase.toCharArray();
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i < array.length; i++) {
			if(i == 0 || array[i-1] == ' ') result.append(Character.toUpperCase(array[i])); 
			else result.append(array[i]);
		}

		return result.toString();
	}
	
	
	
	@Test
	public void test() {
		assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", toJadenCase("most trees are blue"));
	}
	
	@Test
	public void testNullArg() {
		assertNull("Must return null when the arg is null", toJadenCase(null));
	}
	
	@Test
	public void testEmptyArg() {
		assertNull("Must return null when the arg is empty string", toJadenCase(""));
	}
	
}


