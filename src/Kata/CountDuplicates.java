/*
Count the number of Duplicates

Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
Example

"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice

*/
package Kata;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountDuplicates {

    public static int duplicateCount(final String text){
        final char[] array = text.toLowerCase().toCharArray();
        final HashMap<Character, Integer> counter = new HashMap<>();
        int duplicates = 0;
        
        for(final char ch: array){
            if(counter.containsKey(ch)) counter.put(ch, counter.get(ch)+ 1);
            else counter.put(ch, 1);
        }

        for(final Map.Entry entry: counter.entrySet()){
            if((int)entry.getValue() >= 2) duplicates += 1;
        }
        return duplicates;
    }

    @Test
    public void abcdeReturnsZero() {
        assertEquals(0, duplicateCount("abcde"));
    }
    
    @Test
    public void abcdeaReturnsOne() {
        assertEquals(1, duplicateCount("abcdea"));
    }
    
}