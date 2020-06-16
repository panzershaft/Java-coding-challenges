/*
Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
Examples
Valid arrays

a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]

comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144, 361 the square of 19, 25921 the square of 161, and so on. It gets obvious if we write b's elements in terms of squares:

a = [121, 144, 19, 161, 19, 144, 19, 11] 
b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
*/

package Kata;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

public class AreSame {

    public static boolean comp(int[] a, int[] b){
        
        if ((a == null || b == null)||(a.length != b.length)) return false;

        for(int i = 0; i < a.length; i++)
            a[i] *= a[i];
        
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i =0; i < a.length; i++)
            if(a[i] != b[i]) return false;
        
        return true;
    }

    @Test
	public void test1() {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		assertEquals(true, comp(a, b)); 
	}
    
}