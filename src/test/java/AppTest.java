import junit.framework.TestCase;

// 1. You must extend TestCase
public class AppTest extends TestCase {
    
    // 2. No @Test annotation here!
    // 3. The method name MUST start with "test" for it to run
    public void testSum() {
        assertEquals(5, 2 + 3);
    }
}