/*
Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.

Write a function which takes a list of strings and returns each line prepended by the correct number.

The numbering starts at 1. The format is n: string. Notice the colon and space in between.

Examples:

number(Arrays.asList()) # => []
number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]
*/

package Kata;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test123 {
    public static List<String> number(List<String> lines){
        List<String> items = new ArrayList<>();
        int counter = 0;
        for(String line : lines){
            counter +=1;
            items.add(String.valueOf(counter)+": "+line);
        }
        return items;
    }
    @Test
    public void basicTests() {
        assertEquals(Arrays.asList(), number(Arrays.asList()));
        assertEquals(Arrays.asList("1: a", "2: b", "3: c"), number(Arrays.asList("a", "b", "c")));
        assertEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), number(Arrays.asList("", "", "", "", "")));
    }
    
}