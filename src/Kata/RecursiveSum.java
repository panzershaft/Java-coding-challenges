package Kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RecursiveSum{

    public static int recurSum(int n){
        if (n <= 1)
            return n;
        return n + recurSum(n-1);
    }

    @Test
    public void example1(){
        int expected = 3;
        int actual = recurSum(2);
        assertEquals(expected, actual);
    }

    @Test
    public void example2(){
        int expected = 15;
        int actual = recurSum(5);
        assertEquals(expected, actual);
    }

    @Test
    public void example3(){
        int expected = 300;
        int actual = recurSum(24);
        assertEquals(expected, actual);
    }

}