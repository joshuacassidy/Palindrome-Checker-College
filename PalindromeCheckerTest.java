import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    PalindromeChecker checker;

    @org.junit.Before
    public void setUp() throws Exception {
        checker = new PalindromeChecker();
    }

    @org.junit.Test
    public void testCase1() throws Exception {
        assertEquals(true, checker.check(""));
    }

    @org.junit.Test
    public void testCase2() throws Exception {
        assertEquals(true, checker.check("i"));
    }

    @org.junit.Test
    public void testCase3() throws Exception {
        assertEquals(false, checker.check("we"));
    }


    @org.junit.Test
    public void testCase4() throws Exception {
        assertEquals(false, checker.check("saw"));
    }

    @org.junit.Test
    public void testCase5() throws Exception {
        assertEquals(true, checker.check("wow"));
    }

    @org.junit.Test
    public void testCase6() throws Exception {
        assertEquals(true, checker.check("navan"));
    }

    @org.junit.Test
    public void testCase7() throws Exception {
        assertEquals(false, checker.check("sass"));
    }



}