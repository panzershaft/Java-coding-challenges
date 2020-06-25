/*
(from wikipedia: https://en.wikipedia.org/wiki/Luhn_algorithm)
The Luhn algorithm or Luhn formula, also known as the "modulus 10" or "mod 10" algorithm, 
named after its creator, IBM scientist Hans Peter Luhn, is a simple checksum formula used 
to validate a variety of identification numbers, such as credit card numbers, IMEI numbers, 
National Provider Identifier numbers in the United States, Canadian Social Insurance Numbers, 
Israeli ID Numbers, South African ID Numbers, Greek Social Security Numbers (ΑΜΚΑ), and survey 
codes appearing on McDonald's, Taco Bell, and Tractor Supply Co. receipts. 
It is described in U.S. Patent No. 2,950,048, filed on January 6, 1954, and granted on August 23, 1960.
*/

package Kata;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Luhn {

    public static boolean LuhnsAlgo(String digit)
    {
        char[] values = digit.toCharArray();
        int check_sum = 0;
        int double_digit = 0;
        for(int i = 0; i < values.length ; i++)
        {
            if (i%2 != 0)
            {
                double_digit = ((values[i]-'0')*2);
                if (double_digit >= 10) check_sum += 1 + double_digit%10;
                else check_sum += double_digit;
            } 
            else check_sum += values[i]-'0';
        }
        return check_sum%10 == 0;
    }
    
    @Test
    public void example1(){
        Boolean expected = true;
        Boolean actual = LuhnsAlgo("1762483");
        assertEquals(expected, actual);
    }


    @Test
    public void example2(){
        Boolean expected = true;
        Boolean actual = LuhnsAlgo("79927398713");
        assertEquals(expected, actual);
    }
    
}