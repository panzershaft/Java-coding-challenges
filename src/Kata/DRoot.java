/*
Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.
Examples

    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
*/

package Kata;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import sun.security.util.Length;

public class DRoot {

    public static int digital_root(int n) {
        int length = String.valueOf(n).length();
        if (length == 1) return n;
        int sum   = 0;
        if (length > 1){
            String[] a = String.valueOf(n).split("");
            for(int i = 0; i < a.length; i++)
                sum += Integer.parseInt(a[i]);
        }
        return digital_root(sum);
    }
    @Test
    public void Tests() {
      assertEquals( "Nope!" , 7, DRoot.digital_root(16));
      assertEquals( "Nope!" , 6, DRoot.digital_root(456));
    }
  }