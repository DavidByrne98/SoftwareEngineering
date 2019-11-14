package nuigalway.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        Student s1 = new Student("Tom", 21, "1/1/1998", 1);
        assertEquals("Incorrect username!", "Tom\t21", s1.getUserName());
    }
}