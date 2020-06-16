/*
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
*/
package Kata;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class XO {
    public static boolean getXO (String str) {
        String[] clean = str.toLowerCase().split("");
        int countX = 0;
        int countO = 0;
        for(String s : clean){
            if(s.equals("x")) countX +=1;
            if(s.equals("o")) countO +=1;
        }
        return countX == countO;
    }

    @Test
    public void testSomething1() {
      assertEquals(true, getXO("xxxooo"));
    }
    
    @Test
    public void testSomething2() {
      assertEquals(true, getXO("xxxXooOo"));
    }
    
    @Test
    public void testSomething3() {
      assertEquals(false, getXO("xxx23424esdsfvxXXOOooo"));
    }
    
    @Test
    public void testSomething4() {
      assertEquals(false, getXO("xXxxoewrcoOoo"));
    }
    
    @Test
    public void testSomething5() {
      assertEquals(false, getXO("XxxxooO"));
    }
    
    @Test
    public void testSomething6() {
      assertEquals(true, getXO("zssddd"));
    }
    
    @Test
    public void testSomething7() {
      assertEquals(false, getXO("Xxxxertr34"));
    }
}