/*
You are given an odd-length array of integers, in which all of them are the same, except for one single number.

Complete the method which accepts such an array, and returns that single different number.

The input array will always be valid! (odd-length >= 3)
Examples

[1, 1, 2] ==> 2
[17, 17, 3, 17, 17, 17, 17] ==> 3
*/
package Kata;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class FindTheStrayNumber {

    public static int stray(int[] numbers){
        HashMap<Integer, Integer> counter = new HashMap<>();

        for(int i : numbers){
            if(counter.containsKey(i)) counter.put(i, counter.get(i)+1);
            else counter.put(i, 1);
        }

        for(final Map.Entry entry : counter.entrySet()){
            if((int)entry.getValue() == 1) return (int)entry.getKey();
        }
        return 0;
    }

    @Test
    public void simpleArray1() {
      assertEquals(2, getActualFor(1, 1, 2));
    }
    
    private int getActualFor(int... numbers) {
      return stray(numbers);
    }
    
}